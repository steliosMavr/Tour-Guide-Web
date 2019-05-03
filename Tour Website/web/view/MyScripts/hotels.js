

$(function uniqueId() {

    var text = "";
    var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    for (var i = 0; i < 5; i++)
        text += possible.charAt(Math.floor(Math.random() * possible.length));


    return text;

});




$("#category_selection").change(function () {

    var number;
    number = $(this).val();
    var divs = $(".well-lg");
    var searchField = $("#area_search").val();


    divs.each(function (e) {
        $(this).css("display", "none");


    });

    if (searchField == "") {
        divs.each(function (e) {

            if ($(this).find("#category").text() == number.toString()) {
                $(this).css("display", "block");


            }

        });
    } else {
        divs.each(function (e) {
            if ($(this).find("#category").text() == number.toString() && $(this).find("#hotel_area").text() == searchField) {
                $(this).css("display", "block");


            }
        });

    }
    if (number == 0) {

        divs.css("display", "block");

    }






});

$("#price_sorting").change(function () {
    var divs = [];
    divs = $(".well-lg");
    var command;
    if ($(this).val() == "increace_price") {


        divs.sort(function (a, b) {
            var priceAText = $(a).find("#price").text().toString().split(" ");
            var priceBText = $(b).find("#price").text().toString().split(" ");

            var priceA = parseFloat(priceAText);
            var priceB = parseFloat(priceBText);


            return priceA > priceB;


        });


        $('.well_contain').append(divs);








    } else {
        if ($(this).val() == "decreace_price_results") {

            divs.sort(function (a, b) {
                var priceAText = $(a).find("#price").text().toString().split(" ");
                var priceBText = $(b).find("#price").text().toString().split(" ");

                var priceA = parseFloat(priceAText);
                var priceB = parseFloat(priceBText);


                return priceA < priceB;


            });


            $('.well_contain').append(divs);

        }

    }








});



$(".myTbody2").on('click', '.tourOffce_info', function (e) {
    e.preventDefault();

    var office_name = $(this).prev().prev().prev().prev().text();



    $.ajax({
        type: 'get',
        url: 'BookingServlet',
        data: {office_name: office_name, action: "get_tours"},
        success: function (data) {

            $("#tours_body").empty();

            $("#tours_body").append('<table class="table" id="tour_table"><thead> <tr> <th>Προορισμός</th><th>Αφετηρία</th><th>Ώρα Αναχώρησης </th><th>Ώρα Άφιξης </th><th>Τιμή</th><th>Άνω των</th><th>Μείωση τιμής κατά</th> </tr> \n\
\n\
 </thead>')

            for (i = 0; i < data.length; i++) {
                $("#tour_table").append('<tbody><tr class="success"> <td>' + data[i].destination + '</td> <td>' + data[i].beggining + '</td><td>' + data[i].destinationTime + '</td><td>' + data[i].arrivalTime + '</td><td>' + data[i].price + '</td> <td>' + data[i].numberOfPeople + '</td><td>' + data[i].discount + '</td> </tr> </tbody></table>')


            }

            $("#tours_modal").modal('toggle');
        }, error: function () {
            alert('error');
        }



    });


});

$("#area_search").keyup(function () {
    var divs = $(".well-lg")
    var searchArea = $(this).val();


    divs.each(function () {
        var area = $(this).find("#hotel_area").text();

        if (searchArea == area) {
            $(this).css("display", "");
        } else {
            $(this).css("display", "none");
        }


    });

    if (searchArea == "") {
        divs.each(function () {
            $(this).css("display", "");
        });
    }


});

