
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="view/MyCss/css/MyBookList.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div  class="header">
            <a href="<c:url value="/BookingServlet"/>"><img src="view/MyCss/images/Mylogo.png" alt="logo" width="150" height="50" /></a>
            <button type="button" class="btn btn-default"  data-toggle="modal" data-target="#register_modal" >Εγγραφή</button>
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#connect_modal" id="connection_button">Σύνδεση</button>
        </div>



        <div class="modal fade" id="register_modal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Εγγραφή</h4>
                    </div>



                    <form action="BookingServlet" id="register_form" method="post">
                        <div class="form-group">

                            <label for="text">Όνομα:</label>
                            <input type="text" class="form-control"  placeholder="Εισάγετε Όνομα" name="username" required>
                        </div>

                        <div class="form-group">

                            <label for="text">Επίθετο:</label>
                            <input type="text" class="form-control"  placeholder="Εισάγετε Επίθετο" name="lastname" required>
                        </div>
                        <div class="form-group">

                            <label for="email">Email:</label>
                            <input type="email" class="form-control"  placeholder="Εισάγετε Email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Κωδικός</label>
                            <input type="password" class="form-control"  placeholder="Εισάγετε Κωδικό" name="pwd" required>
                        </div>
                        <input type="hidden" name="action" value="register_form">

                        <button type="submit" class="btn btn-default">Εγγραφή</button>
                    </form>


                </div>

            </div>
        </div>

        <div class="modal fade" id="connect_modal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Σύνδεση</h4>
                    </div>

                    <form action="BookingServlet" id="register_form" method="POST">

                        <div class="form-group">

                            <label for="email">Email:</label>
                            <input type="email" class="form-control" id="email" placeholder="Εισάγετε Email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="pwd">Κωδικός</label>
                            <input type="password" class="form-control" id="pwd" placeholder="Εισάγετε Κωδικό" name="pwd"required>
                        </div>

                        <div class="alert alert-danger alert-dismissable" style="display: none;">

                            <strong>Λαθος Στοιχεία</strong> Παρακαλούμε προσπαθήστε ξανά.
                        </div>
                        <input type="hidden" name="action" value="connection_form">
                        <button type="submit" class="btn btn-default">Σύνδεση</button>
                    </form>


                </div>

            </div>
        </div>

        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog modal-sm">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Ευχαριστούμε για την προτίμηση σας</h4>
                    </div>
                    <div class="modal-body">
                        <p>Η Εγγραφή σας ηταν επιτυχής</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>

        <div class="under_header">
            <div class="dropdown">
                <button class="btn btn-default  dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Μενού
                    <span class="caret"></span></button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="<c:url value="/BookingServlet?action=redirectToHotels"/>">Ξενοδοχεία</a></li>
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="<c:url value="/BookingServlet?action=redirectToMesuem"/>">Μουσεία</a></li>
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="<c:url value="/BookingServlet?action=redirectToLandMarks"/>">Αξιοθέατα</a></li>
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Δρομολόγια </a></li>
                    <li class="divider"></li>
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Επικοινωνια </a></li>
                </ul>
            </div>


            <c:if test="${sessionScope.loggIn == 'true'}">
                <div class="menu">

                    <script>$("#connection_button").prop('disabled', true);</script>
                    <a href="#"><span class="glyphicon glyphicon-user"></span> ${sessionScope.user}</a>
                    <a href="<c:url value="/BookingServlet?action=myBookList"/>"><i class="glyphicon glyphicon-shopping-cart"></i> Όι Κρατησεις μου <span class="badge">0</span></a>

                    <a href="<c:url value="/BookingServlet?action=disconnect"/>"><span class="glyphicon glyphicon-log-out"></span> Αποσύνδεση</a>


                </div>

            </c:if>


            <c:if test = "${succesMessage == '1'}">
                <script>  $('#myModal').modal('show');</script>
            </c:if>




            <c:if test = "${errorMessage == '2'}">
                <script>
                    $('#connect_modal').modal('show');
                    $(".alert-dismissable").css("display", "block");
                </script>

            </c:if>



        </div>

        <div class="container">

            <c:if test='${empty sessionScope["bookingList"] ==false}'>      
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Ξενοδοχεία</a></h3>
                    <br>
                    <table class="table table-condensed">

                        <thead>
                            <tr>
                                <th >Όνομα Ξενοδοχείου</th>
                                <th>Κατηγορία Ξενοδοχείου</th>
                                <th>Περιοχή Ξενοδοχείου</th>
                                <th>Διεύθηνση Ξενοδοχείου</th>
                                <th>Τηλέφωνο Ξενοδοχείου</th>
                                <th>Τελική Τιμή</th>
                                <th>Ημμερομηνία Άφιξης</th>
                                <th>Ημμερομηνία Αναχώρησης</th>
                                <th>Ακύρωση Κράτησης</th>
                            </tr>
                        </thead>



                        <c:forEach items='${sessionScope["bookingList"]}' var="item" varStatus="loop">
                            <tbody class="myBookedHotels">
                                <tr>
                                    <td id="hotelName">${item.hotelName}</td>
                                    <td>${item.hotelCategoty}</td>
                                    <td>${item.hotelArea}</td>
                                    <td>${item.hotelAddress}</td>
                                    <td>${item.hotelTelephone}</td>
                                    <td>${item.finalPrice}</td>
                                    <td>${item.arrivalDate}</td>
                                    <td>${item.departureDate}</td>
                                    <td><button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block hotelCancelBooking">Ακύρωση</button></td>
                                </tr>

                            </tbody>

                        </c:forEach>
                    </table>



                </div>

            </c:if>
            <c:if test='${empty sessionScope["myMotoBookingList"] ==false}'>     
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Μοτοσυκλέτες</a></h3>
                    <br>
                    <table class="table table-condensed">

                        <thead>
                            <tr>
                                <th>Άδεια Κυκλοφορίας</th>
                                <th>Κυβικά</th>
                                <th>Κατηγορία Μηχανής</th>
                                <th>Τελική Τιμή</th>
                                <th>Από</th>
                                <th>Έως</th>
                                <th>Ακύρωση Κράτησης</th>

                            </tr>
                        </thead>



                        <c:forEach items='${sessionScope["myMotoBookingList"]}' var="item" varStatus="loop">
                            <tbody class="myBookedMoto">
                                <tr>
                                    <td id="licenceNumber">${item.licenceNumber}</td>
                                    <td>${item.kv}</td>                         
                                    <td>${item.motoCategory}</td>
                                    <td>${item.finalPrice}</td>
                                    <td>${item.from}</td>
                                    <td>${item.until}</td>

                                    <td><button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block motoCancelBooking">Ακύρωση</button></td>
                                </tr>

                            </tbody>

                        </c:forEach>
                    </table>


                </div>
            </c:if>

            <c:if test='${empty sessionScope["myCarBookingList"] ==false}'>     
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Αμάξια</a></h3>
                    <br>
                    <table class="table table-condensed">

                        <thead>
                            <tr>
                                <th>Άδεια Κυκλοφορίας</th>
                                <th>Θέσεις Επιβατών</th>
                                <th>Κυβικά</th>
                                <th>Κατηγορία Αμαξίου</th>
                                <th>Τελική Τιμή</th>
                                <th>Από</th>
                                <th>Έως</th>
                                <th>Ακύρωση Κράτησης</th>

                            </tr>
                        </thead>



                        <c:forEach items='${sessionScope["myCarBookingList"]}' var="item" varStatus="loop">
                            <tbody class="myBookedCar">
                                <tr>
                                    <td id="licenceNumber">${item.licenceNumber}</td>
                                    <td>${item.passengerSits}</td>   
                                    <td>${item.kv}</td>                         
                                    <td>${item.carCategory}</td>
                                    <td>${item.finalPrice}</td>
                                    <td>${item.from}</td>
                                    <td>${item.until}</td>

                                    <td><button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block carCancelBooking">Ακύρωση</button></td>
                                </tr>

                            </tbody>

                        </c:forEach>
                    </table>


                </div>

            </c:if>
            <c:if test='${empty sessionScope["myTourBookingList"] ==false}'>    
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Εκδρομές</a></h3>
                    <br>
                    <table class="table table-condensed">

                        <thead>
                            <tr>
                                <th>Προορισμός</th>
                                <th>Αφετηρία</th>
                                <th>Ώρα Αναχώρησης</th>
                                <th>Ώρα Άφιξης</th>
                                <th>Τελική Τιμή</th>             
                                <th>Ακύρωση Κράτησης</th>

                            </tr>
                        </thead>



                        <c:forEach items='${sessionScope["myTourBookingList"]}' var="item" varStatus="loop">
                            <tbody>
                                <tr>
                                    <td>${item.destination}</td>
                                    <td>${item.beggining}</td>   
                                    <td>${item.dateTimeDeparture}</td>                         
                                    <td>${item.dateTimeArrival}</td>
                                    <td>${item.finalPrice}</td>
                                    <td><button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block tourCancelBooking">Ακύρωση</button></td>
                                </tr>

                            </tbody>

                        </c:forEach>
                    </table>


                </div>

            </c:if>

            <c:if test='${empty sessionScope["MyAeroplaneBookingList"] ==false}'>     
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Πτήσεις</a></h3>
                    <br>
                    <table class="table table-condensed">

                        <thead>
                            <tr>
                                <th>Όνομα Εταιρίας</th>
                                <th>Ημερομηνία Αναχώρησης</th>
                                <th>Ώρα Αναχώρησης</th>
                                <th>Ώρα Άφιξης</th>
                                <th>Από Αεροδρόμιο</th>
                                <th>Πρός Αεροδρόμιο</th>
                                <th>Από</th>
                                <th>Πρός</th>
                                <th>Τιμή</th>
                                <th>Επιλογή</th>

                            </tr>
                        </thead>



                        <c:forEach items='${sessionScope["MyAeroplaneBookingList"]}' var="item" varStatus="loop">
                            <tbody>
                                <tr>
                                    <td>${item.companyName}</td>
                                    <td>${item.departureDate}</td>   
                                    <td>${item.departureTime}</td>                         
                                    <td>${item.arrivaTime}</td>
                                    <td>${item.fromAirport}</td>
                                    <td>${item.toAirport}</td>
                                    <td>${item.fromCountry}</td>
                                    <td>${item.toCountry}</td>
                                    <td>${item.price}</td>

                                    <td><button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block aeroplaneCancelBooking">Ακύρωση</button></td>
                                </tr>

                            </tbody>

                        </c:forEach>
                    </table>


                </div>

            </c:if>


            <c:if test='${empty sessionScope["MyAeroplaneBookingList_2"] ==false}'>     
                <div class="jumbotron">

                    <h3 style="text-align: center;"><a href="#">Πτήσεις Με Επιστροφή</a></h3>
                    <br>
                    <c:forEach items='${sessionScope["MyAeroplaneBookingList_2"]}' var="item" varStatus="loop">
                        <div style="border: 1px solid black;" class="twoWaysAeroplane">
                            <table class="table table-condensed">

                                <thead>
                                    <tr>
                                        <th>Όνομα Εταιρίας</th>
                                        <th>Ημερομηνία Αναχώρησης</th>
                                        <th>Ώρα Αναχώρησης</th>
                                        <th>Ώρα Άφιξης</th>
                                        <th>Από Αεροδρόμιο</th>
                                        <th>Πρός Αεροδρόμιο</th>
                                        <th>Από</th>
                                        <th>Πρός</th>
                                        <th>Τιμή</th>


                                    </tr>
                                </thead>




                                <tbody>
                                    <tr class="twoWays">
                                        <td class="companyName">${item.companyName}</td>
                                        <td>${item.departureDate}</td>   
                                        <td>${item.departureTime}</td>                         
                                        <td>${item.arrivaTime}</td>
                                        <td>${item.fromAirport}</td>
                                        <td>${item.toAirport}</td>
                                        <td class="from">${item.fromCountry}</td>
                                        <td class="toL">${item.toCountry}</td>
                                        <td>${item.price}</td>


                                    </tr>

                                </tbody>


                            </table>
                        </div>



                        <c:if test = "${loop.index%2!=0}">
                            <button style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px ;"type="button" class="btn btn-primary btn-sm btn-block  cancelTwoWays">Ακύρωση</button>

                        </c:if>



                    </c:forEach>

                </div>

            </c:if>


            <c:if test='${empty sessionScope["myTourBookingList"] ==true && empty sessionScope["myCarBookingList"] ==true && empty sessionScope["myMotoBookingList"]==true && empty sessionScope["bookingList"]==true && empty sessionScope["MyAeroplaneBookingList"]==true && empty sessionScope["MyAeroplaneBookingList_2"]==true}'>  
                <h3 style="text-align: center;">Δέν Βρέθηκαν Κάποιες Κρατήσεις</h3>
            </c:if>

        </div>




    </body>
    <script>
        $(".aeroplaneCancelBooking").click(function () {

            var companyName = $(this).closest("tr").find("td:eq(0)").text();
            var from = $(this).closest("tr").find("td:eq(6)").text();
            var to = $(this).closest("tr").find("td:eq(7)").text();


            $.ajax({
                type: 'post',
                url: 'BookingServlet',
                data: {companyName: companyName, from: from, to: to, action: "cancelAeroplaneBooking"},
                success: function (data) {


                    alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
                    location.reload();


                }, error: function () {
                    alert('error');
                }



            });


        });


        $(".cancelTwoWays").click(function () {

            var fromC = $(this).prev().prev();
            var toC = $(this).prev();


            var company = fromC.find(".companyName").text();
            var from = fromC.find(".from").text();



            $.ajax({
                type: 'post',
                url: 'BookingServlet',
                data: {company: company, from: from, action: "cancelTwoWaysAeroplaneBooking"},
                success: function (data) {

                }, error: function () {
                    alert('error');
                }



            });

            company = toC.find(".companyName").text();
            from = toC.find(".from").text();



            $.ajax({
                type: 'post',
                url: 'BookingServlet',
                data: {company: company, from: from, action: "cancelTwoWaysAeroplaneBooking"},
                success: function (data) {
                    alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
                    location.reload();

                }, error: function () {
                    alert('error');
                }



            });




        });


    </script>
    <script type="text/javascript" src="view/MyScripts/myBookList.js"></script>
</html>
