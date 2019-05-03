

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
        <link rel="stylesheet" href="view/MyCss/css/hotels.css">
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

            <button type="button" class="btn btn-default"  data-toggle="modal" data-target="#register_modal">Εγγραφή</button>

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
                            <input tpe="password" class="form-control" id="pwd" placeholder="Εισάγετε Κωδικό" name="pwd"required>
                        </div>

                        <div class="alert alert-danger alert-dismissable">

                            <strong>Λαθος Στοιχεία</strong> Παρακαλούμε προσπαθήστε ξανά.
                        </div>

                        <input type="hidden" name="action" value="connection_form_index">
                        <button type="submit" class="btn btn-default">Σύνδεση</button>
                    </form>


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
                    <a href="#"><span class="glyphicon glyphicon-user"></span>  ${sessionScope.user}</a>        
                    <a href="<c:url value="/BookingServlet?action=disconnect"/>"><span class="glyphicon glyphicon-log-out"></span> Αποσύνδεση</a>
                </div>

            </c:if>


            <c:if test = "${errorMessage == '2'}">
                <script>
                    $('#connect_modal').modal('show');
                    $(".alert-dismissable").css("display", "block");
                </script>

            </c:if>




        </div>





        <div class="well_container" >
            <div class="well well-sm" >
                <label class="radio-inline"><input type="radio" name="optradio" id="hotel_radio_buttn" value="hotel">Ξενοδοχεία</label>
                <label class="radio-inline "><input type="radio" name="optradio" id="flights_radio_buttn" value="flights">Πτήσεις</label>

                <form class="form-inline" action="" id="hotel_search_form" style="width: 1040px">
                    <div class="form-group">
                        <input type="text" class="form-control input-sm" id="" placeholder="Προορισμός" name="destination" required>
                    </div>
                    <div class="form-group">

                        <input type="text" class="form-control input-sm"  placeholder="Αναχώρηση" id="datepicker2" name="departure_date" required>
                    </div>
                    <div class="form-group">   
                        <input type="text" class="form-control  input-sm"  placeholder="Άφιξη" id="datepicker1" name="arrival_date" required>
                    </div>



                    <div class="form-group" style="margin-left: 5px;">
                        Δίκλινα

                        <select  name="diklina">

                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </div>

                    <div class="form-group" >
                        Μονόκλινα

                        <select name="monoklina">

                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </div>


                    <div class="form-group">
                        Ενήλικες

                        <select  name="grownUps">

                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>
                    </div>


                    <div class="form-group">
                        Παιδία

                        <select name="children">

                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                        </select>   
                    </div>

                    <div class="form-group">
                        Κατηγορία

                        <select  name="categoryyy">

                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>

                        </select>   
                    </div>
                    <input type="hidden" name="action" value="search_form">


                    <div class="form-group">
                        <button type="submit" class="btn btn-default btn-sm">  <span class="glyphicon glyphicon-search"></span> Αναζήτηση</button>
                    </div>
                </form>



                <form class="form-inline" action="" id="flight_search_form" style="width: 1040px">

                    <div class="form-group">

                        <input type="text" class="form-control input-sm" id="" placeholder="Αναχώρηση Από " name="">
                    </div>

                    <div class="form-group">

                        <input type="text" class="form-control input-sm" id="" placeholder="Προορισμός " name="">
                    </div>

                    <div class="form-group">

                        <input type="text" class="form-control input-sm"  placeholder="Ημμ.Αναχώρηση " id="datepicker5">
                    </div>


                    <div class="form-group">   
                        <input type="text" class="form-control input-sm"  placeholder="Ημμ.Επιστροφής " id="datepicker6">
                    </div>

                    <div class="form-group">
                        Άτομα

                        <select >

                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                        </select>
                    </div>



                    <button type="submit" class="btn btn-default btn-sm">  <span class="glyphicon glyphicon-search"></span> Αναζήτηση</button>

                </form>
            </div>
        </div>








        <div class="container">


            <div class="panel panel-primary" style="width:300px;">
                <div class="panel-heading" style="background-color:brown;"><h5 style="text-align: center;">Φίλτρα για Γρηγορότερη Αναζήτηση</h5></div>
                <div class="panel-body" style="padding: 0px; background-color: orange;">

                    <div class="slider " style="border-top: 1px solid black; border-bottom: 1px solid black;">
                        <h5>Τιμή</h5>
                        <div id="slider"></div>
                        <div id="slider_value"></div>
                    </div>


                    <div class="input-group" style="margin-top:80px; width: 100%; border-top: 1px solid black; border-bottom: 1px solid black; padding: 20px;">

                        <input id="area_search"type="text" class="form-control" placeholder=" Αναζήτηση Περιοχής" aria-describedby="basic-addon1">

                    </div>




                    <form method="GET" action="BookingServlet">
                        <div class="form-group" style="margin-top:80px; border-top: 1px solid black; padding: 10px;" >
                            <label for="usr">Προορισμος</label>
                            <input type="text" class="form-control" name="destination" required>

                        </div>


                        <div class="form-group" style="padding: 10px;">
                            <label for="text">Ημερομηνία αναχώρησης</label>
                            <input type="text" class="form-control" id="datepicker7" name="departure_date" required>
                        </div>


                        <div class="form-group" style="padding: 10px;">
                            <label for="text">Ημερομηνία άφιξης</label>
                            <input type="text" class="form-control" id="datepicker8"  name="arrival_date" required>
                        </div>

                        <h4 style="text-align: center;">Δωμάτια</h4>
                        <br>

                        <div  style="text-align: center;">
                            <label for="sel1">Μονόκλινα</label>

                            <select class="control-group inline"   name="monoklina">

                                <option>0</option>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>


                            <label for="sel1">Δίκλινα</label>

                            <select class="control-group inline" name="diklina">

                                <option>0</option>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>

                            <label for="sel1">Κατηγορία</label>

                            <select class="control-group inline " name="categoryyy" style="width: 270px;;">


                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>

                            </select>


                            <br>
                            <br>

                            <h4 style="text-align: center;">Ταξιδιώτες</h4>



                            <label for="sel1">Παιδία</label>

                            <select class="control-group inline"name="children">

                                <option>0</option>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>


                            <label for="sel1">Ενήλικες</label>

                            <select class="control-group inline"  name="grownUps">

                                <option>0</option>
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>
                        </div>

                        <input type="hidden" name="action" value="search_form">
                        <button type="sumbit" class="btn btn-primary btn-block">ανανεωση</button>
                    </form>
                </div>
            </div>


            <div class="properties">


                <div class="input-group input-group-lg" id="top_selection">
                    <span class="input-group-addon " title="" id="priceLabel" >Ταξινόμηση αποτελεσμάτων κατά:</span>  
                    <button type="button" class="btn btn-primary  form-control">Προτεινόμενα</button>
                    <span class="input-group-addon" style="width:0px; padding-left:0px; padding-right:0px; border:none;"></span>

                    <select id="price_sorting" name="searchbygenerals[currency]" class="form-control select-target">
                        <option >Τιμή</option>
                        <option value="increace_price">Τιμή Αύξουσα</option>
                        <option value="decreace_price_results">Τιμή Φθίνουσα</option>
                    </select>

                    <span class="input-group-addon" style="width:0px; padding-left:0px; padding-right:0px; border:none;"></span>

                    <select id="category_selection" name="searchbygenerals[currency]" class="form-control">
                        <option value="0">Ολες</option>
                        <option value="1">1 Κατηγορία</option>
                        <option value="2">2 Κατηγορία</option>
                        <option value="3">3 Κατηγορία</option>
                        <option value="4">4 Κατηγορία</option>
                        <option value="5">5 Κατηγορία</option>
                    </select>





                </div>
            </div>


            <div class="well_contain">
                <c:forEach items="${hotelList}" var="hotelList">

                    <c:set var="success" value="false" scope="page" />
                    <c:set var="successs" value="false" scope="page" />

                    <div class="well well-lg" id="myInfo">  


                        <img id="my_img" src="data:image/jpeg;base64,${hotelList.imgArray}"  height="225" width="200" style="float: left;">


                        <div class="hotel_information">



                            <h3><a href="#" id="price" class="as">${hotelList.price} &euro;/Άτομο</a></h3>    
                            <h2><p id="hotel_name"><a href="<c:url value="/BookingServlet?action=redirectToHotelsInfo&hotelName="/>${hotelList.name}">${hotelList.name}</a></p></h2>                 
                            <h4><a  href="#" ><div id="star" class="hotel_star"></div></a></h4>
                            <span id="category" style="display: none">${hotelList.category}</span>


                            <h5><a href="#" class="group"id="hotel_telephone">${hotelList.telephone}</a></h5>
                            <h5><a href="#" class="group" id="hotel_area">${hotelList.area}</a><span class="glyphicon glyphicon-map-marker"></span></h5>




                        </div>

                        <c:if test="${hotelList.monoklina > 0 || hotelList.diklina > 0}">

                            <div class="alert alert-success  col-md-5" style="position: relative; bottom: 147px; left:280px; text-align: center;">
                                <strong id="successful_text">Αυτό το Ξενοδοχείο ειναι διαθέσημο!</strong>
                            </div>
                        </c:if>

                        <c:if test="${hotelList.monoklina == 0 && hotelList.diklina == 0}">
                            <div class="alert alert-danger  col-md-5" style="position: relative; bottom: 147px; left:280px; text-align: center;">
                                <strong id="danger_text">Αυτό το Ξενοδοχείο δεν ειναι διαθέσημο</strong>
                            </div>
                        </c:if>






                        <button type="button" class="btn btn-info" id="hotel_select">Περισσότερες Πληροφορίες</button>


                        <ul class="nav nav-tabs" style="margin-top: 100px;" >                  
                            <li class="active photo_gallery" id="photo_li"><a href="#" >Φωτογραφίες</a></li>
                            <li class="office"><a href="#">Ενοικιαστικά Γραφεία της Περιοχής</a></li>
                            <li class="office_tour"><a href="#">Εκδρομικά Γραφεία της Περιοχής</a></li>

                        </ul>   


                        <div class="carousel slide article-slide" id="article-photo-carousel">

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner cont-slider">

                                <div class="item active">
                                    <img src="view//MyCss//images//${hotelList.name}.jpg"  style="width:600px; height:600px;">
                                </div>

                                <c:forEach begin="1" end="2" varStatus="loop">
                                    <div class="item">
                                        <img src="view//MyCss//images//${hotelList.name} ${loop.index}.jpg"   style="width:600px; height:600px;">
                                    </div>

                                </c:forEach>


                            </div>
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li class="active gallery" data-slide-to="0" data-target="#article-photo-carousel">
                                    <img src="view//MyCss//images//${hotelList.name}.jpg">
                                </li>
                                
                                <c:forEach begin="1" end="2" varStatus="loop">
                                    <li class="gallery"  data-target="#article-photo-carousel">
                                    <img src="view//MyCss//images//${hotelList.name} ${loop.index}.jpg"  >
                                </li>
                                    
                                </c:forEach>
                                
                                
                                
                               
                            </ol>
                        </div>



                        <div class="office_rent">   
                            <table class="table" style="position: relative; bottom: 20px;">
                                <thead>
                                    <tr>

                                        <th>Όνομα Γραφείου</th>
                                        <th>Διεύθυνση Γραφείου</th>
                                        <th>Τηλέφωνο Γραφείου</th>
                                        <th>Περιοχή Γραφείου</th>
                                        <th>Πληροφορίες Οχημάτων</th>
                                    </tr>
                                </thead>


                                <tbody class="myTbody">
                                    <c:forEach var="entry" items="${officeMap}"  varStatus="status">             

                                        <c:forEach items="${entry.value}" var="item" varStatus="loop">

                                            <c:if test="${item.area == hotelList.area}">
                                                <c:set var="success" value="true" scope="page" />

                                                <tr class="my_tr">

                                                    <td id="officeName_table">${item.officeName}</td>
                                                    <td id="officeAddresss_table">${item.officeAddress}</td>
                                                    <td id="officeTelephone_table">${item.officeTelephone}</td>
                                                    <td id="officeArea_table">${item.area}</td>
                                                    <td class="press_here"><a href="#">Πατήστε ΕΔΩ</a></td>



                                                </tr>





                                            </c:if>


                                        </tbody>

                                    </c:forEach><br>




                                </c:forEach>    



                                <c:if test="${success == 'false'}">


                                    <tbody>
                                        <tr class="error_tr">

                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>



                                        </tr>


                                    </tbody>
                                </c:if>






                            </table>





                        </div>


                        <div class="tour_office">


                            <table class="table" style="position: relative; bottom: 20px;">
                                <thead>
                                    <tr>

                                        <th>Όνομα Γραφείου</th>
                                        <th>Διεύθυνση Γραφείου</th>
                                        <th>Τηλέφωνο Γραφείου</th>
                                        <th>Περιοχή Γραφείου</th>
                                        <th>Εκδρομές</th>

                                    </tr>
                                </thead>


                                <tbody class="myTbody2">
                                    <c:forEach var="entry" items="${tourOfficeMap}"  varStatus="status">             

                                        <c:forEach items="${entry.value}" var="item" varStatus="loop">

                                            <c:if test="${item.area == hotelList.area}">
                                                <c:set var="successs" value="true" scope="page" />

                                                <tr class="my_tr2">

                                                    <td>${item.officeName}</td>
                                                    <td>${item.officeAddress}</td>
                                                    <td>${item.officeTelephone}</td>
                                                    <td>${item.area}</td>
                                                    <td class="press_here_tour"><a href="#">Πατήστε ΕΔΩ</a></td>



                                                </tr>





                                            </c:if>


                                        </tbody>

                                    </c:forEach><br>




                                </c:forEach>    



                                <c:if test="${successs == 'false'}">


                                    <tbody>
                                        <tr class="error_tr2">

                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>
                                            <td>Δέν Βρέθηκαν Αποτελέσματα</td>




                                        </tr>


                                    </tbody>
                                </c:if>






                            </table>



                        </div>





                    </div>



                    <c:if test="${hotelList.category == '1'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>

                        <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>

                    </c:if>

                    <c:if test="${hotelList.category == '2'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>
                        <c:forEach begin="0" end="1">
                            <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                        </c:forEach>
                    </c:if>


                    <c:if test="${hotelList.category == '3'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>
                        <c:forEach begin="0" end="2">
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

                    <c:if test="${hotelList.category == '5'}">
                        <script>
                            generateRandmoId();
                            $("#star").attr("id", myid);
                        </script>
                        <c:forEach begin="0" end="4">
                            <script>$("#" + myid).append('<span class="glyphicon glyphicon-star"></span>')</script>
                        </c:forEach>
                    </c:if>




                </c:forEach>    


            </div>







            <div id="vehivle_modal" class="modal fade" role="dialog" >
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h3 class="modal-title" style="text-align: center;">Οχήματα</h3>
                        </div>
                        <div id="office_vehicle_body">





                        </div>

                    </div>

                </div>
            </div>


            <div id="tours_modal" class="modal fade" role="dialog" >
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h3 class="modal-title" style="text-align: center;">Πληροφορίες Εκδρομών</h3>
                        </div>
                        <div id="tours_body">





                        </div>

                    </div>

                </div>
            </div>


        </div>




    </body>
    <script type="text/javascript" src="view/MyScripts/hotels.js"></script>

</html>
