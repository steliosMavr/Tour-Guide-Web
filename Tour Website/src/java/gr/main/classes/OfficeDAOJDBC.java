package gr.database.classes;

import gr.database.interfaces.OfficeDAO;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.Cars;
import gr.javabeans.MotorBikes;
import gr.javabeans.Office;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OfficeDAOJDBC extends DataAccessObject implements OfficeDAO {

    private static final String INSERT_INTO_OFFICE = "INSERT INTO office (name,address,telephone,area) VALUES (?,?,?,?)";
    private static final String INSERT_INTO_CARS = "INSERT INTO cars (lice_number,kv,passenger_sits,categorys,charge_per_day,increase_price,office_key) VALUES (?,?,?,?,?,?,?)";
    private static final String INSERT_INTO_MOTORBIKES = "INSERT INTO motorbikes(licen_number,moto_kv,moto_category,chargePerDay,increasePrice,office_keyy) VALUES (?,?,?,?,?,?)";
    private static final String TAKE_LAST_ID = "SELECT idoffice FROM office";
    private static final String TAKE_OFFICES_NAMES = "SELECT name FROM office";

    private static final String FIND_OFFICE_BY_NAME = "SELECT idoffice,name,address,telephone,area FROM office";

    private static final String FIND_ID_OFFICE = "SELECT idoffice,name FROM office";
    private static final String FIND_MOTORBIKES = "SELECT licen_number,moto_kv,moto_category,chargePerDay,increasePrice,office_keyy FROM motorbikes";
    private static final String FIND_CARS = "SELECT lice_number,kv,passenger_sits,categorys,charge_per_day,increase_price,office_key FROM cars";

    private ArrayList<MotorBikes> motorBikes;
    private ArrayList<Cars> carsList;

    private ArrayList<Office> officesNames;
    private ArrayList<Office> offices;
    private Connection conn;
    private PreparedStatement statement;
    private Statement stmt = null;
    private Office office;
    private MotorBikes moto;
    private Cars car;

    @Override
    public void officeInsert(Office office) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT_INTO_OFFICE);
            statement.setString(1, office.getOfficeName());
            statement.setString(2, office.getOfficeAddress());
            statement.setString(3, office.getOfficeTelephone());
            statement.setString(4, office.getArea());
            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void carInsert(ArrayList<Cars> cars) {
        int maxID = 0;
        try {
            conn = getConnection();
            statement = conn.prepareStatement(TAKE_LAST_ID);

            ResultSet rs = statement.executeQuery(TAKE_LAST_ID);

            while (rs.next()) {
                maxID = rs.getInt("idoffice");

            }

            for (Cars car : cars) {
                statement = conn.prepareStatement(INSERT_INTO_CARS);
                statement.setString(1, car.getLicenceNumber());
                statement.setString(2, car.getKv());
                statement.setString(3, car.getPassengerSits());
                statement.setString(4, car.getCategory());
                statement.setString(5, car.getChargePerDay());
                statement.setString(6, car.getIncreaseCharge());
                statement.setInt(7, maxID);
                statement.executeUpdate();

            }
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<Office> officeInformation() {
        officesNames = new ArrayList<Office>();
        Office office = new Office();
        try {
            conn = getConnection();
            statement = conn.prepareStatement(TAKE_OFFICES_NAMES);

            ResultSet rs = statement.executeQuery(TAKE_OFFICES_NAMES);

            while (rs.next()) {
                office = new Office();
                office.setOfficeName(rs.getString("name"));
                officesNames.add(office);

            }
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return officesNames;

    }

    @Override
    public void motorBikeInsert(ArrayList<MotorBikes> motorBike) {
        int maxID = 0;

        try {
            conn = getConnection();
            statement = conn.prepareStatement(TAKE_LAST_ID);

            ResultSet rs = statement.executeQuery(TAKE_LAST_ID);

            while (rs.next()) {
                maxID = rs.getInt("idoffice");

            }

            for (MotorBikes motorBike1 : motorBike) {
                statement = conn.prepareStatement(INSERT_INTO_MOTORBIKES);
                statement.setString(1, motorBike1.getMotoLicenceNumber());
                statement.setString(2, motorBike1.getMotoKv());
                statement.setString(3, motorBike1.getCategory());
                statement.setString(4, motorBike1.getChargePerDay());
                statement.setString(5, motorBike1.getIncreaseCharge());
                statement.setInt(6, maxID);
                statement.executeUpdate();

            }

            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void carInsertForExistedOff(String officeName, ArrayList<Cars> cars) {
        int officeId = 100;
        conn = getConnection();
        try {
            statement = conn.prepareStatement("SELECT idoffice FROM office WHERE name='" + officeName + "'");
            ResultSet rs = statement.executeQuery("SELECT idoffice FROM office WHERE name='" + officeName + "'");

            while (rs.next()) {
                officeId = rs.getInt("idoffice");
            }

            statement.close();
            for (Cars car : cars) {
                statement = conn.prepareStatement(INSERT_INTO_CARS);
                statement.setString(1, car.getLicenceNumber());
                statement.setString(2, car.getKv());
                statement.setString(3, car.getPassengerSits());
                statement.setString(4, car.getCategory());
                statement.setString(5, car.getChargePerDay());
                statement.setString(6, car.getIncreaseCharge());
                statement.setInt(7, officeId);
                statement.executeUpdate();

            }
            conn.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void motorBikeForExistedOff(String officeName, ArrayList<MotorBikes> motorBike) {
        int officeId = 100;
        conn = getConnection();
        try {
            statement = conn.prepareStatement("SELECT idoffice FROM office WHERE name='" + officeName + "'");
            ResultSet rs = statement.executeQuery("SELECT idoffice FROM office WHERE name='" + officeName + "'");

            while (rs.next()) {
                officeId = rs.getInt("idoffice");
            }

            statement.close();

            for (MotorBikes motorBike1 : motorBike) {
                statement = conn.prepareStatement(INSERT_INTO_MOTORBIKES);
                statement.setString(1, motorBike1.getMotoLicenceNumber());
                statement.setString(2, motorBike1.getMotoKv());
                statement.setString(3, motorBike1.getCategory());
                statement.setString(4, motorBike1.getChargePerDay());
                statement.setString(5, motorBike1.getIncreaseCharge());
                statement.setInt(6, officeId);
                statement.executeUpdate();

            }

            conn.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<Office> findOfficeByName(String officeArea) {
        officesNames = getOffices();
        offices = new ArrayList<Office>();
        for (int i = 0; i < officesNames.size(); i++) {
            if (officesNames.get(i).getArea().equals(officeArea)) {
                offices.add(officesNames.get(i));
            }

        }

        return offices;

    }

    @Override
    public ArrayList<MotorBikes> getMotorBikes(String officeName) {
        int id = -1;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_ID_OFFICE);

            while (rs.next()) {
                if (rs.getString("name").equals(officeName)) {

                    id = rs.getInt("idoffice");
                    break;

                }

            }

            stmt.close();

            stmt = conn.createStatement();
            ResultSet rs2 = stmt.executeQuery(FIND_MOTORBIKES);
            motorBikes = new ArrayList<MotorBikes>();

            while (rs2.next()) {

                if (rs2.getString("office_keyy").equals(Integer.toString(id))) {
                    moto = new MotorBikes();
                    moto.setMotoLicenceNumber(rs2.getString("licen_number"));
                    moto.setMotoKv(rs2.getString("moto_kv"));
                    moto.setChargePerDay(rs2.getString("chargePerDay"));
                    moto.setIncreaseCharge(rs2.getString("increasePrice"));
                    moto.setCategory(rs2.getString("moto_category"));
                    motorBikes.add(moto);
                }

            }

            conn.close();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motorBikes;

    }

    @Override
    public ArrayList<Cars> getCars(String officeName) {
        int id = -1;

        conn = getConnection();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_ID_OFFICE);

            while (rs.next()) {
                if (rs.getString("name").equals(officeName)) {

                    id = rs.getInt("idoffice");
                    break;

                }

            }

            stmt.close();

            stmt = conn.createStatement();
            ResultSet rs2 = stmt.executeQuery(FIND_CARS);
            carsList = new ArrayList<Cars>();

            while (rs2.next()) {

                if (rs2.getString("office_key").equals(Integer.toString(id))) {
                    car = new Cars();
                    car.setKv(rs2.getString("kv"));
                    car.setLicenceNumber(rs2.getString("lice_number"));
                    car.setPassengerSits(rs2.getString("passenger_sits"));
                    car.setIncreaseCharge(rs2.getString("increase_price"));
                    car.setChargePerDay(rs2.getString("charge_per_day"));
                    car.setCategory(rs2.getString("categorys"));
                    carsList.add(car);
                }

            }
            conn.close();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carsList;

    }

    @Override
    public ArrayList<Office> getOffices() {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_OFFICE_BY_NAME);
            officesNames = new ArrayList<Office>();

            while (rs.next()) {

                office = new Office();
                office.setId(rs.getString("idoffice"));
                office.setOfficeName(rs.getString("name"));
                office.setOfficeAddress(rs.getString("address"));
                office.setOfficeTelephone(rs.getString("telephone"));
                office.setArea(rs.getString("area"));
                officesNames.add(office);

            }
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(OfficeDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return officesNames;
    }

}
