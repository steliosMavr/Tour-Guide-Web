package gr.database.classes;

import gr.database.interfaces.LandMarkDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.LandMark;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.util.codec.binary.Base64;

public class LandMarkDAOJDBC extends DataAccessObject implements LandMarkDAO {

    private static final String INSERT = "INSERT INTO landmark(landmarkName,landmarkLocation,landMarkTelephone,landMarkPrice,image) VALUES(?,?,?,?,?)";
    private static final String getRecords = "SELECT landmarkName,landmarkLocation,landMarkTelephone,landMarkPrice,image FROM landmark";
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;
    private InputStream stream;
    private LandMark landMark;
    private ArrayList<LandMark> landMarkList;
    private ArrayList<LandMark> landMarkList2;

    @Override
    public void insert(LandMark landMark) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT);
            statement.setString(1, landMark.getLandmarkName());
            statement.setString(2, landMark.getLocation());
            statement.setString(3, landMark.getTelephone());
            statement.setString(4, landMark.getPrice());
            stream = landMark.getImage().getInputStream();
            statement.setBlob(5, stream);

            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(LandMarkDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LandMarkDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<LandMark> getRecords() {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(getRecords);
            landMarkList = new ArrayList<LandMark>();
            while (rs.next()) {
                landMark = new LandMark();
                landMark.setLandmarkName(rs.getString("landmarkName"));
                landMark.setLocation(rs.getString("landmarkLocation"));
                landMark.setTelephone(rs.getString("landMarkTelephone"));
                landMark.setPrice(rs.getString("landMarkPrice"));
                Blob blob = rs.getBlob("image");
                byte data[] = blob.getBytes(1, (int) blob.length());
                byte[] encodeBase64 = Base64.encodeBase64(data);
                String base64Encoded = new String(encodeBase64, "UTF-8");
                landMark.setImgArray(base64Encoded);
                landMarkList.add(landMark);

            }

            conn.close();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(MesuemDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(LandMarkDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return landMarkList;

    }

    public ArrayList<LandMark> getRecordsByLocation(String location) {
        landMarkList = getRecords();
        landMarkList2 = new ArrayList<LandMark>();

        for (int i = 0; i < landMarkList.size(); i++) {
            if (landMarkList.get(i).getLocation().equals(location)) {
                landMarkList2.add(landMarkList.get(i));
            }

        }
        return landMarkList2;

    }

}
