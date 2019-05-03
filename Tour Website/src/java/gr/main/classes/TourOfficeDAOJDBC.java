package gr.database.classes;

import gr.database.interfaces.TourOfficeDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Office;
import gr.javabeans.TourOffice;
import gr.javabeans.Tours;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TourOfficeDAOJDBC extends DataAccessObject implements TourOfficeDAO {

    private static final String INSERT = "INSERT INTO touroffice(officeName,officeAddress,officeTelephone,area) VALUES(?,?,?,?)";
    private static final String FIND_TOUROFFICE_BY_NAME = "SELECT officeName,officeAddress,officeTelephone,area FROM touroffice";

    private static final String tourOfficeInfo = "SELECT officeName FROM touroffice";
    private static final String TAKE_LAST_ID = "SELECT idtouroffice FROM touroffice";
    private static final String TAKE_NAME_ID = "SELECT idtouroffice,officeName FROM touroffice";
    private static final String INSERT_INTO_TOURS = "INSERT INTO tour(destination,beggining,destinationTime,arrivalTime,numberOfPeople,price,discount,tourofficeId)  VALUES(?,?,?,?,?,?,?,?)";
    private static final String ΤΑΚΕ_TOURS = "SELECT destination,beggining,destinationTime,arrivalTime,numberOfPeople,price,discount,tourofficeId FROM tour";
    private Connection conn;
    private PreparedStatement statement;
    private ArrayList<TourOffice> tourOfficesNames;
    private ArrayList<TourOffice> tourOffices;
    private ArrayList<Tours> toursList;
    private TourOffice tourOffice;
    private Tours tour;
    private Statement stmt = null;

    @Override
    public void insert(TourOffice tourOffice) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT);

            statement.setString(1, tourOffice.getOfficeName());
            statement.setString(2, tourOffice.getOfficeAddress());
            statement.setString(3, tourOffice.getOfficeTelephone());
            statement.setString(4, tourOffice.getArea());

            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void toursInsert(ArrayList<Tours> tours) {
        int maxID = 0;
        conn = getConnection();
        try {
            statement = conn.prepareStatement(TAKE_LAST_ID);
            ResultSet rs = statement.executeQuery(TAKE_LAST_ID);

            while (rs.next()) {
                maxID = rs.getInt("idtouroffice");

            }

            for (Tours tour : tours) {

                statement = conn.prepareStatement(INSERT_INTO_TOURS);
                statement.setString(1, tour.getDestination());
                statement.setString(2, tour.getBeggining());
                statement.setString(3, tour.getDestinationTime());
                statement.setString(4, tour.getArrivalTime());
                statement.setString(5, tour.getNumberOfPeople());
                statement.setString(6, tour.getPrice());
                statement.setString(7, tour.getDiscount());
                statement.setInt(8, maxID);
                statement.executeUpdate();

            }
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<TourOffice> tourOfficeInfo() {
        tourOfficesNames = new ArrayList<TourOffice>();
        tourOffice = new TourOffice();
        conn = getConnection();
        try {
            statement = conn.prepareStatement(tourOfficeInfo);
            ResultSet rs = statement.executeQuery(tourOfficeInfo);

            while (rs.next()) {

                tourOffice = new TourOffice();
                tourOffice.setOfficeName(rs.getString("officeName"));
                tourOfficesNames.add(tourOffice);

            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tourOfficesNames;

    }

    @Override
    public void insertTourForExistedOffice(String officeName, ArrayList<Tours> tour) {

        int officeId = 100;
        conn = getConnection();

        try {
            statement = conn.prepareStatement("SELECT idtouroffice FROM touroffice WHERE officeName='" + officeName + "'");
            ResultSet rs = statement.executeQuery("SELECT idtouroffice FROM touroffice WHERE officeName='" + officeName + "'");

            while (rs.next()) {
                officeId = rs.getInt("idtouroffice");
            }

            for (Tours tour1 : tour) {
                statement = conn.prepareStatement(INSERT_INTO_TOURS);
                statement.setString(1, tour1.getDestination());
                statement.setString(2, tour1.getBeggining());
                statement.setString(3, tour1.getDestinationTime());
                statement.setString(4, tour1.getArrivalTime());
                statement.setString(5, tour1.getNumberOfPeople());
                statement.setString(6, tour1.getPrice());
                statement.setString(7, tour1.getDiscount());
                statement.setInt(8, officeId);
                statement.executeUpdate();

            }
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<TourOffice> findTourOfficeByName(String area) {
        tourOfficesNames = getOffices();
        tourOffices = new ArrayList<TourOffice>();
        for (int i = 0; i < tourOfficesNames.size(); i++) {

            if (tourOfficesNames.get(i).getArea().equals(area)) {

                tourOffices.add(tourOfficesNames.get(i));

            }

        }
        return tourOffices;

    }

    @Override
    public ArrayList<Tours> getTours(String officeName) {
        int id = -1;
        conn = getConnection();
        try {
            statement = conn.prepareStatement(TAKE_NAME_ID);
            ResultSet rs = statement.executeQuery(TAKE_NAME_ID);

            while (rs.next()) {

                if (rs.getString("officeName").equals(officeName)) {
                    id = (rs.getInt("idtouroffice"));
                    break;
                }

            }

            stmt.close();
            System.out.println(id);
            stmt = conn.createStatement();
            ResultSet rs2 = stmt.executeQuery(ΤΑΚΕ_TOURS);
            toursList = new ArrayList<Tours>();

            while (rs2.next()) {

                if (rs2.getString("tourofficeId").equals(Integer.toString(id))) {
                  
                    tour = new Tours();
                    tour.setDestination(rs2.getString("destination"));
                    tour.setBeggining(rs2.getString("beggining"));
                    tour.setArrivalTime(rs2.getString("arrivalTime"));
                    tour.setDestinationTime(rs2.getString("destinationTime"));
                    tour.setDiscount(rs2.getString("discount"));
                    tour.setNumberOfPeople(rs2.getString("numberOfPeople"));
                    tour.setPrice(rs2.getString("price"));
                    toursList.add(tour);
                }

            }
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return toursList;

    }

    @Override
    public ArrayList<TourOffice> getOffices() {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_TOUROFFICE_BY_NAME);
            tourOfficesNames = new ArrayList<TourOffice>();

            while (rs.next()) {

                tourOffice = new TourOffice();
                tourOffice.setOfficeName(rs.getString("officeName"));
                tourOffice.setOfficeAddress(rs.getString("officeAddress"));
                tourOffice.setOfficeTelephone(rs.getString("officeTelephone"));
                tourOffice.setArea(rs.getString("area"));
                tourOfficesNames.add(tourOffice);

            }
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tourOfficesNames;

    }

    public ArrayList<TourOffice> getTourOfficeByArea(String area) {
       
        tourOfficesNames = getOffices();
        
        tourOffices = new ArrayList<TourOffice>();
        for (int i = 0; i < tourOfficesNames.size(); i++) {
            
            if (tourOfficesNames.get(i).getArea().equals(area)) {
               
                tourOffices.add(tourOfficesNames.get(i));
            }
        }
        return tourOffices;

    }

    @Override

    public ArrayList<Tours> getAllTours() {
        conn = getConnection();
        try {

            stmt = conn.createStatement();
            ResultSet rs2 = stmt.executeQuery(ΤΑΚΕ_TOURS);
            toursList = new ArrayList<Tours>();
            while (rs2.next()) {

                tour = new Tours();
                tour.setDestination(rs2.getString("destination"));
                tour.setBeggining(rs2.getString("beggining"));
                tour.setArrivalTime(rs2.getString("arrivalTime"));
                tour.setDestinationTime(rs2.getString("destinationTime"));
                tour.setDiscount(rs2.getString("discount"));
                tour.setNumberOfPeople(rs2.getString("numberOfPeople"));
                tour.setPrice(rs2.getString("price"));
                toursList.add(tour);

            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TourOfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toursList;

    }

}
