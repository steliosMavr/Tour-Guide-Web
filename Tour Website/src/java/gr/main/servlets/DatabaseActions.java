package gr.database.servlets;

import gr.database.classes.AeroplaneDAOJDBC;
import gr.database.classes.HotelDAOJDBC;
import gr.database.classes.LandMarkDAOJDBC;
import gr.database.classes.MesuemDAOJDBC;
import gr.database.classes.OfficeDAOJDBC;
import gr.database.classes.ShipDAOJDBC;
import gr.database.classes.TourOfficeDAOJDBC;
import gr.javabeans.Aeroplane;
import gr.javabeans.Cars;
import gr.javabeans.Hotels;
import gr.javabeans.LandMark;
import gr.javabeans.Mesuem;
import gr.javabeans.MotorBikes;
import gr.javabeans.Office;
import gr.javabeans.Ships;
import gr.javabeans.TourOffice;
import gr.javabeans.Tours;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseActions extends HttpServlet {

    private ArrayList<Hotels> hotelList;
    private ArrayList<Office> officeList;
    private ArrayList<Tours> TourList;
    private ArrayList<Cars> carlList;
    private ArrayList<MotorBikes> MotorBikeslList;
    private ArrayList<TourOffice> tourOfficeList;

    private HotelDAOJDBC hotelDatabaseObject;
    private OfficeDAOJDBC officeDatabaseObject;
    private MesuemDAOJDBC mesuemDatabaseObject;
    private LandMarkDAOJDBC landMarkDatabaseObject;
    private AeroplaneDAOJDBC aeroplaneDatabaseObject;
    private ShipDAOJDBC shipDatabaseObject;
    private TourOfficeDAOJDBC tourOfficeDatabaseObject;

    private Hotels hotel;
    private Office office;
    private Cars car;
    private Mesuem mesuem;
    private LandMark landMark;
    private MotorBikes motorBike;
    private Aeroplane aeroplane;
    private Ships ship;
    private TourOffice tourOffice;
    private Tours tour;

    @Override
    public void init() {
        hotelDatabaseObject = new HotelDAOJDBC();
        officeDatabaseObject = new OfficeDAOJDBC();
        mesuemDatabaseObject = new MesuemDAOJDBC();
        landMarkDatabaseObject = new LandMarkDAOJDBC();
        aeroplaneDatabaseObject = new AeroplaneDAOJDBC();
        shipDatabaseObject = new ShipDAOJDBC();
        tourOfficeDatabaseObject = new TourOfficeDAOJDBC();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getParameter("action").equals("existed_tour_office_update")) {

            String destination[] = request.getParameterValues("tour_destination");
            String tourBeggining[] = request.getParameterValues("tour_beginning");
            String arrivalTime[] = request.getParameterValues("time_arrival");
            String destinationTime[] = request.getParameterValues("time_destination");
            String price[] = request.getParameterValues("price");

            String numberOfPeople[] = request.getParameterValues("nubmer_of_people");
            String priceDiscount[] = request.getParameterValues("price_cut");

            TourList = new ArrayList<Tours>();
            for (int i = 0; i < destination.length; i++) {
                tour = new Tours();
                tour.setArrivalTime(arrivalTime[i]);
                tour.setBeggining(tourBeggining[i]);
                tour.setDestination(destination[i]);
                tour.setDiscount(priceDiscount[i]);
                tour.setNumberOfPeople(numberOfPeople[i]);
                tour.setPrice(price[i]);
                tour.setDestinationTime(destinationTime[i]);
                TourList.add(tour);
            }

            tourOfficeDatabaseObject.insertTourForExistedOffice(request.getParameter("tour_office_selection"), TourList);

        }

        if (request.getParameter("action").equals("tour_office_update")) {

            tourOffice = new TourOffice();

            tourOffice.setOfficeName(request.getParameter("officeName"));
            tourOffice.setOfficeAddress(request.getParameter("officeAddress"));
            tourOffice.setOfficeTelephone(request.getParameter("officeTelephone"));
            tourOffice.setArea(request.getParameter("area"));
            tourOfficeDatabaseObject.insert(tourOffice);

            String destination[] = request.getParameterValues("tour_destination");
            String tourBeggining[] = request.getParameterValues("tour_beginning");
            String arrivalTime[] = request.getParameterValues("time_arrival");
            String destinationTime[] = request.getParameterValues("time_destination");
            String price[] = request.getParameterValues("price");

            String numberOfPeople[] = request.getParameterValues("nubmer_of_people");
            String priceDiscount[] = request.getParameterValues("price_cut");

            TourList = new ArrayList<Tours>();

            for (int i = 0; i < destination.length; i++) {
                tour = new Tours();
                tour.setArrivalTime(arrivalTime[i]);
                tour.setBeggining(tourBeggining[i]);
                tour.setDestination(destination[i]);
                tour.setDiscount(priceDiscount[i]);
                tour.setNumberOfPeople(numberOfPeople[i]);
                tour.setPrice(price[i]);
                tour.setDestinationTime(destinationTime[i]);
                TourList.add(tour);
            }

            tourOfficeDatabaseObject.toursInsert(TourList);

        }

        if (request.getParameter("action").equals("update_ships")) {
            ship = new Ships();

            ship.setArrivalDay(request.getParameter("arrivalDay"));
            ship.setArrivalTime(request.getParameter("arrivalTime"));
            ship.setCompanyName(request.getParameter("companyName"));
            ship.setDepartureDay(request.getParameter("departureDay"));
            ship.setDeparturePortName(request.getParameter("departureShipFromPort"));
            ship.setDepartureTime(request.getParameter("departureTime"));
            ship.setDestinationPortName(request.getParameter("shipDestination"));
            ship.setFromLocation(request.getParameter("fromLocation"));
            ship.setToLocation(request.getParameter("toLocation"));
            ship.setPrice(request.getParameter("price"));

            shipDatabaseObject.insert(ship);

        }

        if (request.getParameter("action").equals("update_aeroplane")) {

            aeroplane = new Aeroplane();

            aeroplane.setCompanyName(request.getParameter("companyName"));
            aeroplane.setAirportName(request.getParameter("airportName"));
            aeroplane.setArrivalDay(request.getParameter("arrivalDay"));
            aeroplane.setArrivalTime(request.getParameter("arrivalTime"));
            aeroplane.setDepartureDay(request.getParameter("departureDay"));
            aeroplane.setDepartureTime(request.getParameter("departureTime"));
            aeroplane.setDestinationAirportNamel(request.getParameter("airportDestinationName"));
            aeroplane.setFromLocation(request.getParameter("from"));
            aeroplane.setToLocation(request.getParameter("to"));
            aeroplane.setPrice(request.getParameter("price"));

            aeroplaneDatabaseObject.insert(aeroplane);

        }

        if (request.getParameter("action").equals("update_landmark")) {

            landMark = new LandMark();

            landMark.setLandmarkName(request.getParameter("landMarkName"));
            landMark.setLocation(request.getParameter("landMarkLocation"));
            landMark.setPrice(request.getParameter("landMarkPrice"));
            landMark.setTelephone(request.getParameter("landMarkTelephone"));
            landMark.setImage(request.getPart("image"));

            landMarkDatabaseObject.insert(landMark);

        }

        if (request.getParameter("action").equals("update_mesuem")) {
            mesuem = new Mesuem();

            mesuem.setMesuemName(request.getParameter("mesuemName"));
            mesuem.setMesuemAddress(request.getParameter("mesuemAddress"));
            mesuem.setTelephone(request.getParameter("mesuemTelephone"));
            mesuem.setLocation(request.getParameter("mesuemLocation"));
            mesuem.setPrice(request.getParameter("mesuemPrice"));
            mesuem.setImage(request.getPart("image"));

            mesuemDatabaseObject.mesuemInsert(mesuem);

        }

        if (request.getParameter("action").equals("existed_office_update")) {

            String officeName = request.getParameter("existing_office");

            if (request.getParameterValues("licence_car_number") != null) {
                String licence_car_number[] = request.getParameterValues("licence_car_number");
                String kv[] = request.getParameterValues("kv");
                String passenger_sits[] = request.getParameterValues("passenger_sits");
                String charge_per_day[] = request.getParameterValues("charge_per_day");
                String increase_charge[] = request.getParameterValues("price_car_plus");
                String category[] = request.getParameterValues("selection");

                carlList = new ArrayList<Cars>();
                for (int i = 0; i < licence_car_number.length; i++) {
                    car = new Cars();
                    car.setLicenceNumber(licence_car_number[i]);
                    car.setCategory(category[i]);
                    car.setChargePerDay(charge_per_day[i]);
                    car.setIncreaseCharge(increase_charge[i]);
                    car.setKv(kv[i]);
                    car.setPassengerSits(passenger_sits[i]);
                    carlList.add(car);
                }

                officeDatabaseObject.carInsertForExistedOff(officeName, carlList);

            }

            if (request.getParameterValues("lice_moto") != null) {
                String licenceMotorNumber[] = request.getParameterValues("lice_moto");
                String motoKv[] = request.getParameterValues("moto_kv");
                String motoCategory[] = request.getParameterValues("moto_selection");
                String motoChargePerDay[] = request.getParameterValues("moto_charge");
                String motoIncreasePrice[] = request.getParameterValues("moto_price_Car_plus");

                MotorBikeslList = new ArrayList<MotorBikes>();

                for (int i = 0; i < licenceMotorNumber.length; i++) {
                    motorBike = new MotorBikes();
                    motorBike.setMotoLicenceNumber(licenceMotorNumber[i]);
                    motorBike.setMotoKv(motoKv[i]);
                    motorBike.setCategory(motoCategory[i]);
                    motorBike.setChargePerDay(motoChargePerDay[i]);
                    motorBike.setIncreaseCharge(motoIncreasePrice[i]);
                    MotorBikeslList.add(motorBike);
                }
                officeDatabaseObject.motorBikeForExistedOff(officeName, MotorBikeslList);
            }

        }

        if (request.getParameter("action").equals("load")) {
            officeList = new ArrayList<Office>();
            officeList = officeDatabaseObject.officeInformation();

            tourOfficeList = new ArrayList<TourOffice>();
            tourOfficeList = tourOfficeDatabaseObject.tourOfficeInfo();

            request.setAttribute("officeInfo", officeList);
            request.setAttribute("tourOfficeInfo", tourOfficeList);

            request.getRequestDispatcher("DatabaseUpdate.jsp").forward(request, response);

        }

        if (request.getParameter("action").equals("show")) {

            hotelList = new ArrayList<Hotels>();
            hotelList = hotelDatabaseObject.hotelRecords();

            request.setAttribute("hotelList", hotelList);
            request.getRequestDispatcher("DatabaseShowPanel.jsp").forward(request, response);
        }

        if (request.getParameter("action").equals("update")) {
            request.setCharacterEncoding("UTF-8");

            
            hotel = new Hotels();
            hotel.setName(request.getParameter("hotelName"));
            hotel.setAddress(request.getParameter("hotelAddress"));
            hotel.setCategory(request.getParameter("hotelCategory"));
            hotel.setTelephone(request.getParameter("hotelTelephone"));
            hotel.setNumber(request.getParameter("hotelNumber"));
            hotel.setPrice(request.getParameter("hotelRoomPrice"));
            hotel.setRoomCategory(request.getParameter("hotelRoomCategory"));
            hotel.setArea(request.getParameter("area"));
            hotel.setMonoklina(request.getParameter("monoklina"));
            hotel.setDiklina(request.getParameter("diklina"));
            hotel.setPerigrafi(new String(request.getParameter("comment").getBytes("ISO-8859-1"), "UTF-8"));
            hotel.setImage(request.getPart("image"));
            hotelDatabaseObject.hotelInsert(hotel);

            response.sendRedirect("DatabaseUpdate.jsp");

        }

        if (request.getParameter("action").equals("office_update")) {

            office = new Office();
            office.setArea(request.getParameter("area"));
            office.setOfficeName(request.getParameter("office_name"));
            office.setOfficeAddress(request.getParameter("office_address"));
            office.setOfficeTelephone(request.getParameter("office_telephone"));
            officeDatabaseObject.officeInsert(office);

            String licence_car_number[] = request.getParameterValues("licence_car_number");
            String kv[] = request.getParameterValues("kv");
            String passenger_sits[] = request.getParameterValues("passenger_sits");
            String charge_per_day[] = request.getParameterValues("charge_per_day");
            String increase_charge[] = request.getParameterValues("price_car_plus");
            String category[] = request.getParameterValues("selection");

            carlList = new ArrayList<Cars>();
            for (int i = 0; i < licence_car_number.length; i++) {
                car = new Cars();
                car.setLicenceNumber(licence_car_number[i]);
                car.setCategory(category[i]);
                car.setChargePerDay(charge_per_day[i]);
                car.setIncreaseCharge(increase_charge[i]);
                car.setKv(kv[i]);
                car.setPassengerSits(passenger_sits[i]);
                carlList.add(car);
            }

            officeDatabaseObject.carInsert(carlList);

            String licenceMotorNumber[] = request.getParameterValues("lice_moto");
            String motoKv[] = request.getParameterValues("moto_kv");
            String motoCategory[] = request.getParameterValues("moto_selection");
            String motoChargePerDay[] = request.getParameterValues("moto_charge");
            String motoIncreasePrice[] = request.getParameterValues("moto_price_Car_plus");

            MotorBikeslList = new ArrayList<MotorBikes>();

            for (int i = 0; i < licenceMotorNumber.length; i++) {
                motorBike = new MotorBikes();
                motorBike.setMotoLicenceNumber(licenceMotorNumber[i]);
                motorBike.setMotoKv(motoKv[i]);
                motorBike.setCategory(motoCategory[i]);
                motorBike.setChargePerDay(motoChargePerDay[i]);
                motorBike.setIncreaseCharge(motoIncreasePrice[i]);
                MotorBikeslList.add(motorBike);
            }

            officeDatabaseObject.motorBikeInsert(MotorBikeslList);

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);

    }

}
