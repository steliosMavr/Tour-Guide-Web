
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
        <link rel="stylesheet" href="view/MyCss/css/booking.css">
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
                    <li role="presentation"><a role="menuitem" tabindex="-1" href="<c:url value="/BookingServlet?action=redirectToRoutes"/>">Δρομολόγια </a></li>
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

            <div class="well" style="height: 550px;"> 
                <h4 style="text-align: center;"> <span class="glyphicon glyphicon-search"></span> Αναζήτηση </h4>
                <label class="radio-inline"><input type="radio" name="optradio" checked="checked" id="fun">Ψυχαγωγία</label>
                <label class="radio-inline"><input type="radio" name="optradio" id="routes">Δρομολόγια</label>
                <br>
                <br>
                <form action="BookingServlet" method="GET" id="fun_form">

                    <div class="form-group">
                        <label for="text">Προορισμός</label>
                        <input type="text" class="form-control" name="destination"required>
                    </div>


                    <div class="form-group">
                        <label for="text">Ημερομηνία άφιξης</label>
                        <input type="text" class="form-control" id="datepicker1" name="departure_date" required>
                    </div>


                    <div class="form-group">
                        <label for="text">Ημερομηνία αναχώρησης</label>
                        <input type="text" class="form-control" id="datepicker" name="arrival_date" required>
                    </div>




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

                    <br>



                    <div id="popover-contente">
                        <h4 style="text-align: center;">Ξενοδοχεία</h4>
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



                        Κατηγορία
                        <select  id="katig" class="control-group inline" name="categoryyy">

                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>

                        </select>
                        <br>

                    </div>
                    <br>


                    <label class="checkbox-inline"><input type="checkbox" name="tourOfficeCheckBox">Εκδρομικά Γραφεία</label>
                    <label class="checkbox-inline"><input type="checkbox" name="rentOfficeCheckBox">Ενοικιαστικά Γραφεία</label>

                    <br>
                    <br>

                    <input type="hidden" name="action" value="search_form">
                    <button type="submit" class="btn btn-default btn-block ">Αναζήτηση</button>
                </form>


                <form action="BookingServlet" method="GET" id="routes_form" style="display: none;">
                    <div class="form-group">
                        <label for="text">Από</label>
                        <input type="text" class="form-control" name="beggining"required>
                    </div>

                    <div class="form-group">
                        <label for="text">Πρός</label>
                        <input type="text" class="form-control" name="destination"required>
                    </div>




                    <div class="form-group">
                        <label for="text">Ημερομηνία αναχώρησης</label>
                        <input type="text" class="form-control"  name="departureDatePicker" id="departureDatePicker" required>
                    </div>

                    <div class="form-group" id="backDate">
                        <label for="text">Ημερομηνία Επιστροφής</label>
                        <input type="text" class="form-control" id="dateBackPicker" name="dateBackPicker" >
                    </div>


                    <select class="form-control" name="aeroplaneRouteChoice" id="userChoice">
                        <option value="back">Με Επιστροφή</option>
                        <option value="simple">Απλό</option>

                    </select>



                    Ενήλικες:
                    <select  class="control-group inline" name="grownUps">
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
                    </select>


                    Παιδιά:
                    <select   class="control-group inline" name="children">
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
                    </select>
                    <br>
                    <br>
                    <input type="hidden" name="action" value="aeroplaneRoutes">
                    <button type="submit" class="btn btn-default btn-block ">Αναζήτηση</button>
                </form>

            </div>
        </div>


        <div class="jumbotron">
            <h3>Προορισμοί που θα Λατρέψετε</h3>
            <div class="destinationsList">



                <div class="destinations" id="athens">
                    Αθήνα,Ελλάδα
                </div>


                <div class="destinations" id="thess">
                    Θεσσαλονίκη,Ελλάδα


                </div>
                <div class="destinations" id="chania">
                    Χανία,Ελλάδα




                </div>

                <h3>Τα Καλύτερα Ξενοδοχεία του Κόσμου</h3>


            </div>




            <div class="destinationsList">

                <div  class="hotels">
                    <img src="view/MyCss/images/aria-hotel-budapest.jpg" class="img-rounded" height="150" width="300">
                    <h6>Χώρα:Βουδαπέστη</h6>


                </div>

                <div  class="hotels">
                    <img src="view/MyCss/images/prague.jpg" alt="Smiley face" class="img-rounded" height="150" width="300">
                    <h6>Χώρα:Πράγα</h6>

                </div>
                <div   class="hotels">
                    <img src="view/MyCss/images/barcelona.jpg" alt="Smiley face" class="img-rounded" height="150" width="300">
                    <h6>Χώρα:Μπαρστελόνα</h6>

                </div>
                <div   class="hotels">
                    <img src="view/MyCss/images/italy.jpg" alt="Smiley face" class="img-rounded" height="150" width="300">
                    <h6>Χώρα:Ιταλία</h6>

                </div>






            </div>


            <h3>Όι Ποίο Δημοφιλείς  Προορισμοί</h3>


            <div class="destinationsList">


                <div class="destinations" id="bali">
                    Μπαλί
                </div>

                <div class="destinations" id="london">
                    Λονδίνο
                </div>

                <div class="destinationsList">
                </div>
                <div class="destinations" id="france">

                    Γαλλία

                </div>


                <div class="destinations" id="newYork"> Νέα Υόρκη</div>
                <div class="destinations" id="korea">  Κορέα</div>



            </div>


            <div class="information">

                <div class="info">


                    <section><p>Περισσότερα απο 300.000 Ξενοδοχεία σε όλο τον κόσμο.Βρείτε το δικό σας με ενα CLICK</p></section>

                </div>

                <div class="info">


                    <section><p>Διαλέξτε Προορισμό και κλείστε τα εισιτήρια σας για ενα μοναδικο ταξίδη εύκολα και γρήγορα </p></section>

                </div>

                <div class="info">


                    <section><p>Περισσότερα απο 100.000 Μουσεία και αξιοθέατα σε ολο τον κόσμο τα οποία αξίζει να επισκεφτείτε</p></section>

                </div>


            </div>


        </div>



        <div class="panel panel-default">
            <h2>Δέν Βρήκατε ακόμα αυτο που ψάχνετε</h2>

            <label class="radio-inline"><input type="radio" name="optradio">Ξενοδοχεία</label>
            <label class="radio-inline"><input type="radio" name="optradio">Μουσεία</label>
            <label class="radio-inline"><input type="radio" name="optradio">Αξιοθέατα</label>

            <form id="footer_search">


                <input type="text" name="search" placeholder="Αναζήτηση..">
            </form>


            <div class="panel-footer">

                <h4><li value="1"><a href="#">Οι ποίο δημοφιλείς χώρες</a> </li></h4>
                <table class="table table-striped" id="popular_hotels_table">
                    <thead>
                        <tr>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="col-sm-2">Ξενοδοχεία σε Ηνωμένες Πολιτείες</td>
                            <td class="col-md-2"> Ξενοδοχεία σε Ιταλία</td>
                            <td class="col-md-2">Ξενοδοχεία σε Γερμανία</td>
                            <td class="col-md-2">Ξενοδοχεία σε Αυστρία</td>
                        </tr>
                        <tr>
                            <td class="col-md-2">Ξενοδοχεία σε Ηνωμένο Βασίλειο</td>
                            <td class="col-md-2">Ξενοδοχεία σε Γαλλία</td>
                            <td class="col-md-2">Ξενοδοχεία σε Ελλάδα</td>
                            <td class="col-md-2">Ξενοδοχεία σε Ισπανία</td>
                        </tr>

                    </tbody>
                </table>


                <h4> <li value="2"><a href="#">Κορυφαίοι προορισμοί</a></li></h4>
                <table class="table table-striped" id="popular_destinations_table">
                    <thead>
                        <tr>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="col-sm-2">Ξενοδοχεία στην Αθήνα</td>
                            <td class="col-md-2"> Ξενοδοχεία στη Θεσσαλονίκη</td>
                            <td class="col-sm-2">Ξενοδοχεία στην Πάφο</td>
                            <td class="col-sm-2">Ξενοδοχεία στη Λεμεσό</td>
                        </tr>
                        <tr>
                            <td class="col-sm-2">Ξενοδοχεία στον Πρωταρά</td>
                            <td class="col-sm-2">Ξενοδοχεία σε Χανιά</td>
                            <td class="col-sm-2">Ξενοδοχεία στον Πειραιά</td>
                            <td class="col-sm-2">Ξενοδοχεία στη Ρόδο</td>
                        </tr>

                    </tbody>
                </table>



                <h4><li  value="3"><a href="#">Πληροφορίες για εμάς</a></li></h4>



            </div>
        </div>


    </body>





    <script type="text/javascript" src="view/MyScripts/index.js"></script>

</html>


