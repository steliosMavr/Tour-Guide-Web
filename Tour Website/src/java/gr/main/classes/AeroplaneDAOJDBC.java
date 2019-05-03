package gr.database.classes;

import gr.database.interfaces.AeroplaneDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Aeroplane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AeroplaneDAOJDBC extends DataAccessObject implements AeroplaneDAO {

    private static final String INSERT = "INSERT INTO aeroplane(companyName,airportName,arrivalDay,arrivalTime,departureDay,departureTime,airportDestinationName,fromL,toL,price) VALUES(?,?,?,?,?,?,?,?,?,?)";
    private static final String getRoutes = "SELECT companyName,airportName,arrivalDay,arrivalTime,departureDay,departureTime,airportDestinationName,fromL,toL,price FROM aeroplane";

    private Aeroplane aeroplane;
    private ArrayList<Aeroplane> aeroplaneList_2;
    private ArrayList<Aeroplane> aeroplaneList;
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;

    @Override
    public void insert(Aeroplane aeroplane) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT);

            statement.setString(1, aeroplane.getCompanyName());
            statement.setString(2, aeroplane.getAirportName());
            statement.setString(3, aeroplane.getArrivalDay());
            statement.setString(4, aeroplane.getArrivalTime());
            statement.setString(5, aeroplane.getDepartureDay());
            statement.setString(6, aeroplane.getDepartureTime());
            statement.setString(7, aeroplane.getDestinationAirportNamel());
            statement.setString(8, aeroplane.getFromLocation());
            statement.setString(9, aeroplane.getToLocation());
            statement.setString(10, aeroplane.getPrice());

            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(AeroplaneDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Aeroplane> getRecordsByDeparture(String from, String to, String departureDate) {
        aeroplaneList = new ArrayList();
        aeroplaneList_2 = new ArrayList();
        aeroplaneList = getRecords();
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        Date userDepartureDate = null;
        try {
            userDepartureDate = d.parse(departureDate);
            
        } catch (ParseException ex) {
            Logger.getLogger(AeroplaneDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < aeroplaneList.size(); i++) {
            Date databasesDepartureDate;
            try {

                databasesDepartureDate = d.parse(aeroplaneList.get(i).getDepartureDay());
                if (aeroplaneList.get(i).getFromLocation().equals(from) && aeroplaneList.get(i).getToLocation().equals(to) && userDepartureDate.equals(databasesDepartureDate)) {
                    System.out.println("sdasdasda");
                    aeroplaneList_2.add(aeroplaneList.get(i));
                }
            } catch (ParseException ex) {
                Logger.getLogger(AeroplaneDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return aeroplaneList_2;
                
    }

    @Override
    public ArrayList<Aeroplane> getRecords() {
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(getRoutes);
            aeroplaneList = new ArrayList();
            while (rs.next()) {
                aeroplane = new Aeroplane();
                aeroplane.setCompanyName(rs.getString("companyName"));
                aeroplane.setAirportName(rs.getString("airportName"));
                aeroplane.setArrivalDay(rs.getString("arrivalDay"));
                aeroplane.setArrivalTime(rs.getString("arrivalTime"));
                aeroplane.setDepartureDay(rs.getString("departureDay"));
                aeroplane.setDepartureTime(rs.getString("departureTime"));
                aeroplane.setDestinationAirportNamel(rs.getString("airportDestinationName"));
                aeroplane.setToLocation(rs.getString("toL"));
                aeroplane.setFromLocation(rs.getString("fromL"));
                aeroplane.setPrice(rs.getString("price"));
                aeroplaneList.add(aeroplane);
            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(AeroplaneDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aeroplaneList;

    }

}
