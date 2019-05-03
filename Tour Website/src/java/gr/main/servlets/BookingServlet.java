package gr.database.servlets;

import com.google.gson.Gson;
import gr.UtilClasses.ArrayListSorting;
import gr.UtilClasses.ArrayListSorting_2;
import gr.database.classes.HotelDAOJDBC;
import gr.database.classes.OfficeDAOJDBC;
import gr.database.classes.TourOfficeDAOJDBC;
import gr.database.classes.UsersDAOJDBC;
import gr.javabeans.Cars;
import gr.UtilClasses.CustomObjResponse;
import gr.database.classes.AeroplaneDAOJDBC;
import gr.database.classes.LandMarkDAOJDBC;
import gr.database.classes.MesuemDAOJDBC;
import gr.database.classes.ShipDAOJDBC;
import gr.javabeans.Aeroplane;
import gr.javabeans.AeroplaneBookingList;

import gr.javabeans.Hotels;
import gr.javabeans.LandMark;
import gr.javabeans.Mesuem;
import gr.javabeans.MotorBikes;
import gr.javabeans.MyBookingList;
import gr.javabeans.MyCarBookingList;
import gr.javabeans.MyMotoBookingList;
import gr.javabeans.MyToursBookingList;

import gr.javabeans.Office;
import gr.javabeans.Ships;
import gr.javabeans.TourOffice;
import gr.javabeans.Tours;
import gr.javabeans.User;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookingServlet extends HttpServlet {

    private ArrayList<MotorBikes> motoList;
    private ArrayList<Cars> carList;
    private CustomObjResponse responseToAjaxCall;

    private MyBookingList myBookingList;
    private MyMotoBookingList myMotoBooking;
    private ArrayList<MyBookingList> bookingList;

    private ArrayList<MyBookingList> bookingList2;
    private ArrayList<MyMotoBookingList> myMotoBookingList;
    private ArrayList<MyCarBookingList> myCarBookingList;
    private ArrayList<MyToursBookingList> myTourBookingList;

    private Aeroplane aeroplane;

    private ArrayList<AeroplaneBookingList> MyAeroplaneBookingList;
    private ArrayList<AeroplaneBookingList> MyAeroplaneBookingList_2;

    private AeroplaneBookingList myAeroplaneBooking;
    private MyToursBookingList myTourBooking;
    private MyCarBookingList myCarBooking;
    private ArrayList<Hotels> hotelList;
    private ArrayList<Office> officeList;
    private ArrayList<TourOffice> tourOfficeList;
    private ArrayList<Tours> toursList;
    private ArrayList<Mesuem> mesuemList;
    private ArrayList<LandMark> landMarkList;
    private ArrayList<Aeroplane> aeroplaneList;
    private ArrayList<Aeroplane> aeroplaneBackList;
    private ArrayList<Ships> shipList;
    private Hotels hotel;

    private OfficeDAOJDBC officeDatabaseObject;
    private TourOfficeDAOJDBC tourOfficeDatabaseObject;
    private Map<String, ArrayList<Office>> OfficeMap;
    private Map<String, ArrayList<TourOffice>> tourOfficeMap;
    private Map<String, ArrayList<Tours>> toursMap;
    private Map<String, ArrayList<MotorBikes>> motorBikesMap;
    private Map<String, ArrayList<Cars>> carsMap;
    private Map<String, ArrayList<Mesuem>> mesuemMap;

    private MesuemDAOJDBC mesuemDatabaseObject;
    private UsersDAOJDBC userDatabaseObject;
    private HotelDAOJDBC databaseObject;
    private AeroplaneDAOJDBC aeroplaneDatabaseObject;
    private LandMarkDAOJDBC landMArkDatabaseObject;
    private ShipDAOJDBC shipDatabaseObject;
    private User user;

    @Override
    public void init() {
        userDatabaseObject = new UsersDAOJDBC();
        databaseObject = new HotelDAOJDBC();
        officeDatabaseObject = new OfficeDAOJDBC();
        tourOfficeDatabaseObject = new TourOfficeDAOJDBC();
        mesuemDatabaseObject = new MesuemDAOJDBC();
        landMArkDatabaseObject = new LandMarkDAOJDBC();
        aeroplaneDatabaseObject = new AeroplaneDAOJDBC();
        shipDatabaseObject = new ShipDAOJDBC();

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        String hotelName = request.getParameter("hotelName");
        if (action != null) {
            boolean tourOffices = false, rentOffices = false;

            if (action.equals("search_form")) {
                long nights = 1;

                if (request.getParameter("tourOfficeCheckBox") != null) {
                    tourOffices = true;
                }

                if (request.getParameter("rentOfficeCheckBox") != null) {
                    rentOffices = true;
                }

                hotelList = new ArrayList<Hotels>();
                hotelList = databaseObject.findHotelsByCategoryAndArea(request.getParameter("destination"), request.getParameter("categoryyy"));

                try {
                    Date d1 = new SimpleDateFormat("yyyy-M-dd").parse((String) request.
                            getParameter("departure_date"));
                    Date d2 = new SimpleDateFormat("yyyy-M-dd").parse((String) request.
                            getParameter("arrival_date"));
                    long diff = d2.getTime() - d1.getTime();

                    if ((diff / (1000 * 60 * 60 * 24)) != 0) {
                        nights = (diff / (1000 * 60 * 60 * 24));
                    }

                } catch (ParseException ex) {
                    Logger.getLogger(BookingServlet.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (int i = 0; i < hotelList.size(); i++) {
                    hotel = new Hotels();
                    hotel = hotelList.get(i);
                    int priceOfNight = Integer.parseInt(hotelList.get(i).getPrice());
                    int priceOfClients = priceOfNight * Integer.parseInt(request.getParameter("grownUps"));

                    double priceOfChildren = (priceOfNight - (priceOfNight * 0.3)) * Integer.parseInt(request.getParameter("children"));
                    double price = (priceOfClients + priceOfChildren) * nights;
                    hotel.setInitialPrice(hotelList.get(i).getPrice());
                    hotel.setPrice(Double.toString(price));

                    hotelList.set(i, hotel);
                }

                request.setAttribute("destination", request.getParameter("destination"));
                request.setAttribute("category", request.getParameter("categoryyy"));
                request.setAttribute("departure_date", request.getParameter("departure_date"));
                request.setAttribute("arrival_date", request.getParameter("arrival_date"));
                request.setAttribute("number_of_clients", request.getParameter("grownUps"));
                request.setAttribute("number_of_children", request.getParameter("children"));
                request.setAttribute("days", nights);

                int numberOfClients = Integer.parseInt(request.getParameter("grownUps")) + Integer.parseInt(request.getParameter("children"));

                int numberOfRooms = Integer.parseInt(request.getParameter("monoklina")) + 2 * Integer.parseInt(request.getParameter("diklina"));

                if (numberOfRooms == numberOfClients) {
                    request.setAttribute("monoklina", request.getParameter("monoklina"));
                    request.setAttribute("diklina", request.getParameter("diklina"));
                } else {
                    int numberOfDiklina = numberOfClients / 2;

                    request.setAttribute("diklina", Integer.toString(numberOfDiklina));
                    if (numberOfClients % 2 == 0) {
                        int numberOfMonoklina = 0;
                        request.setAttribute("monoklina", Integer.toString(numberOfMonoklina));
                    } else {
                        int numberOfMonoklina = 1;
                        request.setAttribute("monoklina", Integer.toString(numberOfMonoklina));

                    }

                }

                tourOfficeList = tourOfficeDatabaseObject.getTourOfficeByArea(request.getParameter("destination"));
                officeList = officeDatabaseObject.findOfficeByName(request.getParameter("destination"));
                toursMap = new HashMap<String, ArrayList<Tours>>();
                toursList = tourOfficeDatabaseObject.getAllTours();
                motorBikesMap = new HashMap<String, ArrayList<MotorBikes>>();
                carsMap = new HashMap<String, ArrayList<Cars>>();

                for (int i = 0; i < tourOfficeList.size(); i++) {
                    toursList = tourOfficeDatabaseObject.getTours(tourOfficeList.get(i).getOfficeName());

                    if (toursList != null) {
                        toursMap.put(tourOfficeList.get(i).getOfficeName(), toursList);

                    }
                }

                for (int i = 0; i < officeList.size(); i++) {
                    motoList = officeDatabaseObject.getMotorBikes(officeList.get(i).getOfficeName());
                    carList = officeDatabaseObject.getCars(officeList.get(i).getOfficeName());
                    if (motoList != null) {
                        motorBikesMap.put(officeList.get(i).getOfficeName(), motoList);
                    }
                    if (carList != null) {
                        carsMap.put(officeList.get(i).getOfficeName(), carList);
                    }

                }

                if (tourOffices == true) {

                    request.setAttribute("officeList", tourOfficeList);
                    request.setAttribute("toursMap", toursMap);
                    request.setAttribute("tourOfficeYes", "true");

                }

                if (rentOffices == true) {
                    request.setAttribute("rentOfficeList", officeList);
                    request.setAttribute("motorBikesMap", motorBikesMap);
                    request.setAttribute("carsMap", carsMap);
                    request.setAttribute("rentOffice", "true");

                }

                request.setAttribute("hotelList", hotelList);
                request.getRequestDispatcher("results.jsp").forward(request, response);

            }

            if (action.equals("redirectToHotelsInfo")) {
                response.setContentType("Content-Type: text/html; charset=utf-8");
                hotel = databaseObject.findHotelByName(request.getParameter("hotelName"));

                officeList = officeDatabaseObject.findOfficeByName(hotel.getArea());
                motorBikesMap = new HashMap<String, ArrayList<MotorBikes>>();
                carsMap = new HashMap<String, ArrayList<Cars>>();

                motoList = new ArrayList<MotorBikes>();
                carList = new ArrayList<Cars>();
                for (int i = 0; i < officeList.size(); i++) {
                    motoList = officeDatabaseObject.getMotorBikes(officeList.get(i).getOfficeName());
                    carList = officeDatabaseObject.getCars(officeList.get(i).getOfficeName());
                    if (motoList != null) {

                        motorBikesMap.put(officeList.get(i).getOfficeName(), motoList);
                    }
                    if (carList != null) {
                        carsMap.put(officeList.get(i).getOfficeName(), carList);
                    }

                }

                request.setAttribute("motorBikesMap", motorBikesMap);
                request.setAttribute("carsMap", carsMap);
                request.setAttribute("officeList", officeList);
                request.setAttribute("hotel", hotel);
                request.getRequestDispatcher("hotelBooking.jsp").forward(request, response);
            }

            if (action.equals("get_officeVehicle")) {
                response.setContentType("application/json");

                motoList = new ArrayList<MotorBikes>();
                motoList = officeDatabaseObject.getMotorBikes(request.getParameter("office_name"));

                carList = new ArrayList<Cars>();
                carList = officeDatabaseObject.getCars(request.getParameter("office_name"));

                responseToAjaxCall = new CustomObjResponse();
                responseToAjaxCall.setMotoList(motoList);
                responseToAjaxCall.setCarsList(carList);

                new Gson().toJson(responseToAjaxCall, response.getWriter());

            }

            if (action.equals("get_tours")) {
                response.setContentType("application/json");

                toursList = new ArrayList<Tours>();
                toursList = tourOfficeDatabaseObject.getTours(request.getParameter("office_name"));

                new Gson().toJson(toursList, response.getWriter());
            }

            if (action.equals("redirectToRoutes")) {
                aeroplaneList = aeroplaneDatabaseObject.getRecords();
                shipList = shipDatabaseObject.getRecords();
                request.setAttribute("aeroplaneList", aeroplaneList);
                request.setAttribute("shipList", shipList);
                request.getRequestDispatcher("Routes.jsp").forward(request, response);
            }

            if (action.equals("redirectToHotels")) {

                hotelList = new ArrayList<Hotels>();
                hotelList = databaseObject.hotelRecords();

                OfficeMap = new HashMap<String, ArrayList<Office>>();
                tourOfficeMap = new HashMap<String, ArrayList<TourOffice>>();

                for (Hotels hList : hotelList) {

                    officeList = officeDatabaseObject.findOfficeByName(hList.getArea());
                    OfficeMap.put(hList.getArea(), officeList);

                    tourOfficeList = tourOfficeDatabaseObject.findTourOfficeByName(hList.getArea());
                    tourOfficeMap.put(hList.getArea(), tourOfficeList);
                }

                request.setAttribute("officeMap", OfficeMap);
                request.setAttribute("tourOfficeMap", tourOfficeMap);

                request.setAttribute("hotelList", hotelList);
                request.getRequestDispatcher("hotels.jsp").forward(request, response);

            }

            if (action.equals("redirectToMesuem")) {
                mesuemList = mesuemDatabaseObject.getMesuem();
                request.setAttribute("mesuemList", mesuemList);
                request.getRequestDispatcher("Mesuem.jsp").forward(request, response);
            }

            if (action.equals("redirectToLandMarks")) {
                landMarkList = landMArkDatabaseObject.getRecords();
                request.setAttribute("landMarkList", landMarkList);
                request.getRequestDispatcher("LandMarks.jsp").forward(request, response);
            }

            if (action.equals("aeroplaneRoutes")) {
                String from = request.getParameter("beggining");
                String to = request.getParameter("destination");

                String dapartureDate = request.getParameter("departureDatePicker");
                String selectionRoutes = request.getParameter("aeroplaneRouteChoice");

                int numberOfChildren = Integer.parseInt(request.getParameter("children"));
                int numberOfGrownUps = Integer.parseInt(request.getParameter("grownUps"));

                if (selectionRoutes.equals("back")) {

                    String backDate = request.getParameter("dateBackPicker");
                    aeroplaneList = new ArrayList<Aeroplane>();
                    aeroplaneList = aeroplaneDatabaseObject.getRecordsByDeparture(from, to, dapartureDate);

                    aeroplaneBackList = new ArrayList<Aeroplane>();
                    aeroplaneBackList = aeroplaneDatabaseObject.getRecordsByDeparture(to, from, backDate);

                    if (aeroplaneList.size() != 0) {
                        for (int i = 0; i < aeroplaneList.size(); i++) {
                            aeroplane = new Aeroplane();
                            aeroplane = aeroplaneList.get(i);
                            int newPrice = Integer.parseInt(aeroplane.getPrice()) * (numberOfChildren + numberOfGrownUps);
                            aeroplane.setPrice(Integer.toString(newPrice));
                            aeroplaneList.set(i, aeroplane);

                        }

                    }

                    if (aeroplaneBackList.size() != 0) {
                        for (int i = 0; i < aeroplaneBackList.size(); i++) {
                            aeroplane = new Aeroplane();
                            aeroplane = aeroplaneBackList.get(i);
                            int newPrice = Integer.parseInt(aeroplane.getPrice()) * (numberOfChildren + numberOfGrownUps);
                            aeroplane.setPrice(Integer.toString(newPrice));
                            aeroplaneBackList.set(i, aeroplane);

                        }

                    }

                    request.setAttribute("from", from);
                    request.setAttribute("to", to);
                    request.setAttribute("userBackChoice", "1");
                    request.setAttribute("aeroplaneList", aeroplaneList);
                    request.setAttribute("aeroplaneBackList", aeroplaneBackList);

                    request.getRequestDispatcher("Routes.jsp").forward(request, response); // Go back to login page.     

                } else {

                    aeroplaneList = new ArrayList<Aeroplane>();
                    aeroplaneList = aeroplaneDatabaseObject.getRecordsByDeparture(from, to, dapartureDate);
                    if (aeroplaneList.size() != 0) {
                        for (int i = 0; i < aeroplaneList.size(); i++) {
                            aeroplane = new Aeroplane();
                            aeroplane = aeroplaneList.get(i);
                            int newPrice = Integer.parseInt(aeroplane.getPrice()) * (numberOfChildren + numberOfGrownUps);
                            aeroplane.setPrice(Integer.toString(newPrice));
                            aeroplaneList.set(i, aeroplane);
                        }

                    }
                    request.setAttribute("userBackChoice", "0");
                    request.setAttribute("aeroplaneList", aeroplaneList); // Set error msg for ${error}
                    request.getRequestDispatcher("Routes.jsp").forward(request, response); // Go back to login page.     
                }

            }

            if (action.equals("register_form")) {
                String userName = request.getParameter("username");
                String lastName = request.getParameter("lastname");
                String email = request.getParameter("email");
                String pwd = request.getParameter("pwd");

                user = new User();
                user.setName(userName);
                user.setLastName(lastName);
                user.setEmail(email);
                user.setPassword(pwd);

                if (userName != null && lastName != null && email != null && pwd != null) {
                    userDatabaseObject.userSave(user);
                    request.setAttribute("succesMessage", "1");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }

            }

            if (action.equals("connection_form")) {

                String email = request.getParameter("email");
                String password = request.getParameter("pwd");

                if (email != null & password != null) {

                    if (userDatabaseObject.authentication(email, password) == true) {

                        request.getSession().setAttribute("user", email); // Put user in session.
                        request.getSession().setAttribute("loggIn", "true");
                        response.sendRedirect("BookingServlet"); // Go to some start page.

                    } else {
                        request.setAttribute("errorMessage", "2"); // Set error msg for ${error}
                        request.getRequestDispatcher("index.jsp").forward(request, response); // Go back to login page.       
                    }

                }

            }

            if (action.equals("cancelBooking")) {
                bookingList2 = (ArrayList<MyBookingList>) request.getSession().getAttribute("bookingList");

                for (int i = 0; i < bookingList2.size(); i++) {
                    if (bookingList2.get(i).getHotelName().equals(request.getParameter("hotelName"))) {
                        bookingList2.remove(i);
                        break;
                    }
                }
                request.getSession().setAttribute("bookingList", bookingList2);

            }

            if (action.equals("cancelTourBooking")) {
                myTourBookingList = (ArrayList<MyToursBookingList>) request.getSession().getAttribute("myTourBookingList");
                for (int i = 0; i < myTourBookingList.size(); i++) {
                    if (myTourBookingList.get(i).getDestination().equals(request.getParameter("destination")) && myTourBookingList.get(i).getBeggining().equals(request.getParameter("beggining")));
                    myTourBookingList.remove(i);
                    break;
                }
                request.getSession().setAttribute("myTourBookingList", myTourBookingList);
            }

            if (action.equals("cancelCarBooking")) {
                myCarBookingList = new ArrayList<MyCarBookingList>();
                myCarBookingList = (ArrayList<MyCarBookingList>) request.getSession().getAttribute("myCarBookingList");

                for (int i = 0; i < myCarBookingList.size(); i++) {
                    if (myCarBookingList.get(i).getLicenceNumber().equals(request.getParameter("licenceNumber")));
                    myCarBookingList.remove(i);
                    break;
                }

                request.getSession().setAttribute("myCarBookingList", myCarBookingList);

            }
            if (action.equals("cancelAeroplaneBooking")) {
                MyAeroplaneBookingList = new ArrayList<AeroplaneBookingList>();
                MyAeroplaneBookingList = (ArrayList<AeroplaneBookingList>) request.getSession().getAttribute("MyAeroplaneBookingList");

                for (int i = 0; i < MyAeroplaneBookingList.size(); i++) {
                    if (MyAeroplaneBookingList.get(i).getCompanyName().equals(request.getParameter("companyName")) && MyAeroplaneBookingList.get(i).getFromCountry().equals(request.getParameter("from")) && MyAeroplaneBookingList.get(i).getToCountry().equals(request.getParameter("to"))) {
                        MyAeroplaneBookingList.remove(i);
                        break;
                    }
                }
                request.getSession().setAttribute("MyAeroplaneBookingList", myMotoBookingList);
            }

            if (action.equals("cancelTwoWaysAeroplaneBooking")) {
             
                MyAeroplaneBookingList_2 = new ArrayList<AeroplaneBookingList>();
                MyAeroplaneBookingList_2 = (ArrayList<AeroplaneBookingList>) request.getSession().getAttribute("MyAeroplaneBookingList_2");
                System.out.println(request.getParameter("company"));
                for (int i = 0; i < MyAeroplaneBookingList_2.size(); i++) {
                    
                    if (MyAeroplaneBookingList_2.get(i).getCompanyName().equals(request.getParameter("company")) && MyAeroplaneBookingList_2.get(i).getFromCountry().equals(request.getParameter("from"))) {
                        System.out.println("sdaas");
                        MyAeroplaneBookingList_2.remove(i);
                        break;
                    }
                }
                 request.getSession().setAttribute("MyAeroplaneBookingList_2", MyAeroplaneBookingList_2);
            }

            if (action.equals("cancelMotoBooking")) {
                myMotoBookingList = new ArrayList<MyMotoBookingList>();
                myMotoBookingList = (ArrayList<MyMotoBookingList>) request.getSession().getAttribute("myMotoBookingList");

                for (int i = 0; i < myMotoBookingList.size(); i++) {
                    if (myMotoBookingList.get(i).getLicenceNumber().equals(request.getParameter("licenceNumber")));
                    myMotoBookingList.remove(i);
                    break;

                }

                request.getSession().setAttribute("myMotoBookingList", myMotoBookingList);

            }

            if (action.equals("myBookList")) {

                request.getRequestDispatcher("MyBookList.jsp").forward(request, response); // Go back to login page.  

            }

            if (action.equals("store_custumer_booking_info")) {
                if (request.getSession().getAttribute("bookingList") == null) {
                    bookingList = new ArrayList<MyBookingList>();
                }
                myBookingList = new MyBookingList();
                myBookingList.setHotelName(request.getParameter("hotelName"));
                myBookingList.setHotelCategoty(request.getParameter("category"));
                myBookingList.setHotelArea(request.getParameter("hotelArea"));
                myBookingList.setHotelTelephone(request.getParameter("hotelTelephone"));
                myBookingList.setHotelAddress(request.getParameter("hotelAddress"));
                myBookingList.setFinalPrice(request.getParameter("finalPrice"));
                myBookingList.setArrivalDate(request.getParameter("arrivalDate"));
                myBookingList.setDepartureDate(request.getParameter("departureDate"));

                bookingList.add(myBookingList);
                request.getSession().setAttribute("bookingList", bookingList);
            }

            if (action.equals("store_custumer_booking_aeroplane_two_ways")) {
                if (request.getSession().getAttribute("MyAeroplaneBookingList_2") == null) {
                    MyAeroplaneBookingList_2 = new ArrayList<AeroplaneBookingList>();
                }
                myAeroplaneBooking = new AeroplaneBookingList();
                myAeroplaneBooking.setCompanyName(request.getParameter("companyName"));

                myAeroplaneBooking.setDepartureDate(request.getParameter("departureDate"));
                myAeroplaneBooking.setDepartureTime(request.getParameter("departureTime"));
                myAeroplaneBooking.setArrivaTime(request.getParameter("arrivalTime"));
                myAeroplaneBooking.setFromAirport(request.getParameter("fromAirport"));
                myAeroplaneBooking.setToAirport(request.getParameter("toAirport"));
                myAeroplaneBooking.setFromCountry(request.getParameter("fromCountry"));
                myAeroplaneBooking.setToCountry(request.getParameter("toCountry"));
                myAeroplaneBooking.setPrice(request.getParameter("price"));

                MyAeroplaneBookingList_2.add(myAeroplaneBooking);

                request.getSession().setAttribute("MyAeroplaneBookingList_2", MyAeroplaneBookingList_2);

            }

            if (action.equals("store_custumer_booking_aeroplane")) {
                if (request.getSession().getAttribute("MyAeroplaneBookingList") == null) {
                    MyAeroplaneBookingList = new ArrayList<AeroplaneBookingList>();
                }
                myAeroplaneBooking = new AeroplaneBookingList();
                myAeroplaneBooking.setCompanyName(request.getParameter("companyName"));
                myAeroplaneBooking.setDepartureDate(request.getParameter("departureDate"));
                myAeroplaneBooking.setDepartureTime(request.getParameter("departureTime"));
                myAeroplaneBooking.setArrivaTime(request.getParameter("arrivalTime"));
                myAeroplaneBooking.setFromAirport(request.getParameter("fromAirport"));
                myAeroplaneBooking.setToAirport(request.getParameter("toAirport"));
                myAeroplaneBooking.setFromCountry(request.getParameter("fromCountry"));
                myAeroplaneBooking.setToCountry(request.getParameter("toCountry"));
                myAeroplaneBooking.setPrice(request.getParameter("price"));

                MyAeroplaneBookingList.add(myAeroplaneBooking);
                request.getSession().setAttribute("MyAeroplaneBookingList", MyAeroplaneBookingList);
            }

            if (action.equals("store_custumer_booking_info_car")) {
                if (request.getSession().getAttribute("myCarBookingList") == null) {
                    myCarBookingList = new ArrayList<MyCarBookingList>();
                }
                myCarBooking = new MyCarBookingList();
                myCarBooking.setLicenceNumber(request.getParameter("licenseNumber"));
                myCarBooking.setCarCategory(request.getParameter("carCategory"));
                myCarBooking.setFrom(request.getParameter("from"));
                myCarBooking.setUntil(request.getParameter("until"));
                myCarBooking.setKv(request.getParameter("kivika"));
                myCarBooking.setFinalPrice(request.getParameter("finalPrice"));
                myCarBooking.setPassengerSits(request.getParameter("passengerSits"));
                myCarBookingList.add(myCarBooking);
                request.getSession().setAttribute("myCarBookingList", myCarBookingList);

            }

            if (action.equals("store_custumer_booking_info_moto")) {
                if (request.getSession().getAttribute("myMotoBookingList") == null) {
                    myMotoBookingList = new ArrayList<MyMotoBookingList>();
                }

                myMotoBooking = new MyMotoBookingList();
                myMotoBooking.setFrom(request.getParameter("from"));
                myMotoBooking.setUntil(request.getParameter("until"));
                myMotoBooking.setLicenceNumber(request.getParameter("licenseNumber"));
                myMotoBooking.setMotoCategory(request.getParameter("motoCategory"));

                myMotoBooking.setFinalPrice(request.getParameter("finalPrice"));
                myMotoBooking.setKv(request.getParameter("kivika"));
                myMotoBookingList.add(myMotoBooking);
                request.getSession().setAttribute("myMotoBookingList", myMotoBookingList);

            }

            if (action.equals("store_custumer_booking_tours")) {
                if (request.getSession().getAttribute("myTourBookingList") == null) {
                    myTourBookingList = new ArrayList<MyToursBookingList>();
                }
                myTourBooking = new MyToursBookingList();
                myTourBooking.setDestination(request.getParameter("destination"));
                myTourBooking.setBeggining(request.getParameter("beggining"));
                myTourBooking.setDateTimeDeparture(request.getParameter("departureDate"));
                myTourBooking.setDateTimeArrival(request.getParameter("arrivalDate"));
                myTourBooking.setFinalPrice(request.getParameter("finalPrice"));

                myTourBookingList.add(myTourBooking);
                request.getSession().setAttribute("myTourBookingList", myTourBookingList);

            }

            if (action.equals("connection_form_index")) {
                String email = request.getParameter("email");
                String password = request.getParameter("pwd");

                if (email != null & password != null) {

                    if (userDatabaseObject.authentication(email, password) == true) {

                        request.getSession().setAttribute("user", email); // Put user in session.
                        request.getSession().setAttribute("loggIn", "true");
                        response.sendRedirect("BookingServlet"); // Go to some start page.

                    } else {
                        hotelList = new ArrayList<Hotels>();
                        hotelList = databaseObject.hotelRecords();
                        request.setAttribute("hotelList", hotelList);
                        request.setAttribute("errorMessage", "2"); // Set error msg for ${error}
                        request.getRequestDispatcher("hotels.jsp").forward(request, response); // Go back to login page.       
                    }

                }

            }

            if (action.equals("disconnect")) {
                request.getSession().invalidate();
                response.sendRedirect("BookingServlet"); // Go to some start page.

            }

        } else {

            request.getRequestDispatcher("index.jsp").forward(request, response);

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

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
