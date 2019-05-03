package gr.database.classes;

import gr.database.interfaces.ShipDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Ships;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShipDAOJDBC extends DataAccessObject implements ShipDAO {

    private static final String INSERT = "INSERT INTO ship(companyName,departureShipFromPort,departureTime,departureDay,shipDestination,arrivalTime,arrivalDay,fromLocation,toLocation,price) VALUES(?,?,?,?,?,?,?,?,?,?)";
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;
    private ArrayList<Ships> shipList;
    private Ships ship;
    private static final String RECORDS = "SELECT companyName,departureShipFromPort,departureTime,departureDay,shipDestination,arrivalTime,arrivalDay,fromLocation,toLocation,price FROM ship";

    @Override
    public void insert(Ships ship) {
        conn = getConnection();
        try {
            statement = conn.prepareStatement(INSERT);
            statement.setString(1, ship.getCompanyName());
            statement.setString(2, ship.getDeparturePortName());
            statement.setString(3, ship.getDepartureTime());
            statement.setString(4, ship.getDepartureDay());
            statement.setString(5, ship.getDestinationPortName());
            statement.setString(6, ship.getArrivalTime());
            statement.setString(7, ship.getArrivalDay());
            statement.setString(8, ship.getFromLocation());
            statement.setString(9, ship.getToLocation());
            statement.setString(10, ship.getPrice());

            statement.executeUpdate();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ShipDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @Override
    public ArrayList<Ships> getRecords() {

        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(RECORDS);
            shipList = new ArrayList();
            while (rs.next()) {
                ship = new Ships();
                ship.setCompanyName(rs.getString("companyName"));
                ship.setDeparturePortName(rs.getString("departureShipFromPort"));
                ship.setArrivalDay(rs.getString("arrivalDay"));
                ship.setArrivalTime(rs.getString("arrivalTime"));
                ship.setDepartureDay(rs.getString("departureDay"));
                ship.setDepartureTime(rs.getString("departureTime"));
                ship.setDestinationPortName(rs.getString("shipDestination"));
                ship.setToLocation(rs.getString("toLocation"));
                ship.setFromLocation(rs.getString("fromLocation"));
                ship.setPrice(rs.getString("price"));
                shipList.add(ship);
            }
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(AeroplaneDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shipList;

    }

}
