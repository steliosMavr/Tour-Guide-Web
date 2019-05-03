$(function (event) {

    $("#datepicker1").datepicker();



});

$(function (event) {

    $(".datepicker2").datepicker();



});

$(".datepicker2,.datepicker3 ").change(function () {

    setMotoPrice();

});



$(function (event) {

    $(".datepicker3").datepicker();



});

$(function () {
    $("#datepicker").datepicker();


});



function setMotoPrice() {
    var divs = $(".myTable_moto");
    var divs_car = $(".myTable_car");

    divs.each(function () {

        var from = $(this).find(".datepicker2").val();
        var until = $(this).find(".datepicker3").val();



        if (from != "" && until != "") {
            var prices = [];
            var date1 = new Date(from);
            var date2 = new Date(until);
            var timeDiff = Math.abs(date2.getTime() - date1.getTime());
            var nights = Math.ceil(timeDiff / (1000 * 3600 * 24));

            var day = parseInt(nights);
            var price = parseInt($(this).find("#charge").text());
            var increase_Price = parseInt($(this).find("#priceIncrease").text());

            var finalPrice = 0;
            for (i = 0; i < nights; i++) {
                prices[i] = price;
                price = price + increase_Price;
            }

            for (i = 0; i < prices.length; i++) {
                finalPrice = finalPrice + prices[i];
            }


            $(this).find("#motoFinalPrice").text(finalPrice + "€");

        }



    });




    divs_car.each(function () {

        var from = $(this).find(".datepicker2").val();
        var until = $(this).find(".datepicker3").val();



        if (from != "" && until != "") {
            var prices = [];
            var date1 = new Date(from);
            var date2 = new Date(until);
            var timeDiff = Math.abs(date2.getTime() - date1.getTime());
            var nights = Math.ceil(timeDiff / (1000 * 3600 * 24));

            var day = parseInt(nights);
            var price = parseInt($(this).find("#charge").text());
            var increase_Price = parseInt($(this).find("#priceIncrease").text());

            var finalPrice = 0;
            for (i = 0; i < nights; i++) {
                prices[i] = price;
                price = price + increase_Price;
            }

            for (i = 0; i < prices.length; i++) {
                finalPrice = finalPrice + prices[i];
            }


            $(this).find("#motoFinalPrice").text(finalPrice + "€");

        }



    });


}

$("#datepicker1").change(function (event) {

    if ($("#datepicker").val() != "") {

        setPrice();
    }
});

$("#datepicker").change(function () {
    if ($("#datepicker1").val() != "") {

        setPrice();
    }
});

$(".adults").change(function () {
    $("#bookButton").prop('disabled', true);
    $(".booking").find("#peopleNumber").text($(this).val());

    if ($("#datepicker").val() != "" && $("#datepicker1").val() != "") {
        setPrice();
    }


});

$(".monoklina").change(function () {

    $("#bookButton").prop('disabled', true);

});


$(".diklina").change(function () {
    $("#bookButton").prop('disabled', true);

});


$(".children").change(function () {
    $("#bookButton").prop('disabled', true);
    $(".booking").find("#childrenNumber").text($(this).val());
    if ($("#datepicker").val() != "" && $("#datepicker1").val() != "") {
        setPrice();
    }

});





function setPrice() {

    var pricePerPerson = parseInt($("#price").text());
    var numberOfPeople = parseInt($("#peopleNumber").text());
    var numberOfChildren = parseInt($("#childrenNumber").text());

    var arrivalDate = $("#datepicker1").val();
    var departureDate = $("#datepicker").val();




    var date1 = new Date(arrivalDate);
    var date2 = new Date(departureDate);
    var timeDiff = Math.abs(date2.getTime() - date1.getTime());
    var nights = Math.ceil(timeDiff / (1000 * 3600 * 24));

    var priceForPersons = pricePerPerson * numberOfPeople;
    var priceWithDiscount = pricePerPerson - (pricePerPerson * 0.3);
    var priceForChildren = numberOfChildren * priceWithDiscount;

    var sumPricePerDay = priceForPersons + priceForChildren;


    var finalPrice = sumPricePerDay * parseInt(nights);
    $("#final_price").text(finalPrice);

}


$("#available").click(function () {


    var numberOfPeople = parseInt($(".adults").val()) + parseInt($(".children").val());

    var availableMonoklina = parseInt($("#monoklina").text());
    var availableDiklina = parseInt($("#diklina").text());

    var monoklina = parseInt($(".monoklina").val());
    var diklina = parseInt($(".diklina").val());



    if ($("#datepicker").val() != "" && $("#datepicker1").val() != "") {



        var rooms = monoklina + 2 * diklina;


        if (diklina != 0 && availableDiklina == 0) {
            alert("Δέν Υπάρχουν διαθέσιμα δίκλινα αυτην την περίοδο");
        }

        if (monoklina != 0 && availableMonoklina == 0) {
            alert("Δέν Υπάρχουν διαθέσιμα μονόκλινα αυτην την περίοδο");
        }

        if (availableMonoklina >= monoklina || availableDiklina >= diklina) {


            if (numberOfPeople == rooms) {
                $("#bookButton").prop('disabled', false);
            }

            if (numberOfPeople == monoklina && diklina == 0) {

                $("#bookButton").prop('disabled', false);
            }


            if (monoklina == 0 && 2 * diklina == numberOfPeople)
                $("#bookButton").prop('disabled', false);

        } else {
            alert("Δέν Υπάρχουν διαθέσιμα Δωμάτια αυτην την στιγμή")
        }
    } else {
        if ($("#datepicker1").val() == "") {
            $("#datepicker1").popover('show');

        } else {
            $("#datepicker1").popover('destroy');
        }

        if ($("#datepicker").val() == "") {
            $("#datepicker").popover('show');

        } else {
            $("#datepicker").popover('destroy');
        }




    }



});




