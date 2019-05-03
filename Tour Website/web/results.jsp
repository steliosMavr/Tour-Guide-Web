



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
        <link rel="stylesheet" href="view/MyCss/css/results.css">
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

                        <div class="alert alert-danger alert-dismissable">

                            <strong>Λαθος Στοιχεία</strong> Παρακαλούμε προσπαθήστε ξανά.
                        </div>
                        <input type="hidden" name="action" value="connection_form">
                        <button type="submit" class="btn btn-default">Σύνδεση</button>
                    </form>


                </div>

            </div>
        </div>




        <!-- Modal -->
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





            <div class="jumbotron">

                <div class="filter">
                    <h4>Καινούργια Αναζήτηση</h4>
                    <form class="form-inline" method="GET" action="BookingServlet">
                        <div class="form-group">   
                            <input type="text" class="form-control" placeholder="Προορισμός" name="destination" value="${destination}" required>
                        </div>

                        <div class="form-group">  
                            <input type="text" class="form-control" id="datepicker1" name="departure_date" placeholder="Ημ.Αναχώρησης" value="${departure_date}" required>
                        </div>

                        <div class="form-group">
                            <input type="text" class="form-control" id="datepicker" name="arrival_date"  placeholder="Ημ.Άφιξης" value="${arrival_date}"  required>
                        </div>



                        <select id="category" class="form-control select-target" name="categoryyy">

                            <option value="1">1 Κατηγορία </option>
                            <option value="2">2 Κατηγορία</option>
                            <option value="3">3 Κατηγορία</option>
                            <option value="4">4 Κατηγορία</option>
                            <option value="5">5 Κατηγορία</option>

                        </select>

                        <button type="submit" class="btn btn-default">Ανανέωση</button>

                        <input type="hidden" name="action" value="search_form">
                        <div style="text-align: center;">
                            <label class="checkbox-inline"><input type="checkbox" value="tourOffice" name="tourOfficeCheckBox">Εκδρομικά </label>
                            <label class="checkbox-inline"><input type="checkbox" value="rentOffice" name="rentOfficeCheckBox">Ενοικιαστικά  </label>

                            Ενήλικες:
                            <select  class="control-group inline" name="grownUps">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>


                            Παιδιά:
                            <select   class="control-group inline" name="children">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>

                            Μονόκλινα
                            <select  id="monokl" class="control-group inline" name="monoklina">
                                <option value="0">0</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                            </select>


                            Δίκλινα
                            <select   id="dikli" class="control-group inline" name="diklina">
                                <option value="0">0</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                            </select>


                        </div>

                    </form>

                </div>



                <h3 style="text-align: center;">Αποτελέσματα Αναζήτησης Για  ${destination}</h3>      
                <ul class="nav nav-tabs" >
                    <li class="active hotels"><a href="#">Ξενοδοχεία</a></li>
                    <li class="tourOffice" style="display: none" id="tour"><a href="#" >Εκδρομικά Γραφεία</a></li>
                    <li class="rentOffice"><a href="#" style="display: none" id="rent">Ενοικιαστικά Γραφεία</a></li>


                </ul>



                <div class="hotels_filter">
                    <h4>Φίλτρο Αναζήτησης</h4>
                    <div class="price_relative">
                        <h5>Επιλογή Τιμής</h5>
                        <div id="slider"></div>
                        <div id="slider_value"></div>

                        <select id="price_sorting" name="searchbygenerals[currency]" class="form-control select-target" style="margin-top: 16px;">
                            <option >Τιμή</option>
                            <option value="increace_price">Τιμή Αύξουσα</option>
                            <option value="decreace_price_results">Τιμή Φθίνουσα</option>
                        </select>



                    </div>

                    <div class="change_info">

                        <h5>Ταξιδιώτες</h5>
                        <select id="grownUps" name="" class="form-control select-target">
                            <option value="0" >Ενήλικες</option>
                            <option value="1">1 Ενήλικας</option>
                            <option value="2">2 Ενήλικες</option>
                            <option value="3">3 Ενήλικες</option>
                            <option value="4">4 Ενήλικες</option>  
                            <option value="5">5 Ενήλικες</option>
                            <option value="6">6 Ενήλικες</option>
                            <option value="7">7 Ενήλικας</option>
                            <option value="8">8 Ενήλικες</option>
                            <option value="9">9 Ενήλικες</option>
                            <option value="10">10 Ενήλικες</option>  

                        </select>
                        <br>
                        <select id="children" name="" class="form-control select-target">
                            <option value="0" >Παιδία</option>
                            <option value="1">1 Παιδί</option>
                            <option value="2">2 Παιδία</option>
                            <option value="3">3 Παιδία</option>
                            <option value="4">4 Παιδία</option>  
                            <option value="5">5 Παιδία</option>
                            <option value="6">6 Παιδία</option>
                            <option value="7">7 Παιδία</option>
                            <option value="8">8 Παιδία</option>
                            <option value="9">9 Παιδία</option>
                            <option value="10">10 Παιδία</option>  

                        </select>

                        <br>


                    </div>

                    <div class="rooms"> 
                        <h5>Δωμάτια</h5>
                        <select id="roomsChange" name="" class="form-control select-target">
                            <option value="0">Μονόκλινα</option>
                            <option value="1">1 Μονόκλινο</option>
                            <option value="2">2 Μονόκλινα</option>
                            <option value="3">3 Μονόκλινα</option>
                            <option value="4">4 Μονόκλινα</option>  
                            <option value="5">5 Μονόκλινα</option>
                            <option value="6">6 Μονόκλινο</option>
                            <option value="7">7 Μονόκλινα</option>
                            <option value="8">8 Μονόκλινα</option>
                            <option value="9">9 Μονόκλινα</option>  
                            <option value="10">10 Μονόκλινα</option>
                        </select>

                        <select id="roomsChange_2" name="" class="form-control select-target" style="margin-top: 19px;">
                            <option  value="0">Δίκλινα</option>
                            <option value="1">1 Δίκλινο</option>
                            <option value="2">2 Δίκλινα</option>
                            <option value="3">3 Δίκλινα</option>
                            <option value="4">4 Δίκλινα</option>  
                            <option value="5">5 Δίκλινα</option>
                            <option value="6">6 Δίκλινο</option>
                            <option value="7">7 Δίκλινα</option>
                            <option value="8">8 Δίκλινα</option>
                            <option value="9">9 Δίκλινα</option>  
                            <option value="10">10 Δίκλινα</option>
                        </select>



                    </div>



                </div>

                <div class="tour_filter">
                    <h4 style="margin-left:40px;">Φίλτρο Αναζήτησης</h4>
                    <div class="price_relative">
                        <h5>Επιλογή Τιμής</h5>
                        <div id="slider2" style="margin-left:140px;"></div>
                        <div id="slider_value2"></div>


                    </div>


                    <div class="numberOfpeopleAdjust" style="float:right; position: relative; right:100px;"><h5>Επιλογή Ατόμων</h5><h4><span id="numberOfPeople">1</span> X <span class="glyphicon glyphicon-user"></span><a href="#" name="plus">
                                <span class="glyphicon glyphicon-plus-sign"></a> <a href="#" name="sub">
                                <span class="glyphicon glyphicon-minus-sign"></span>
                            </a></span></h4> 
                        </a></div>


                    <div class="search" style="float: right; position: relative; right:230px;">

                        <h5>Αναζήτηση Εκδρομής</h5>
                        <input style="width:300px" id="tourSearch" type="text" class="form-control"  placeholder="Προορισμός" required>

                        <h5>Αναζήτηση Γραφείου</h5>
                        <input id="tourNameSearch" type="text" class="form-control"  placeholder="Όνομα Γραφείου"  required>
                    </div>





                </div>





                <c:forEach items="${officeList}" var="officeList">
                    <div class="well well-lg myTourOffices" style="margin-top:px; display: none;"> 


                        <table class="table" style="border-bottom: 1px solid black; padding: 10px; margin-top: 10px;">
                            <thead>
                                <tr class="danger">
                                    <th>Όνομα Γραφείου</th>
                                    <th>Διεύθηνση Γραφείου</th>
                                    <th>Τηλέφωνο Γραφείου</th>
                                    <th>Περιοχή</th>


                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td id="officeName">${officeList.officeName}</td>
                                    <td>${officeList.officeAddress}</td>
                                    <td>${officeList.officeTelephone}</td>
                                    <td>${officeList.area}</td>


                                </tr>

                            </tbody>
                        </table>



                        <h3 style="text-align: center;">Εκδρομές Που Διοργανώνονται</h3>

                        <table class="table">
                            <thead>
                                <tr class="success">
                                    <th>Προορισμός</th>
                                    <th>Αφετηρία</th>
                                    <th>Ωρα Αναχώρησης</th>
                                    <th>Ωρα Άφιξης</th>
                                    <th>Έκπτωση Ανω των</th>
                                    <th>Τιμή/Άτομο</th>
                                    <th>Έκπτωση</th>
                                    <th>Τελικη Τιμή</th>
                                    <th>Επιλογή</th>

                                </tr>
                            </thead>
                            <tbody>

                                <c:forEach var="entry" items="${toursMap}"  varStatus="status">             

                                    <c:forEach items="${entry.value}" var="item" varStatus="loop">
                                        <c:if test="${entry.key == officeList.officeName}">

                                            <tr class="myTable_tours">
                                                <td id="destination">${item.destination}</td>
                                                <td>${item.beggining}</td>
                                                <td>${item.destinationTime}</td>
                                                <td>${item.arrivalTime}</td>
                                                <td id="discountTrigger">${item.numberOfPeople} Ατόμων</td>
                                                <td id="pricePerson">${item.price}€</td>
                                                <td id="discount">${item.discount}%</td>                                           
                                                <td id="finalPrice"></td>
                                                <td> <button  style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block tourButton" >Κράτηση</button>


                                            </tr>


                                        </c:if>



                                    </c:forEach>


                                </c:forEach>



                            </tbody>
                        </table>
                    </div>
                </c:forEach>

                <div class="rentOffice_filter" >

                    <div style="float:left; padding: 10px;">
                        <h4>Οχήματα</h4>
                        <label class="checkbox-inline"><input type="checkbox" checked="checked" value="cars" id="car">Άμάξια</label>
                        <label class="checkbox-inline"><input type="checkbox"  checked="checked" value="motors" id="moto">Μηχανάκια</label>

                    </div>





                    <div class="search" style="float:left;margin-left: 150px; margin-top: 15px;">

                        <div class="form-group">
                            <h4>Αναζήτηση Οχήματος</h4>

                            <select class="form-control vehicles">
                                <option value="cars">Αμάξια</option>
                                <option value="moto">Μοτοσυκλέτες</option>


                            </select>
                        </div>
                        <form class="form-inline">
                            <div class="form-group">

                                <h5>Αναζήτηση Μοντέλου</h5>
                                <input id="modelSearch" type="text" class="form-control"  placeholder="Μοντέλο" >
                            </div>

                            <div class="form-group">

                                <h5>Αναζήτηση Κυβικών</h5>
                                <input id="searchByKv" type="text" class="form-control"  placeholder="Μεχρι Και"  required>
                            </div>

                            <button type="button" style="margin-top: 36px;" class="btn btn-default btn-md">Αναζήτηση</button>



                        </form>



                    </div>

                    <div class="price_relative3" style="float:right; padding: 20px; ">
                        <h4 >Επιλογή Τιμής</h4>
                        <div id="slider4" style="margin-left:50px;"></div>
                        <div id="slider_value4" style="margin-top:10px;"></div>




                    </div>



                </div>



                <c:forEach items="${rentOfficeList}" var="rentOfficeList">
                    <div class="well well-lg rentOffices">
                        <h3 style="text-align: center;">Πληροφορίες Γραφείου</h3>
                        <table class="table" style="border-bottom: 1px solid black; padding: 10px; margin-top: 10px;">
                            <thead>
                                <tr class="danger">
                                    <th>Όνομα Γραφείου</th>
                                    <th>Διεύθηνση Γραφείου</th>
                                    <th>Τηλέφωνο Γραφείου</th>
                                    <th>Περιοχή</th>


                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>${rentOfficeList.officeName}</td>
                                    <td>${rentOfficeList.officeAddress}</td>
                                    <td>${rentOfficeList.officeTelephone}</td>
                                    <td>${rentOfficeList.area}</td>



                                </tr>

                            </tbody>
                        </table>


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
                                        <c:if test="${entry.key == rentOfficeList.officeName}">

                                            <tr class="myTable_moto">
                                                <td>${item.motoLicenceNumber}</td>
                                                <td id="kv">${item.motoKv} KW</td>
                                                <td>${item.category}</td>
                                                <td id="charge">${item.chargePerDay}€</td>
                                                <td id="priceIncrease">${item.increaseCharge}€</td>
                                                <td id="motoFinalPrice">${item.chargePerDay}€</td>
                                                <td><input type="text"  class="from" name="from" required></td>
                                                <td><input type="text" class="until" name="until" required></td>
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
                                        <c:if test="${entry.key == rentOfficeList.officeName}">

                                            <tr class="myTable_car">
                                                <td>${item.licenceNumber}</td>
                                                <td id="carKV">${item.kv} KW</td>
                                                <td>${item.passengerSits}</td>
                                                <td>${item.category}</td>
                                                <td id="charge2">${item.chargePerDay}€</td>
                                                <td id="priceIncrease2">${item.increaseCharge}€</td>
                                                <td id="carFinalPrice">${item.chargePerDay}€</td>
                                                <td><input type="text"  class="from" name="from" required></td>
                                                <td><input type="text" class="until" name="until" required></td>
                                                <td> <button  style="display:inline-block; width: 80px; margin-bottom: 10px; padding:0px;"type="button" class="btn btn-primary btn-sm btn-block carBooking" >Κράτηση</button></td>



                                            </tr>


                                        </c:if>



                                    </c:forEach>


                                </c:forEach>



                            </tbody>
                        </table>


                    </div>
                </c:forEach>








                <div class="well_contain">
                    <c:forEach items="${hotelList}" var="hotelList">
                        <div class="well well-lg myHotels"> 

                            <img class="my_img" src="data:image/jpeg;base64,${hotelList.imgArray}">
                            <c:choose>
                                <c:when test="${hotelList.monoklina > monoklina && hotelList.diklina > diklina}">
                                    <span class="label label-success " style="font-size: 15px; position: relative; bottom:15px; ">Το Ξενοδοχείο Αυτο ειναι Διαθέσιμο</span>
                                </c:when>
                                <c:otherwise>
                                    <span class="label label-danger " style="font-size: 15px; position: relative; bottom:15px; ">Το Ξενοδοχείο Αυτο δεν ειναι Διαθέσιμο</span>
                                </c:otherwise>

                            </c:choose>


                            <div class="hotel_information">
                                <h2><a id="hotel_name" href="<c:url value="/BookingServlet?action=redirectToHotelsInfo&hotelName="/>${hotelList.name}">${hotelList.name}</a></h2>    




                                <h4><a  href="#" ><div id="star" class="hotel_star"></div></a></h4>



                                <span id="category" style="display: none">${hotelList.category}</span>


                                <h5><a href="#" class="group"id="hotel_telephone">${hotelList.telephone}</a></h5>
                                <h5><a href="#" class="group" id="hotel_area">${hotelList.area}</a><span class="glyphicon glyphicon-map-marker"></span></h5>


                                <div style="float: right; position: relative; bottom:200px;" >

                                    <h4>Για <span id="days">${days}</span> Νύχτες</h4>
                                    <span id="adults">${number_of_clients}</span> X
                                    <span id="people" class="glyphicon glyphicon-user"></span>
                                    Ενήλικες


                                    <br>
                                    <span id="children">${number_of_children}</span> X


                                    <span id="people" class="glyphicon glyphicon-user"></span>
                                    Παιδία


                                    <br>
                                    <br>
                                    <span id="monoklinaRooms">${monoklina}</span> Χ Μονόκλινα                                 
                                    <br>
                                    <span id="diklinaRooms"> ${diklina}</span> Χ Δίκλινα




                                    <h3> <a href="#" id="price">${hotelList.price}&euro;</a></h3>    
                                    <a id="initialPrice" style="display: none;">${hotelList.initialPrice}</a></h2>   
                                </div>


                            </div>


                        </div>


                    </div>


                    <c:if test="${hotelList.category == '5'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>
                        <c:forEach begin="0" end="4">
                            <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                        </c:forEach>
                    </c:if>

                    <c:if test="${hotelList.category == '4'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>
                        <c:forEach begin="0" end="3">
                            <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                        </c:forEach>
                    </c:if>




                </c:forEach>




            </div>



        </div>


        <c:if test = "${tourOfficeYes == 'true'}">

            <script>$("#tour").css("display", "");</script>

        </c:if>

        <c:if test = "${rentOffice == 'true'}">

            <script>$("#rent").css("display", "");</script>
        </c:if>



    </body>



    <script type="text/javascript" src="view/MyScripts/results.js"></script>
</html>