$(".myTbody").on('click', '.office_vehicle_info', function (e) {

    e.preventDefault();

    var office_name = $(this).prev().prev().prev().prev().text();

    $.ajax({
        type: 'get',
        url: 'BookingServlet',
        data: {office_name: office_name, action: "get_officeVehicle"},
        success: function (data) {

            $("#office_vehicle_body").empty();




            $("#office_vehicle_body").append(' <h5 style="text-align: center;">Μηχανές</h5><table class="table" id="vehicle_table"><thead> <tr> <th>Αρι/Κυκλοφορίας</th><th>Κυβικά</th><th>Χρέωση</th><th>Αύξηση Χρέωσης/Μέρα</th> </tr> \n\
\n\
 </thead>')




            for (i = 0; i < data.motoList.length; i++) {



                $("#vehicle_table").append('<tbody><tr class="success"> <td>' + data.motoList[i].motoLicenceNumber + '</td> <td>' + data.motoList[i].motoKv + '</td><td>' + data.motoList[i].chargePerDay + '</td><td>' + data.motoList[i].increaseCharge + '</td></tr> </tbody></table>')

            }


            $("#office_vehicle_body").append(' <h5 style="text-align: center; margin-top:100px;">Αμάξια</h5><table class="table" id="vehicle_table_cars"><thead> <tr> <th style="width:100px;">Αρι/Κυκλοφορίας</th><th>Κυβικά</th><th>Χρέωση</th><th >Αύξηση Χρέωσης/Μέρα</th><th>Θέσεις Επιβατών</th> </tr> \n\
\n\
 </thead>')



            for (i = 0; i < data.carsList.length; i++) {



                $("#vehicle_table_cars").append('<tbody><tr class="danger"> <td>' + data.carsList[i].licenceNumber + '</td> <td>' + data.carsList[i].kv + '</td><td>' + data.carsList[i].chargePerDay + '</td><td>' + data.carsList[i].increaseCharge + '</td><td>' + data.carsList[i].passengerSits + '</td> </tr> </tbody></table>')

            }




            $("#vehivle_modal").modal('toggle');





        }, error: function () {
            alert('error');
        }



    });


});




$(".press_here_tour").click(function (e) {

    var office_name = $(this).prev().prev().prev().prev().text();



    $.ajax({
        type: 'get',
        url: 'BookingServlet',
        data: {office_name: office_name, action: "get_tours"},
        success: function (data) {

            $("#tours_body").empty();

            $("#tours_body").append('<table class="table" id="tour_table"><thead> <tr> <th>Προορισμός</th><th>Αφετηρία</th><th>Ώρα Αναχώρησης </th><th>Ώρα Άφιξης </th><th>Τιμή</th><th>Άνω των</th><th>Μείωση τιμής κατά</th> </tr> \n\
\n\
 </thead>')

            for (i = 0; i < data.length; i++) {
                $("#tour_table").append('<tbody><tr class="success"> <td>' + data[i].destination + '</td> <td>' + data[i].beggining + '</td><td>' + data[i].destinationTime + '</td><td>' + data[i].arrivalTime + '</td><td>' + data[i].price + '</td> <td>' + data[i].numberOfPeople + '</td><td>' + data[i].discount + '</td> </tr> </tbody></table>')


            }

            $("#tours_modal").modal('toggle');
        }, error: function () {
            alert('error');
        }



    });


});

$(".press_here").click(function (e) {

    e.preventDefault();

    var office_name = $(this).prev().prev().prev().prev().text();

    $.ajax({
        type: 'get',
        url: 'BookingServlet',
        data: {office_name: office_name, action: "get_officeVehicle"},
        success: function (data) {

            $("#office_vehicle_body").empty();







            $("#office_vehicle_body").append(' <h5 style="text-align: center;">Μηχανές</h5><table class="table" id="vehicle_table"><thead> <tr> <th>Αρι/Κυκλοφορίας</th><th>Κυβικά</th><th>Χρέωση</th><th>Αύξηση Χρέωσης/Μέρα</th> </tr> \n\
\n\
 </thead>')




            for (i = 0; i < data.motoList.length; i++) {



                $("#vehicle_table").append('<tbody><tr class="success"> <td>' + data.motoList[i].motoLicenceNumber + '</td> <td>' + data.motoList[i].motoKv + '</td><td>' + data.motoList[i].chargePerDay + '</td><td>' + data.motoList[i].increaseCharge + '</td></tr> </tbody></table>')

            }


            $("#office_vehicle_body").append(' <h5 style="text-align: center; margin-top:100px;">Αμάξια</h5><table class="table" id="vehicle_table_cars"><thead> <tr> <th style="width:100px;">Αρι/Κυκλοφορίας</th><th>Κυβικά</th><th>Χρέωση</th><th >Αύξηση Χρέωσης/Μέρα</th><th>Θέσεις Επιβατών</th> </tr> \n\
\n\
 </thead>')



            for (i = 0; i < data.carsList.length; i++) {



                $("#vehicle_table_cars").append('<tbody><tr class="danger"> <td>' + data.carsList[i].licenceNumber + '</td> <td>' + data.carsList[i].kv + '</td><td>' + data.carsList[i].chargePerDay + '</td><td>' + data.carsList[i].increaseCharge + '</td><td>' + data.carsList[i].passengerSits + '</td> </tr> </tbody></table>')

            }




            $("#vehivle_modal").modal('toggle');





        }, error: function () {
            alert('error');
        }



    });

});


