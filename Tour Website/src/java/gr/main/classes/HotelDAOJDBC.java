package gr.database.classes;

import gr.database.interfaces.HotelDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Hotels;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.util.codec.binary.Base64;
import sun.misc.BASE64Encoder;

public class HotelDAOJDBC extends DataAccessObject implements HotelDAO {

    private static final String INSERT = "INSERT INTO hotels(hotelName,hotelAddress,hotelCategory,hotelTelephone,hotelNumber,hotelRoomCategory,image,hotelRoomPrice,area,monoklina,diklina,perigrafi) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SHOW = "SELECT idHotels,hotelName,hotelAddress,hotelCategory,hotelTelephone,hotelNumber,hotelRoomCategory,image,hotelRoomPrice,area,monoklina,diklina,perigrafi FROM hotels";

    private ArrayList<Hotels> hotelList;
    private ArrayList<Hotels> hotelList2;
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;
    private Hotels hotel;
    private InputStream stream;

    public void getMetadata() throws SQLException {
        conn = getConnection();
        DatabaseMetaData meta = conn.getMetaData();
        System.out.println("info:" + meta.getUserName());
    }

    @Override
    public void hotelInsert(Hotels hotel) {
        try {
            conn = getConnection();

            statement = conn.prepareStatement(INSERT);
            statement.executeQuery("SET NAMES 'UTF8'");
            statement.executeQuery("SET CHARACTER SET 'UTF8'");
            statement.setString(1, hotel.getName());
            statement.setString(2, hotel.getAddress());
            statement.setString(3, hotel.getCategory());
            statement.setString(4, hotel.getTelephone());
            statement.setString(5, hotel.getNumber());
            statement.setString(6, hotel.getRoomCategory());
            stream = hotel.getImage().getInputStream();
            statement.setBlob(7, stream);
            statement.setString(8, hotel.getPrice());
            statement.setString(9, hotel.getArea());
            statement.setString(10, hotel.getMonoklina());
            statement.setString(11, hotel.getDiklina());
            System.out.println("asdasds"+hotel.getPerigrafi());
            statement.setString(12, hotel.getPerigrafi());
            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(HotelDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(HotelDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Hotels findHotelByName(String hotelName) throws UnsupportedEncodingException {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SHOW);

            while (rs.next()) {
                if (rs.getString("hotelName").equals(hotelName)) {
                    hotel = new Hotels();
                    hotel.setId(rs.getInt("idHotels"));
                    hotel.setName(rs.getString("hotelName"));
                    hotel.setAddress(rs.getString("hotelAddress"));
                    hotel.setCategory(rs.getString("hotelCategory"));
                    hotel.setTelephone(rs.getString("hotelTelephone"));
                    hotel.setNumber(rs.getString("hotelNumber"));
                    hotel.setRoomCategory(rs.getString("hotelRoomCategory"));
                    hotel.setPrice(rs.getString("hotelRoomPrice"));
                    hotel.setArea(rs.getString("area"));
                    hotel.setMonoklina(rs.getString("monoklina"));
                    hotel.setDiklina(rs.getString("diklina"));
                    hotel.setPerigrafi(rs.getString("perigrafi"));

                    Blob blob = rs.getBlob("image");
                    byte data[] = blob.getBytes(1, (int) blob.length());

                    byte[] encodeBase64 = Base64.encodeBase64(data);
                    String base64Encoded = new String(encodeBase64, "UTF-8");

                    hotel.setImgArray(base64Encoded);
                    break;
                }

            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(HotelDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hotel;
    }

    @Override
    public ArrayList<Hotels> hotelRecords() {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SHOW);
            hotelList = new ArrayList<Hotels>();
            while (rs.next()) {
                hotel = new Hotels();
                hotel.setId(rs.getInt("idHotels"));
                hotel.setName(rs.getString("hotelName"));
                hotel.setAddress(rs.getString("hotelAddress"));
                hotel.setCategory(rs.getString("hotelCategory"));
                hotel.setTelephone(rs.getString("hotelTelephone"));
                hotel.setNumber(rs.getString("hotelNumber"));
                hotel.setRoomCategory(rs.getString("hotelRoomCategory"));
                hotel.setPrice(rs.getString("hotelRoomPrice"));
                hotel.setArea(rs.getString("area"));
                hotel.setMonoklina(rs.getString("monoklina"));
                hotel.setDiklina(rs.getString("diklina"));
                hotel.setPerigrafi(rs.getString("perigrafi"));

                Blob blob = rs.getBlob("image");
                byte data[] = blob.getBytes(1, (int) blob.length());

                byte[] encodeBase64 = Base64.encodeBase64(data);
                String base64Encoded = new String(encodeBase64, "UTF-8");

                hotel.setImgArray(base64Encoded);

                hotelList.add(hotel);

            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HotelDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(HotelDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hotelList;
    }

    public ArrayList<Hotels> findHotelsByCategoryAndArea(String area, String category) {

        hotelList = new ArrayList<Hotels>();
        hotelList2 = new ArrayList<Hotels>();

        hotelList = hotelRecords();

        for (Hotels hList : hotelList) {
            if (hList.getArea().equals(area) && hList.getCategory().equals(category)) {
                hotel = new Hotels();
                hotel = new Hotels();
                hotel.setId(hList.getId());
                hotel.setName(hList.getName());
                hotel.setAddress(hList.getAddress());
                hotel.setCategory(hList.getCategory());
                hotel.setTelephone(hList.getTelephone());
                hotel.setNumber(hList.getNumber());
                hotel.setRoomCategory(hList.getRoomCategory());
                hotel.setPrice(hList.getPrice());
                hotel.setArea(hList.getArea());
                hotel.setMonoklina(hList.getMonoklina());
                hotel.setDiklina(hList.getDiklina());
                hotel.setPerigrafi(hList.getPerigrafi());
                hotel.setImgArray(hList.getImgArray());

                hotelList2.add(hotel);

            }
        }
        return hotelList2;

    }

}
