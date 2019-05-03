
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
        <link rel="stylesheet" href="view/MyCss/css/hotelInfoCss.css">
        <title>JSP Page</title>
        <script>
            var myid;

            function generateRandmoId() {
                var text = "";
                var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                for (var i = 0; i < 5; i++)
                    text += possible.charAt(Math.floor(Math.random() * possible.length));
                myid = text;

            }
        </script>
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

        <div class="modal fade" id="myModal_2" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Ενοικιαστικά Γραφεία</h4>
                    </div>
                    <div class="modal-body">
                        <p>Μπορείτε να κάνετε επίσης κράτηση  κάποιων οχημάτων.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default"  data-dismiss="modal" id="rent_office_booking">Κράτηση Οχημάτων</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal" id="continue_only_hotel">Συνέχεια Κράτησης Ξενοδοχείου</button>

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

            <h3><span id="hotelName">${hotel.name}</span> <div id="star" class="hotel_star" style="color: yellow; display: inline;"></div><br><span id="category" style="display: none">${hotel.category}</span> <span id="hotelArea">${hotel.area}</span>,<span id="hotelAddress">${hotel.address}</span><span class="glyphicon glyphicon-map-marker"></span></h3><h4 id="hotelTelephone">Τηλ.${hotel.telephone} </h4>

            <div style="background-color: gray; width: 100%;">
                <div class="container" style="width:800px;">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target=#myCarousel data-slide-to=0 class=active></li>
                                <c:forEach begin="0" end="1" varStatus="loop">
                                <li data-target=#myCarousel data-slide-to=1 ></li>
                                </c:forEach>

                        </ol>


                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" >
                            <div class="item active" >
                                <img src="view//MyCss//images//${hotel.name}.jpg" style="width:100%; height: 400px;">
                            </div>

                            <c:forEach begin="1" end="2" varStatus="loop">

                                <div class="item">
                                    <img src="view//MyCss//images//${hotel.name} ${loop.index}.jpg" style="width:100%; height: 400px;">
                                </div>

                            </c:forEach>

                        </div>

                        <!-- Left and right controls -->
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>




            <c:if test="${hotel.category == '1'}">
                <script>
                    generateRandmoId();
                    $("#star").attr("id", myid);
                </script>

                <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>

            </c:if>

            <c:if test="${hotel.category == '2'}">
                <script>
                    generateRandmoId();
                    $("#star").attr("id", myid);
                </script>
                <c:forEach begin="0" end="1">
                    <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                </c:forEach>
            </c:if>


            <c:if test="${hotel.category == '3'}">
                <script>
                    generateRandmoId();
                    $("#star").attr("id", myid);
                </script>
                <c:forEach begin="0" end="2">
                    <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                </c:forEach>
            </c:if>

            <c:if test="${hotel.category == '4'}">
                <script>
                    generateRandmoId();
                    $("#star").attr("id", myid);
                </script>
                <c:forEach begin="0" end="3">
                    <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                </c:forEach>
            </c:if>

            <c:if test="${hotel.category == '5'}">
                <script>
                    generateRandmoId();
                    $("#star").attr("id", myid);
                </script>
                <c:forEach begin="0" end="4">
                    <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                </c:forEach>
            </c:if>


            <div style="margin-top: 10px;">

                <div style="display: none">
                    <span id="monoklina">${hotel.monoklina}</span>
                    <span id="diklina">${hotel.diklina}</span>

                </div>

                <div class="info" style="width: 550px; float: left;">
                    <h3>Πληροφορίες Ξενοδοχείου</h3>
                    ${hotel.perigrafi}



                </div>  



                <div class="hotelBooking" style="float: right; background-color: #4286f4; height: 600px; width: 400px;">
                    <div  style="text-align: center;">
                        <h3>Κράτηση Ξενοδοχείου</h3>
                    </div>

                    <div style="padding: 20px;" class="booking">
                        <div style="float:right;">
                            <h4> <span id="price">${hotel.price}</span> € /Άτομο</h4>
                            <h4> Τελική Τιμή:<span id="final_price">${hotel.price}</span> €</h4>
                        </div>

                        <h4><span id="peopleNumber">1</span> X <span class="glyphicon glyphicon-user"></span> Ενήλικες</h4>
                        <h4><span id="childrenNumber">0</span> X <span class="glyphicon glyphicon-user"></span> Παιδία</h4>
                        <br>

                        <label for="sel1">Ενήλικες</label>
                        <select class="form-control adults">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                        </select>
                        <br>
                        <label for="sel1">Παιδία</label>
                        <select class="form-control children" >
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                        </select>

                        <div id="rooms">
                            <h4>Δωμάτια</h4>
                        </div>

                        <label for="sel1">Μονόκλινα</label>
                        <select class="form-control monoklina">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                        </select>

                        <label for="sel1">Δίκλινα</label>
                        <select class="form-control diklina">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                            <option value="11">11</option>
                            <option value="12">12</option>
                            <option value="13">13</option>
                            <option value="14">14</option>
                            <option value="15">15</option>
                            <option value="16">16</option>
                            <option value="17">17</option>
                            <option value="18">18</option>
                            <option value="19">19</option>
                            <option value="20">20</option>
                        </select>
                        <br>

                        <div class="row" >
                            <div class="col-sm-4" >Ημμ.Άφιξης<input type="text"  id="datepicker1" name="departure_date" required></div>

                            <div class="col-sm-4" style="padding-left: 100px;">Ημμ.Αναχώρησης<input type="text"  id="datepicker" name="arrival_date" required></div>
                        </div>

                        <div class="row" style="margin-top:10px;" >

                            <div class="col-sm-4" ><button type="button" id="bookButton" class="btn btn-success " disabled>Κράτηση</button></div>
                            <div class="col-sm-8" style="padding-left: 70px;"><button type="button" id="available" class="btn btn-danger">Έλεγχος Διαθεσιμότητας</button></div>

                        </div>
                        <br>
                    </div>
                </div>




            </div>



        </div>  

        <div class="container" id="asd" style="margin-top: 20px; border-top: 1px solid grey; border-bottom:1px solid grey; padding-bottom: 10px;">



            <h3 style="text-align: center;">Διαθέσημα Γραφεία Ενοικίασεων</h3>
            <br>

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Όνομα Γραφείου</th>
                        <th>Διεύθυνση Γραφείου</th>
                        <th>Τηλέφωνο Γραφείου</th>
                        <th>Περιοχή Γραφείου</th>
                        <th>Οχήματα</th>


                    </tr>
                </thead>


                <c:forEach items="${officeList}" var="officeList">
                    <tbody class="offices_1">
                        <tr>
                            <td id="officeName">${officeList.officeName}</td>
                            <td>${officeList.officeAddress}</td>
                            <td>${officeList.officeTelephone}</td>
                            <td>${officeList.area}</td>
                            <td><a href="#" class="press_here">Εμφάνιση/Κλεισιμο</a></td>
                        </tr>

                    </tbody>
                </c:forEach>
            </table>




            <c:forEach items="${officeList}" var="officeList">
                <c:set value="${officeList.officeName}" var="cssClass"></c:set>

                    <div class="${cssClass}" style="padding-top: 20px; padding-bottom:20px; display: none;">


                    <table class="table motoTable">
                        <div id="motoTitle">
                            <h3 style="text-align: center;">Μοτοσυκλέτες</h3>
                        </div>
                        <thead>
                            <tr class="success">
                                <th>Άδεια Κυκλοφορίας</th>
                                <th>Κυβικά</th>
                                <th>Κατηγορία Μηχανής</th>
                                <th>Τιμή/Μέρα</th>
                                <th>Άυξηση Τιμής/Mέρα</th> 
                                <th>Τελική Τιμή</th>  
                                <th>Από</th>
                                <th>Έως</th>
                                <th>Επιλογή</th>
                            </tr>
                        </thead>
                        <tbody>


                            <c:forEach var="entry" items="${motorBikesMap}"  varStatus="status">             

                                <c:forEach items="${entry.value}" var="item" varStatus="loop">
                                    <c:if test="${entry.key == officeList.officeName}">

                                        <tr class="myTable_moto">
                                            <td>${item.motoLicenceNumber}</td>
                                            <td id="kv">${item.motoKv} KW</td>
                                            <td>${item.category}</td>
                                            <td id="charge">${item.chargePerDay}€</td>
                                            <td id="priceIncrease">${item.increaseCharge}€</td>
                                            <td id="motoFinalPrice">${item.chargePerDay}€</td>
                                            <td><input type="text"  class="datepicker2" name="from" required></td>
                                            <td><input type="text" class="datepicker3" name="until" required></td>
                                            <td> <button  style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block bookButton" >Κράτηση</button>
                                            </td>




                                        </tr>


                                    </c:if>



                                </c:forEach>


                            </c:forEach>



                        </tbody>
                    </table>
                    <table class="table carTable">
                        <div id="carTitle">
                            <h3 style="text-align: center;">Αμάξια</h3>
                        </div>


                        <thead>
                            <tr class="success">
                                <th>Άδεια Κυκλοφορίας</th>
                                <th>Κυβικά</th>
                                <th>Θέσης Επιβατών</th>
                                <th>Κατηγορία</th>
                                <th>Τιμή/Μέρα</th>
                                <th>Άυξηση Τιμής/Mέρα</th>
                                <th>Τελική Τιμή</th>

                                <th>Από</th>
                                <th>Έως</th>
                                <th>Επιλογή</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach var="entry" items="${carsMap}"  varStatus="status">             

                                <c:forEach items="${entry.value}" var="item" varStatus="loop">
                                    <c:if test="${entry.key == officeList.officeName}">

                                        <tr class="myTable_car">
                                            <td>${item.licenceNumber}</td>
                                            <td id="carKV">${item.kv} KW</td>
                                            <td>${item.passengerSits}</td>
                                            <td>${item.category}</td>
                                            <td id="charge">${item.chargePerDay}€</td>
                                            <td id="priceIncrease">${item.increaseCharge}€</td>
                                            <td id="motoFinalPrice">${item.chargePerDay}€</td>

                                            <td><input type="text"  class="datepicker2" name="from" required></td>
                                            <td><input type="text" class="datepicker3" name="until" required></td>
                                            <td> <button  style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block carBooking" >Κράτηση</button></td>


                                        </tr>


                                    </c:if>



                                </c:forEach>


                            </c:forEach>



                        </tbody>


                    </table>


                </div>
            </c:forEach>       










        </div>



    </body>
    <script type="text/javascript" src="view/MyScripts/hotelInfoBooking.js"></script>
</html>
