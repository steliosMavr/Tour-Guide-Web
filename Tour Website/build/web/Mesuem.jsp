
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
        <link rel="stylesheet" href="view/MyCss/css/mesuem.css">
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




                <div class="well_contain">

                    <div class="mesuemFilter">
                        <h4>Φίλτρο Αναζήτησης</h4>

                        <div class="price_adjust">
                            Επιλογή Άτόμων
                            <select  class="form-control select-target mesuemSelect ">

                                <option value="1">1 Άτομο </option>
                                <option value="2">2 Άτομα</option>
                                <option value="3">3 Άτομα</option>
                                <option value="4">4 Άτομα</option>
                                <option value="5">5 Άτομα</option>
                                <option value="6">6 Άτομα</option>
                                <option value="7">7 Άτομα</option>
                                <option value="8">8 Άτομα</option>
                                <option value="9">9 Άτομα</option>
                                <option value="10">10 Άτομα</option>
                            </select>

                            <br>
                            Επιλογή Τιμής
                            <div id="slider_mesuem"></div>
                            <div id="slider_mesuem_value"></div>




                            <div class="form-group" style="margin-top: 10px;">


                                <input id="mesuemFind" type="text" class="form-control"  placeholder="Αναζήτηση Μουσείου" >
                            </div>



                        </div>



                    </div>

                    <c:forEach items="${mesuemList}" var="mesuemList">
                        <div class="well well-lg meusiumClass">

                            <img  class="my_img" src="data:image/jpeg;base64,${mesuemList.imgArray}" height="250" width="600">

                            <div class="mesuem_information" style="float: right; margin-right: 100px;">

                                <h2><a id="mesuem_name">${mesuemList.mesuemName}</a></h2>  

                                <h5><a href="#" class="group"id="mesuem_telephone">${mesuemList.telephone}</a></h5>
                                <h5><a href="#" class="group" id="mesuem_area">${mesuemList.location}</a><span class="glyphicon glyphicon-map-marker"></span></h5>
                                <h5><a href="#" class="group" id="mesuem_address">${mesuemList.mesuemAddress}</a></h5>

                                <h3 style="float: left; position: relative;"><a href="#" class="group" id="mesuem_price">${mesuemList.price}&euro;/Άτομο</a></h3>
                                <br>

                                <h3 style="float: right; position: relative;">Τελική Τιμή:<a href="#" class="group" id="final_mesuem_price">${mesuemList.price}&euro;</a></h3>

                            </div>

                        </div>
                    </c:forEach>



                </div>






            </div>

        </div>




    </body>
    <script type="text/javascript" src="view/MyScripts/mesuem.js"></script>
</html>
