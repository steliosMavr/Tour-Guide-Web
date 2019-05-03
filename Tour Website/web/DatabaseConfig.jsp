
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="view/MyCss/css/DatabaseConfig.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>

    <c:if test="${sessionScope.user != 'true'}">
        <c:redirect url="LoginForm.jsp"/>
    </c:if>

    <jsp:include page="Header.jsp"></jsp:include>
    <jsp:include page="Sidebar.jsp"></jsp:include>



    <div class="content">
        <div id="databaseConfigPanel" >
            <div class="title"><h1>Ρυθμίσεις Βάσης Δεδομένων</h1></div> 
        </div>

        <button class="database_tab" id="database_info">Πληροφορίες Βάσεις</button>
        <button class="database_tab" id="database_prefference" >Ρυθμίσεις Βάσεις </button>

        <div class="info_database">


          


            <ul>
                <li>Database Name:</li><br>
                <li>Driver Name:</li><br>
                <li>Driver Version:</li><br>
                <li>Username:</li><br>
                <li>URL:</li><br>
                <li>Database Product Name:</li><br>
                <li>Database Product Version:</li><br>
                <li>SQL Version:</li><br>
            </ul>

        </div>


        <div class="database_config">
            <h3>Επιλέξτε Πίνακα</h3>
            <select id="mainselection">
                <option value="">Hotels</option>
                <option value=""> Pelates</option>

            </select>

            <div class="columns">


                <table class="table">
                    <tr class="header">
                        <th style="width:5%;">ID</th>
                        <th style="width:10%;">Columns</th>
                        <th style="width:10%;">Περισότερες Πληροφορίες</th>
                        <th style="width:10%;">Διαγραφή</th>
                    </tr>

                    <tr>
                        <td>δασ</td>
                        <td>αδσ</td>
                        <td>Πατήστε <a href="#">Εδώ</a></td>

                        <td><input type="checkbox" name="vehicle" value="Bike"></td>


                    </tr>


                </table>

                <input type="submit" value="Αποθύκευση">
            </div>


        </div>






    </div>

    <script>



        $(document).ready(function () {


            $(".info_database").css("display", "block");
            $("#database_info").css("background-color", "red");

            var max_fields = 9;
            var wrapper = $(".database_config");
            var x = 1;

            $(".add_fields").click(function (e) {
                e.preventDefault();

                if (x < max_fields) { //max input box allowed
                    x++; //text box increment
                    $(wrapper).append('<div><label>Όνομα Πεδίου:</label><input type="text" name="mytext[]"/><label>Τύπος:</label> <select name="mySelections[]"> <option>VARCHAR</option><option>INTEGER</option></select><a href="#" class="remove_field">Remove</a></div>'); //add input box
                }


            });

            $(wrapper).on("click", ".remove_field", function (e) { //user click on remove text
                e.preventDefault();
                $(this).parent('div').remove();
                x--;
            })




            $("#database_info").click(function () {

                $(".info_database").toggle();
                $(".database_config").css("display", "none");
                $("#database_info").css("background-color", "red");
                $("#database_prefference").css("background-color", "grey");
            });


            $("#database_prefference").click(function () {

                $(".database_config").toggle();
                $(".info_database").css("display", "none");
                $("#database_info").css("background-color", "grey");
                $("#database_prefference").css("background-color", "red");

            });




        });

    </script>



</body>
</html>