$(".offices_1").click(function (e) {
    e.preventDefault();
    var className = $(this).find("#officeName").text();

    $("." + className).toggle();
    // alert($(this).find("#officeName").text());

});





$(function () {
    $("#datepicker1")
            .popover({title: 'ΗΜΜΕΡΟΜΗΝΙΑ', content: "Παρακαλούμε Συμπληρώστε την ημμερομηνια άφιξης"})
            .blur(function () {
                $(this).popover('hide');
            });
});

$(function () {
    $("#datepicker")
            .popover({title: 'ΗΜΜΕΡΟΜΗΝΙΑ', content: "Παρακαλούμε Συμπληρώστε την ημμερομηνια Αναχώρησης"})
            .blur(function () {
                $(this).popover('hide');
            });
});

$("#bookButton").click(function () {

    if ($("#connection_button").prop('disabled') == true) {


        $("#myModal_2").modal('show');


    } else {
        alert("Παρακαλω Συνδεθείτε για να κάνετε την κράτηση σας");
    }



});


$(".carBooking").click(function () {
    var from = $(this).closest("tr").find(".datepicker2").val();
    var until = $(this).closest("tr").find(".datepicker3").val();

    if (from != "" && until != "") {
        var licenseNumber = $(this).closest("tr").find("td:eq(0)").text();
        var kivika = $(this).closest("tr").find("td:eq(1)").text();
        var passengerSits = $(this).closest("tr").find("td:eq(2)").text();
        var carCategory = $(this).closest("tr").find("td:eq(3)").text();
        var finalPrice = $(this).closest("tr").find("td:eq(6)").text();


        $.ajax({
            type: 'post',
            url: 'BookingServlet',
            data: {from: from, until: until, licenseNumber: licenseNumber, kivika: kivika, carCategory: carCategory, finalPrice: finalPrice, passengerSits: passengerSits, action: "store_custumer_booking_info_car"},
            success: function (data) {

                alert("Ή Κράτηση σας έγινε επιτυχώς");
                // $(".badge").text("1");



            }, error: function () {
                alert('error');
            }



        });

    } else {
        alert("Παρακαλούμε συμπληρώστε ολα τα κενά")
    }



});

$(".bookButton").click(function () {


    var from = $(this).closest("tr").find(".datepicker2").val();
    var until = $(this).closest("tr").find(".datepicker3").val();

    if (from != "" && until != "") {


        var licenseNumber = $(this).closest("tr").find("td:eq(0)").text();
        var kivika = $(this).closest("tr").find("td:eq(1)").text();
        var motoCategory = $(this).closest("tr").find("td:eq(2)").text();
        var finalPrice = $(this).closest("tr").find("td:eq(5)").text();



        $.ajax({
            type: 'post',
            url: 'BookingServlet',
            data: {from: from, until: until, licenseNumber: licenseNumber, kivika: kivika, motoCategory: motoCategory, finalPrice: finalPrice, action: "store_custumer_booking_info_moto"},
            success: function (data) {

                alert("Ή Κράτηση σας έγινε επιτυχώς");
                // $(".badge").text("1"); 

            }, error: function () {
                alert('error');
            }


        });

    } else {
        alert("Παρακαλούμε συμπληρώστε ολα τα κενά")
    }


});

$("#rent_office_booking").click(function () {
    var hotelName = $("#hotelName").text();
    var category = $("#category").text();
    var hotelArea = $("#hotelArea").text();

    var hotelTelephone = $("#hotelTelephone").text();
    var hotelAddress = $("#hotelAddress").text();
    var finalPrice = parseInt($("#final_price").text());
    var arrivalDate = $("#datepicker1").val();
    var departureDate = $("#datepicker").val();
    var divs = $(".offices_1");

    divs.each(function () {

        $(this).find(".press_here").trigger("click");

    });

    $('html, body').scrollTop($(document).height() - 1000);


    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {hotelName: hotelName, category: category, hotelArea: hotelArea, hotelTelephone: hotelTelephone, hotelAddress: hotelAddress, finalPrice: finalPrice, arrivalDate: arrivalDate, departureDate: departureDate, action: "store_custumer_booking_info"},
        success: function (data) {

            alert("Ή Κράτηση σας έγινε επιτυχώς,μπορείτε να την δείτε πάνω δεξιά");
            $(".badge").text("1");



        }, error: function () {
            alert('error');
        }


    });

});



$("#continue_only_hotel").click(function () {

    var hotelName = $("#hotelName").text();
    var category = $("#category").text();
    var hotelArea = $("#hotelArea").text();

    var hotelTelephone = $("#hotelTelephone").text();
    var hotelAddress = $("#hotelAddress").text();
    var finalPrice = parseInt($("#final_price").text());
    var arrivalDate = $("#datepicker1").val();
    var departureDate = $("#datepicker").val();



    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {hotelName: hotelName, category: category, hotelArea: hotelArea, hotelTelephone: hotelTelephone, hotelAddress: hotelAddress, finalPrice: finalPrice, arrivalDate: arrivalDate, departureDate: departureDate, action: "store_custumer_booking_info"},
        success: function (data) {

            alert("Ή Κράτηση σας έγινε επιτυχώς");
            $(".badge").text("1");
            window.location.href = "BookingServlet?action=myBookList";


        }, error: function () {
            alert('error');
        }



    });



});