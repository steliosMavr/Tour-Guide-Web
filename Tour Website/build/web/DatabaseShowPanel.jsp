
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <link rel="stylesheet" href="view/MyCss/css/DatabaseShowPanel.css"/> 
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${sessionScope.user != 'true'}">
            <c:redirect url="LoginForm.jsp"/>
        </c:if>

        <jsp:include page="Header.jsp"></jsp:include>
        <jsp:include page="Sidebar.jsp"></jsp:include>

            <div class="content">
                <div id="databaseShowPanel" >
                    <div class="title"><h1>Εμφάνιση Αποτελεσμάτων Βάσης Δεδομένων</h1></div> 
                </div>

                <button id="hotels_exapand" class="accordion">Ξενοδοχεία</button>
                <div class="hotel_panel">
                    <table class="table">
                        <tr class="header">
                            <th style="width:5%;">ID</th>
                            <th style="width:10%;">Όνομα Ξενοδοχείου</th>
                            <th style="width:10%;">Διεύθηνση Ξενοδοχείου</th>
                            <th style="width:10%;">Κατηγορία Ξενοδοχείου</th>
                            <th style="width:10%;">Τηλέφωνο Ξενοδοχείου</th>
                            <th style="width:10%;">Αριθμός Ξενοδοχείου</th>
                            <th style="width:10%;">Κατηγορία Δωματίου Ξενοδοχείου</th>
                            <th style="width:10%;">Τιμή Ξενοδοχείου</th>
                        </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID">${hotelList.id}</td>
                            <td>${hotelList.name}</td>
                            <td>${hotelList.address}</td>
                            <td>${hotelList.category}</td>
                            <td>${hotelList.telephone}</td>
                            <td>${hotelList.number}</td>
                            <td>${hotelList.roomCategory}</td>
                            <td>${hotelList.price}</td>

                        </tr>
                    </c:forEach>

                </table>



            </div>

            <button id="office_expand" class="accordion">Γραφεία</button>
            <div class="office_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Όνομα Γραφείου</th>
                        <th style="width:10%;">Διεύθυνση Γραφείου</th>
                        <th style="width:10%;">Τηλέφωνο Γραφείου</th>
                        <th style="width:10%;">Εμφάνηση  Οχημάτων</th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>Πάτα <a href="#">Εδώ</a></td>
                        </tr>
                    </c:forEach>

                </table>



            </div>

            <button id="museum_expand" class="accordion">Μουσεία</button>
            <div class="museum_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Όνομα Μουσείου </th>
                        <th style="width:10%;">Διεύθυνση Μουσείου </th>
                        <th style="width:10%;">Τοποθεσία Μουσείου </th>
                        <th style="width:10%;">Τηλέφωνο  Μουσείου</th>
                        <th style="width:10%;">Τιμή Μουσείου</th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>

                        </tr>
                    </c:forEach>

                </table>



            </div>


            <button id="landmarks_expand" class="accordion">Αξιοθέατα</button>
            <div class="landmarks_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Όνομα </th>            
                        <th style="width:10%;">Τοποθεσία  </th>
                        <th style="width:10%;">Τηλέφωνο </th>
                        <th style="width:10%;">Τιμή</th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>


                        </tr>
                    </c:forEach>

                </table>



            </div>


            <button id="aeroplane_routes_expand" class="accordion">Δρομολόγια Αεροπλάνων</button>
            <div class="aeroplane_routes_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Αεροδρομίου </th>            
                        <th style="width:10%;">Ώρα Αναχώρησης  </th>
                        <th style="width:10%;">Προορισμός Αεροπλάνου(Ονομασία) </th>
                        <th style="width:10%;">Ώρα Άφηξης </th>
                        <th style="width:10%;">Από(Μέρος) </th>
                        <th style="width:10%;">Πρός(Μέρος) </th>
                        <th style="width:10%;">Τιμή </th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>


                        </tr>
                    </c:forEach>

                </table>



            </div>

            <button id="ships_routes_expand" class="accordion">Δρομολόγια Πλοίων</button>
            <div class="ships_routes_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Λιμανίου </th>            
                        <th style="width:10%;">Ώρα Αναχώρησης  </th>
                        <th style="width:10%;">Προορισμός Λιμανίου(Ονομασία) </th>
                        <th style="width:10%;">Ώρα Άφηξης </th>
                        <th style="width:10%;">Από(Μέρος) </th>
                        <th style="width:10%;">Πρός(Μέρος) </th>
                        <th style="width:10%;">Τιμή </th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>


                        </tr>
                    </c:forEach>

                </table>



            </div>


            <button id="tour_offices_expand" class="accordion">Εκδρομικά Γραφεία</button>
            <div class="tour_offices_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Γραφείου </th>            
                        <th style="width:10%;">Διεύθηνση Γραφείου  </th>
                        <th style="width:10%;">Τηλέφωνο Γραφείου</th>
                        <th style="width:10%;">Εκδρομές</th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td>Πάτα <a href="#">Εδώ</a></td>
                        </tr>
                    </c:forEach>

                </table>



            </div>


            <button id="partner_hotel_expand" class="accordion">Ξενοδοχεία(Συνεργάτες)</button>
            <div class="partner_hotel_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Ξενοδοχείου  </th>            
                        <th style="width:10%;">Διεύθυνση Ξενοδοχείου   </th>
                        <th style="width:10%;">Kατηγορία Ξενοδοχείου</th>
                        <th style="width:10%;">Τηλέφωνο Ξενοδοχείου </th>
                        <th style="width:10%;">Αριθμός Ξενοδοχείου</th>
                        <th style="width:10%;">Κατηγορία Δωματίων Ξενοδοχείου </th>
                        <th style="width:10%;">Τιμή Δωματίου  </th>

                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td></td>
                        </tr>
                    </c:forEach>

                </table>



            </div>



            <button id="aeroplane_transport_expand" class="accordion">Εταιρίες Μεταφοράς(Αεροπορικές)</button>
            <div class="aeroplane_transport_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Εταιρίας   </th>            
                        <th style="width:10%;">Διεύθυνση Εταιρίας    </th>
                        <th style="width:10%;">Τηλέφωνο Εταιρίας </th>
                        <th style="width:10%;">Αφετηρία  </th>
                        <th style="width:10%;">Προορισμός </th>


                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td></td>
                            <td></td>

                        </tr>
                    </c:forEach>

                </table>



            </div>


            <button id="ships_transport_expand" class="accordion">Εταιρίες Μεταφοράς(Ακτοπλοίκιες)</button>
            <div class="ships_transport_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομασία Εταιρίας   </th>            
                        <th style="width:10%;">Διεύθυνση Εταιρίας    </th>
                        <th style="width:10%;">Τηλέφωνο Εταιρίας </th>
                        <th style="width:10%;">Αφετηρία  </th>
                        <th style="width:10%;">Προορισμός </th>


                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td></td>
                            <td></td>

                        </tr>
                    </c:forEach>

                </table>



            </div>

            <button id="custumers_expand" class="accordion">Πληροφορίες Πελατών</button>
            <div class="custumers_panel">
                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Ονομα Πελάτη   </th>      
                        <th style="width:10%;">Επίθετο Πελάτη   </th>      
                        <th style="width:10%;">Διεύθυνση Πελάτη    </th>
                        <th style="width:10%;">Τηλέφωνο Πελάτη </th>
                        <th style="width:10%;">Email Πελάτη </th>
                    </tr>
                    <c:forEach items="${hotelList}" var="hotelList">
                        <tr>
                            <td id="databaseID"></td>
                            <td></td>
                            <td></td>
                            <td></td> 
                            <td></td>


                        </tr>
                    </c:forEach>

                </table>



            </div>



        </div>

    </body>
    <script type="text/javascript" src="view/MyScripts/databaseShowPanel.js"></script>
</html>
