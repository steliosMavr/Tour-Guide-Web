package gr.database.classes;

import gr.database.interfaces.MesuemDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Mesuem;
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

public class MesuemDAOJDBC extends DataAccessObject implements MesuemDAO {

    private static final String INSERT = "INSERT INTO mesuem(mesuemName,mesuemAddress,mesuemPrice,mesuemLocation,mesuemTelephone,image) VALUES(?,?,?,?,?,?)";
    private static final String getRecords = "SELECT mesuemName,mesuemAddress,mesuemPrice,mesuemLocation,mesuemTelephone,image FROM mesuem";

    private Mesuem mesuem;

    private ArrayList<Mesuem> mesuemList;
    private ArrayList<Mesuem> mesuemList2;
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;
    private InputStream stream;

    @Override
    public void mesuemInsert(Mesuem mesuem) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT);

            statement.setString(1, mesuem.getMesuemName());
            statement.setString(2, mesuem.getMesuemAddress());
            statement.setString(3, mesuem.getPrice());
            statement.setString(4, mesuem.getLocation());
            statement.setString(5, mesuem.getTelephone());
            stream = mesuem.getImage().getInputStream();
            statement.setBlob(6, stream);

            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(MesuemDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MesuemDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Mesuem> getMesuemByLocation(String location) {
        mesuemList2 = new ArrayList<Mesuem>();
        mesuemList = getMesuem();

        for (int i = 0; i < mesuemList.size(); i++) {

            if (mesuemList.get(i).getLocation().equals(location)) {
                mesuemList2.add(mesuemList.get(i));
            }

        }

        return mesuemList2;

    }

    @Override
    public ArrayList<Mesuem> getMesuem() {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(getRecords);
            mesuemList = new ArrayList<Mesuem>();
            while (rs.next()) {
                mesuem = new Mesuem();
                mesuem.setMesuemName(rs.getString("mesuemName"));
                mesuem.setMesuemAddress(rs.getString("mesuemAddress"));
                mesuem.setLocation(rs.getString("mesuemLocation"));
                mesuem.setPrice(rs.getString("mesuemPrice"));
                mesuem.setTelephone(rs.getString("mesuemTelephone"));
                Blob blob = rs.getBlob("image");

                byte data[] = blob.getBytes(1, (int) blob.length());

                byte[] encodeBase64 = Base64.encodeBase64(data);
                String base64Encoded = new String(encodeBase64, "UTF-8");

                mesuem.setImgArray(base64Encoded);
                mesuemList.add(mesuem);

            }

            conn.close();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(MesuemDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MesuemDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesuemList;

    }

}
