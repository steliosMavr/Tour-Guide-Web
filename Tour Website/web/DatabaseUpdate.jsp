
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <link rel="stylesheet" href="view/MyCss/css/DatabaseUpdate.css"/> 
        <title>Database Update</title>
    </head>
    <jsp:include page="Header.jsp"></jsp:include>
    <jsp:include page="Sidebar.jsp"></jsp:include>
        <body>

        <c:if test="${sessionScope.user != 'true'}">
            <c:redirect url="LoginForm.jsp"/>
        </c:if>


        <div class="content">

            <div id="databaseUpdateMenu" class="tabcontent">
                <div class="header"><h1>Ενημέρωση Βάσης Δεδομένων</h1></div> 
                <div class="top-menu">
                    <a  href="#"   id="defaultOpen"  name="hotels_update">Ξενοδοχεία</a>
                    <a  href="#"   name="office_update">Γραφεία Ενοικίασεων</a>
                    <a  href="#"   name="museum_update">Μουσεία</a>
                    <a  href="#"   name="landmark_update">Αξιοθέατα </a>
                    <a  href="#"   name="routes_update">Δρομολόγια</a>
                    <a  href="#"   name="tour_office_update">Εκδρομικά Γραφεία</a>
                    <a  href="#"   name="partners_update">Συνεργάτες</a>

                    <div id="hotel_fields" class="dropdownContent">
                        <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                            <label >Ονομασία Ξενοδοχείου </label>
                            <input type="text"  name="hotelName" placeholder="Ονομασία.." required>
                            <label > Διεύθυνση Ξενοδοχείου</label>
                            <input type="text"  name="hotelAddress" placeholder="Διεύθυνση.." required>
                            <label > Kατηγορία Ξενοδοχείου</label>
                            <input type="text"  name="hotelCategory" placeholder="Kατηγορία.." required>
                            <label >Τηλέφωνο Ξενοδοχείου</label>
                            <input type="text"  name="hotelTelephone" placeholder="Τηλέφωνο.." required>
                            <label >Αριθμός Ξενοδοχείου</label>
                            <input type="text"  name="hotelNumber" placeholder="Αριθμός .." required>
                            <label >Κατηγορία Δωματίων Ξενοδοχείου </label>
                            <input type="text"  name="hotelRoomCategory" placeholder="ατηγορία Δωματίων .." required>
                            <label >Τιμή Δωματίου </label>
                            <input type="text"  name="hotelRoomPrice" placeholder="Τιμή Δωματίου .." required>
                            <label >Περιοχή Ξενοδοχείου </label>
                            <input type="text"  name="area" placeholder="Περιοχή Δωματίου .." required>
                            <label >Μονόκλινα Δωμάτια </label>
                            <input type="text"  name="monoklina" placeholder="Περιοχή Δωματίου .." required>
                            <label >Δικλινα Δωμάτια </label>
                            <input type="text"  name="diklina" placeholder="Περιοχή Δωματίου .." required>
                            <label >Περιγραφή Ξενοδοχείου</label>
                            <div class="form-group">
                               
                                <textarea class="form-control" name="comment" rows="10"  style="min-width:100%"></textarea>
                            </div>

                            <input type="file" name="image" id="imgSave" value=load" required/><br>
                            <input type="hidden" name="action" value="update">


                            <input type="submit" value="Αποθήκευση">

                        </form>
                    </div>

                    <div id="office_fields" class="dropdownContent">
                        <button class="tablink" id="office_insert">Εισαγωγή καινούργιου γραφείου</button>



                        <button class="tablink" id="office_modification" >Εισαγωγή οχημάτων σε υπάρχων γραφείο</button>



                        <form  id ="office_forms" method="POST" action="DatabaseUpdate">
                            <label >Ονομασία Γραφείου </label>
                            <input type="text"  name="office_name" placeholder="ονομασία.." required>
                            <label > Διεύθυνση Γραφείου</label>
                            <input type="text"  name="office_address" placeholder="Διεύθυνση.." required>
                            <label > Τηλέφωνο Γραφείου</label>
                            <input type="text"  name="office_telephone" placeholder="Τηλέφωνο.." required>    
                            <label > Περιοχή Γραφείου</label>
                            <input type="text"  name="area" placeholder="Περιοχή.." required>    




                            <input type="hidden" name="action" value="office_update">
                            <button class="accordion">Οχηματα Γραφείου + </button>



                            <div class="extra_fields">
                                <button type="button" id="add_more_fields" class="accordion1">Φόρμα Αυτοκινήτου</button>
                                <button type="button" id="add_more_fields_moto" class="accordion1">Φόρμα Μιχανακίου</button>
                                <div class="car_info">
                                    <h3>Πληροφορίες Αυτοκινήτου</h3>
                                    <label >Αριθμό Κυκλοφορίας</label>
                                    <input type="text"  name="licence_car_number" placeholder="Αριθμό Κυκλοφορίας.." required>

                                    <label >Κυβικά</label>
                                    <input type="text"  name="kv" placeholder="Κυβικά.." required>

                                    <label >Θέσεις Επιβατών</label>
                                    <input type="text"  name="passenger_sits" placeholder="Θέσεις Επιβατών.." required>
                                    <label >Κατηγοριες</label><br>
                                    <select id="mainselection" name ="selection" > 
                                        <option  value="1">1 Κατηγορία</option>
                                        <option  value="2">2 Κατηγορία</option>
                                        <option  value="3">3 Κατηγορία</option>
                                        <option  value="4">4 Κατηγορία</option>
                                        <option  value="5">5 Κατηγορία</option>
                                    </select><br><br>
                                    <label >Χρέωση ανα μέρα</label>
                                    <input type="text"  name="charge_per_day" placeholder="Χρέωση ανα μέρα.." required>
                                    <label >Αύξηση Χρέωσης  ανα μέρα</label>
                                    <input type="text"  name="price_car_plus" placeholder="Αύξηση Χρέωσης ανα μέρα.." required>

                                </div>  


                                <div class="moto_info">
                                    <h3>Πληροφορίες Μηχανακίου</h3>
                                    <label >Αριθμό Κυκλοφορίας</label>
                                    <input type="text"  name="lice_moto" placeholder="Αριθμό Κυκλοφορίας.." required>
                                    <label >Κυβικά</label>
                                    <input type="text"  name="moto_kv" placeholder="Κυβικά.." required>


                                    <label >Κατηγοριες</label><br>
                                    <select id="mainselection" name="moto_selection">
                                        <option value="1">1 Κατηγορία</option>
                                        <option value="2">2 Κατηγορία</option>
                                        <option value="3">3 Κατηγορία</option>
                                        <option value="4">4 Κατηγορία</option>
                                        <option value="5">5 Κατηγορία</option>
                                    </select><br><br>

                                    <label >Χρέωση ανα μέρα</label>
                                    <input type="text"  name="moto_charge" placeholder="Χρέωση ανα μέρα.." required>
                                    <label >Αύξηση Χρέωσης  ανα μέρα</label>
                                    <input type="text"  name="moto_price_Car_plus" placeholder="Αύξηση Χρέωση ανα μέρα.." required>


                                </div>

                            </div>
                            <input type="submit" value="Αποθήκευση">
                        </form>






                        <div class="existing_office">
                            <h4>Επέλεξε Γραφείο</h4>
                            <form  method="POST" action="DatabaseUpdate">
                                <select id="mainselection" name="existing_office">
                                    <c:forEach items="${officeInfo}" var="officeNames">
                                        <option value=${officeNames.officeName}>${officeNames.officeName}</option>

                                    </c:forEach>
                                </select><br><br>

                                <button type="button" id="add_more_fields3" class="accordion1">Φόρμα Αυτοκινήτου</button>
                                <button type="button" id="add_more_fields_moto3" class="accordion1">Φόρμα Μιχανακίου</button>

                                <input type="hidden" name="action" value="existed_office_update">

                                <div class="exist_office_forward">
                                    <input type="submit" value="Αποθήκευση"> 

                                </div>


                            </form>
                        </div>


                    </div>


                    <div id="mesuem_fields" class="dropdownContent">
                        <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                            <label >Ονομασία Μουσείου </label>
                            <input type="text"  name="mesuemName" placeholder="Ονομασία.." required >
                            <label > Διεύθυνση Μουσείου</label>
                            <input type="text"  name="mesuemAddress" placeholder="Διεύθυνση.." required>
                            <label >Τηλέφωνο Μουσείου</label>
                            <input type="text"  name="mesuemTelephone" placeholder="Τηλέφωνο.." required>
                            <label >Τοποθεσία Μουσείου</label>
                            <input type="text"  name="mesuemLocation" placeholder="Τοποθεσία.." required>
                            <label >Τιμή Μουσείου</label>
                            <input type="text"  name="mesuemPrice" placeholder="Τιμή .." required>

                            <input type="file" name="image" id="imgSave" value=load"/><br>
                            <input type="hidden" name="action" value="update_mesuem">
                            <input type="submit" value="Αποθήκευση">

                        </form>
                    </div>

                    <div id="landmarks_fields" class="dropdownContent">
                        <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                            <label >Ονομασία Αξιοθέατου </label>
                            <input type="text"  name="landMarkName" placeholder="Ονομασία.." required>
                            <label > Τοποθεσία Αξιοθέατου</label>
                            <input type="text"  name="landMarkLocation" placeholder="Τοποθεσία.." required>
                            <label >Τηλέφωνο Αξιοθέατου</label>
                            <input type="text"  name="landMarkTelephone" placeholder="Τηλέφωνο.." required>
                            <label >Τιμή Αξιοθέατου</label>
                            <input type="text"  name="landMarkPrice" placeholder="Τιμή .." required>

                            <input type="file" name="image" id="imgSave" value=load"/><br>
                            <input type="hidden" name="action" value="update_landmark">
                            <input type="submit" value="Αποθήκευση">

                        </form>
                    </div>

                    <div id="routes_fields" class="dropdownContent">
                        <button class="tablink" id="defaultOpen2">Αεροπλάνα</button>
                        <button class="tablink" id="ships" >Πλοία</button>


                        <div id="aeroplane" class="tabcon">

                            <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                                <label >Ονομασία Εταιρίας </label>
                                <input type="text"  name="companyName" placeholder="Ονομασία Αεροδρομίου.." required>
                                <label >Ονομασία Αεροδρομίου </label>
                                <input type="text"  name="airportName" placeholder="Ονομασία Αεροδρομίου.." required>
                                <label >Ώρα Αναχώρησης</label>
                                <input type="text"  name="departureTime" placeholder="Ώρα.." required>
                                <label >Ημερομηνια Αναχώρησης</label>
                                <input type="text"  name="departureDay" placeholder="Ώρα.." required>
                                <label >Ονομασία Προορισμού Αεροδρομίου</label>
                                <input type="text"  name="airportDestinationName" placeholder="Ονομασία Αεροδρομίου.." required>
                                <label >Ημερομηνια Άφιξης</label>
                                <input type="text"  name="arrivalDay" placeholder="Ώρα.." required>
                                <label >Ώρα Άφιξης </label>
                                <input type="text"  name="arrivalTime" placeholder="Ώρα.." required>

                                <label >Από</label>
                                <input type="text"  name="from" placeholder="Μερος (πχ Αθηνα).." required>
                                <label >Πρός</label>
                                <input type="text"  name="to" placeholder="Μερος (πχ Θεσσαλονικη).." required>
                                <label >Τιμή</label>
                                <input type="text"  name="price" placeholder="Τιμή .." required>


                                <input type="hidden" name="action" value="update_aeroplane">
                                <input type="submit" value="Αποθήκευση">

                            </form>
                        </div>

                        <div id="shi" class="tabcon">

                            <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                                <label >Ονομασία Εταιρίας </label>
                                <input type="text"  name="companyName" placeholder="Ονομασία Αεροδρομίου.." required>
                                <label >Αναχώρηση Πλοίου Από</label>
                                <input type="text"  name="departureShipFromPort" placeholder="Ονομασία Λιμανίου.." required>
                                <label >Ώρα Αναχώρησης</label>
                                <input type="text"  name="departureTime" placeholder="Ώρα.." required>
                                <label >Μέρα Αναχώρησης</label>
                                <input type="text"  name="departureDay" placeholder="Ώρα.." required>
                                <label >Προορισμός Πλοίου</label>
                                <input type="text"  name="shipDestination" placeholder="Ονομασία Λιμανίου.." required>
                                <label >Ώρα Άφηξης </label>
                                <input type="text"  name="arrivalTime" placeholder="Ώρα.." required>
                                <label >Μέρα Άφηξης</label>
                                <input type="text"  name="arrivalDay" placeholder="Ώρα.." required>
                                <label >Από</label>
                                <input type="text"  name="fromLocation" placeholder="Μερος (πχ Αθηνα).." required>
                                <label >Πρός</label>
                                <input type="text"  name="toLocation" placeholder="Μερος (πχ Θεσσαλονικη).." required>
                                <label >Τιμή</label>
                                <input type="text"  name="price" placeholder="Τιμή .." required>


                                <input type="hidden" name="action" value="update_ships">
                                <input type="submit" value="Αποθήκευση">

                            </form>
                        </div>


                    </div>




                    <div id="tour_office_fields" class="dropdownContent">

                        <button class="tablink" id="tour_office_insert">Εισαγωγή καινούργιου γραφείου</button>
                        <button class="tablink" id="tour_office_modification" >Εισαγωγή εκδρομών σε υπάρχων γραφείο</button>

                        <form  enctype="multipart/form-data" id="extra_fields_tour_off" method="POST" action="DatabaseUpdate">

                            <label>Ονομασία</label>
                            <input type="text"  name="officeName" placeholder="Ονομασία.." required>
                            <label>Διεύθηνση</label>
                            <input type="text"  name="officeAddress" placeholder="Διεύθηνση.." required>
                            <label>Τηλέφωνο</label>
                            <input type="text"  name="officeTelephone" placeholder="Τηλέφωνο.." required>

                            <label>Περιοχή</label>
                            <input type="text"  name="area" placeholder="Τηλέφωνο.." required>

                            <button id="accord1" class="accordion">Ταξιδιωτικές Εκδρομές +</button>


                            <div id="extra_fi" class="extra_fields">
                                <button type="button" id="add_more_tour_fields" class="accordion1">Επιπλέον Φόρμες</button>
                                <div id="tours">    
                                    <label >Αφετηρία </label>
                                    <input type="text"  name="tour_beginning" placeholder="Αφετηρία.." required>
                                    <label >Προορισμός </label>
                                    <input type="text"  name="tour_destination" placeholder="Προορισμός.." required>
                                    <label >Ώρα Αναχώρησης </label>
                                    <input type="text"  name="time_destination" placeholder="Ώρα Αναχώρησης.." required>
                                    <label >Ώρα Άφιξης </label>
                                    <input type="text"  name="time_arrival" placeholder="Ώρα Αφετηρίας.." required>
                                    <label >Τιμή </label>
                                    <input type="text"  name="price" placeholder="Τιμή.." required>

                                    <h3>Πακέτα Προσφορών</h3>
                                    <label>Άνω των</label>
                                    <select id="mainselection2" name="nubmer_of_people">
                                        <option value="2">2 Ατόμων</option>
                                        <option value="3">3 Ατόμων</option>
                                        <option value="4">4 Ατόμων</option>
                                        <option value="5">5 Ατόμων</option>
                                        <option value="6">6 Ατόμων</option>
                                    </select><br><br>
                                    <label >Μείωση τιμής κατά</label>
                                    <input type="text"  name="price_cut" placeholder="%">

                                </div>


                            </div>


                            <input type="submit" value="Αποθήκευση">
                            <input type="hidden" name="action" value="tour_office_update">
                        </form>



                        <div id="tour_office_modi">


                            <h4>Επέλεξε Γραφείο</h4>
                            <form  enctype="multipart/form-data" id="extra_fields_tour_offff" method="POST" action="DatabaseUpdate">
                                <select id="mainselection" name="tour_office_selection">

                                    <c:forEach items="${tourOfficeInfo}" var="tourOfficeName">
                                        <option value=${tourOfficeName.officeName}>${tourOfficeName.officeName}</option>

                                    </c:forEach>


                                </select>


                                <button type="button" id="add_more_tour_fields_butt" class="accordion1">Φόρμα</button>
                                <input type="hidden" name="action" value="existed_tour_office_update">



                                <div class="tour_office_forwardddd">
                                    <input type="submit" value="Αποθήκευση"> 

                                </div>


                            </form>





                        </div>








                    </div>


                    <div id="partnerss" class="dropdownContent">
                        <button class="partner_tab" id="hotel_partner">Ξενοδοχεία</button>
                        <button class="partner_tab" id="transport_P" >Εταιρίες Μεταφοράς </button>
                        <button class="partner_tab" id="" >Γραφεία Ενοικιάσεων </button>




                        <div id="partner_H" class="partner_tabcon">

                            <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">

                                <label >Ονομασία Ξενοδοχείου </label>
                                <input type="text"  name="" placeholder="Ονομασία.." required>
                                <label >Διεύθυνση Ξενοδοχείου </label>
                                <input type="text"  name="" placeholder="Διεύθυνση.." required>
                                <label > Kατηγορία Ξενοδοχείου</label>
                                <input type="text"  name="" placeholder="Kατηγορία.." required>
                                <label >Τηλέφωνο Ξενοδοχείου </label>
                                <input type="text"  name="" placeholder="Τηλέφωνο.." required>
                                <label >Αριθμός Ξενοδοχείου</label>
                                <input type="text"  name="" placeholder="Αριθμός.." required>
                                <label >Κατηγορία Δωματίων Ξενοδοχείου</label>
                                <input type="text"  name="" placeholder="Κατηγορία Δωματίων.." required>
                                <label >Τιμή Δωματίου </label>
                                <input type="text"  name="" placeholder="Τιμή .." required>


                                <input type="hidden" name="action" value="update">
                                <input type="submit" value="Αποθήκευση">

                            </form>
                        </div>

                        <div id="transport_partner" class="partner_tabcon">
                            <form  enctype="multipart/form-data" method="POST" action="DatabaseUpdate">
                                <label >Ιδιότητα</label><br>
                                <select id="mainselection">
                                    <option value="Αεροπορικία Εταιρία">Αεροπορικία Εταιρία </option>
                                    <option value="Ακτοπλοϊκία  Εταιρία">Ακτοπλοϊκία  Εταιρία</option>

                                </select><br><br>

                                <label >Ονομασία Εταιρίας </label>
                                <input type="text"  name="" placeholder="ονομασία.." required>
                                <label >Διεύθυνση Εταιρίας </label>
                                <input type="text"  name="" placeholder="Διεύθυνση.." required>
                                <label >Τηλέφωνο Εταιρίας </label>
                                <input type="text"  name="" placeholder="Τηλέφωνω.." required>
                                <label >Αφετηρία </label>
                                <input type="text"  name="" placeholder="Αφετηρία.." required>
                                <label >Προορισμός </label>
                                <input type="text"  name="" placeholder="Προορισμός.." required>


                                <input type="hidden" name="action" value="update">
                                <input type="submit" value="Αποθήκευση">
                            </form>

                        </div>


                    </div>


                </div>   
            </div>
    </body>
    <script type="text/javascript" src="view/MyScripts/databaseUpdateScript.js"></script>
</html>