$(function () {
    $("#datepicker2").datepicker();
});
$(function () {
    $("#datepicker1").datepicker();
});

$(function () {
    $("#datepicker3").datepicker();
});
$(function () {
    $("#datepicker4").datepicker();
});

$(function () {
    $("#datepicker5").datepicker();
});
$(function () {
    $("#datepicker6").datepicker();
});

$(function () {
    $("#datepicker7").datepicker();
});

$(function () {
    $("#datepicker8").datepicker();
});



$('#ex1').slider({
    formatter: function (value) {
        return 'Current value: ' + value;
    }
});



$(".nav li ").click(function (e) {
    var photo_gallery = $(this).parent().prev().next().next();
    var office_rent = $(this).parent().prev().next().next().next();
    var tour_office = $(this).parent().prev().next().next().next().next();




    e.preventDefault();






    if ($(this).attr("class") == "office_tour") {

        $(this).addClass('active');
        photo_gallery.css("display", "none");
        office_rent.css("display", "none");
        tour_office.css("display", "block");
        $(this).prev().removeClass('active');
        $(this).prev().prev().removeClass('active');
    }

    if ($(this).attr("class") == "office") {
        $(this).addClass('active');
        photo_gallery.css("display", "none");
        tour_office.css("display", "none");
        office_rent.css("display", "block");
        $(this).prev().removeClass('active');
        $(this).next().removeClass('active');
    }

    if ($(this).attr("class").toString().indexOf("photo_gallery") >= 0) {

        photo_gallery.css("display", "block");
        office_rent.css("display", "none");
        tour_office.css("display", "none");
        $(this).next().removeClass('active');
        $(this).next().next().removeClass('active');
        $(this).addClass('active');

    }



});

$(".btn-info").click(function () {

    $(this).next().toggle();

    var isPhotoGalleryActive = $(this).next().children().attr("class").toString();
    var isOfficeRentActive = $(this).next().children().next().attr("class").toString();
    var isTourOfficeActive = $(this).next().children().next().next().attr("class").toString();


    if (isPhotoGalleryActive.indexOf("active") >= 0) {
        $(this).next().next().toggle();
    }

    if (isTourOfficeActive.indexOf("active") >= 0) {
        $(this).next().next().next().next().toggle();
    }





    if (isOfficeRentActive.indexOf("active") >= 0) {
        $(this).next().next().next().toggle();
    }



});


$(".gallery").click(function () {



    var carousel = $(this).parent().prev().find('div');
    var options = $(this).parents().children("li");
    var index = $(this).index();



    options.each(function () {

        if ($(this).attr("class").toString().indexOf("active") >= 0) {
            $(this).removeClass("active");

        }



    });

    $(this).addClass("active");

    carousel.each(function () {



        if ($(this).attr("class").toString().indexOf("active") >= 0) {
            $(this).removeClass("active");

        }


        if (index == $(this).index()) {
            $(this).addClass("active");

        }





    });








});

$("#slider_value").html(0 + "€");

$("#slider").slider({
    min: 0,
    max: 1000,
    step: 10,
    slide: function (event, ui) {
        var divs = $(".well-lg");
        $("#slider_value").html(ui.value + "€");
        var sliderPrice = parseInt($("#slider_value").text());
        var category = parseInt($("#category_selection").val());


        divs.each(function () {
            var l = $("#area_search").val();

            var hotelCategorys = parseInt($(this).find("#category").text());
            var hotelPrice = parseInt($(this).find("#price").text());
            var hotelLocation = $(this).find("#hotel_area").text();
            if (category == 0 && l == "") {
                if (sliderPrice > hotelPrice) {

                    $(this).css("display", "")
                } else {
                    $(this).css("display", "none");
                }

            }

            if (hotelCategorys == category || hotelLocation == l) {

                if (sliderPrice > hotelPrice) {

                    $(this).css("display", "")
                } else {
                    $(this).css("display", "none");
                }
            }
        });






    }

});

$("#flight_search_form").css('display', 'none');
$("#hotel_radio_buttn").prop("checked", true);
$("#hotel_search_form").css('display', 'block');


$(":radio").click(function () {

    if ($(this).val() === "flights") {
        $("#hotel_search_form").css('display', 'none');
        $("#flight_search_form").css('display', 'block');
        $("#flights_radio_buttn").prop("checked", true);

    }

    if ($(this).val() === "hotel") {
        $("#flight_search_form").css('display', 'none');
        $("#hotel_search_form").css('display', 'block');
        $("#hotel_radio_buttn").prop("checked", true);

    }






});