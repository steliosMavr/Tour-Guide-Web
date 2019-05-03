



$(function uniqueId() {

    var text = "";
    var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    for (var i = 0; i < 5; i++)
        text += possible.charAt(Math.floor(Math.random() * possible.length));


    return text;

});


$(function (event) {

    $(".from").datepicker();



});

$(function (event) {

    $(".until").datepicker();



});

$(".from,.until ").change(function () {

    setMotoPrice();

});

$(".myTable_tours").find(".tourButton").click(function () {

    var destination = $(this).closest("tr").find("td:eq(0)").text();
    var beggining = $(this).closest("tr").find("td:eq(1)").text();
    var departureDate = $(this).closest("tr").find("td:eq(2)").text();
    var arrivalDate = $(this).closest("tr").find("td:eq(3)").text();
    var finalPrice = $(this).closest("tr").find("td:eq(7)").text();

if ($("#connection_button").prop('disabled') == true) {
    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {destination: destination, beggining: beggining, departureDate: departureDate, arrivalDate: arrivalDate, finalPrice: finalPrice,action: "store_custumer_booking_tours"},
        success: function (data) {

            alert("Ή Κράτηση σας έγινε επιτυχώς");
            



        }, error: function () {
            alert('error');
        }



    });

}else{
    alert("Πρέπει να συνδεθείτε πρώτα");
}


});


$(".carBooking").click(function () {
    if ($("#connection_button").prop('disabled') == true) {
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
    } else {
        alert("Παρακαλω Συνδεθείτε για να κάνετε την κράτηση σας");
    }


});


$(".bookButton").click(function () {

    if ($("#connection_button").prop('disabled') == true) {
        var from = $(this).closest("tr").find(".from").val();
        var until = $(this).closest("tr").find(".until").val();

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

    } else {
        alert("Παρακαλω Συνδεθείτε για να κάνετε την κράτηση σας");
    }



});

function setMotoPrice() {
    var divs = $(".myTable_moto");
    var divs_car = $(".myTable_car");

    divs.each(function () {

        var from = $(this).find(".from").val();
        var until = $(this).find(".until").val();


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

        var from = $(this).find(".from").val();
        var until = $(this).find(".until").val();



        if (from != "" && until != "") {

            var prices = [];
            var date1 = new Date(from);
            var date2 = new Date(until);
            var timeDiff = Math.abs(date2.getTime() - date1.getTime());
            var nights = Math.ceil(timeDiff / (1000 * 3600 * 24));

            var day = parseInt(nights);
            var price = parseInt($(this).find("#charge2").text());
            var increase_Price = parseInt($(this).find("#priceIncrease2").text());

            var finalPrice = 0;
            for (i = 0; i < nights; i++) {
                prices[i] = price;
                price = price + increase_Price;
            }

            for (i = 0; i < prices.length; i++) {
                finalPrice = finalPrice + prices[i];
            }


            $(this).find("#carFinalPrice").text(finalPrice + "€");

        }



    });


}


setToursPrices();

function setToursPrices() {

    var tableDiv = $(".myTable_tours");
    var numberOfPeople = $("#numberOfPeople").text();

    tableDiv.each(function () {
        var price = parseInt($(this).find("#pricePerson").text());
        var discount = parseInt($(this).find("#discount").text());
        var dicountTrigger = parseInt($(this).find("#discountTrigger").text());


        if (numberOfPeople > dicountTrigger) {
            var finalPrice = price * numberOfPeople;
            finalPrice = finalPrice - (finalPrice * (discount / 100));

            $(this).find("#finalPrice").text(finalPrice + "€");
        } else {
            $(this).find("#finalPrice").text(price * numberOfPeople + "€");

        }


    });

}






$(".nav li ").click(function (e) {
    e.preventDefault();
    $(".tourOffice").removeClass("active");
    $(".hotels").removeClass("active");
    $(".rentOffice").removeClass("active");


    if ($(this).attr("class") == "tourOffice") {

        $(this).addClass('active');
        $(".myTourOffices").css("display", "block");
        $(".myHotels").css("display", "none");
        $(".hotels_filter").css("display", "none");
        $(".tour_filter").css("display", "block");
        $(".rentOffices").css("display", "none");
        $(".rentOffice_filter").css("display", "none");


    }

    if ($(this).attr("class") == "hotels") {
        $(this).addClass('active');
        $(".myHotels").css("display", "block");
        $(".myTourOffices").css("display", "none");
        $(".hotels_filter").css("display", "block");
        $(".tour_filter").css("display", "none");
        $(".rentOffices").css("display", "none");
        $(".rentOffice_filter").css("display", "none");

    }


    if ($(this).attr("class") == "rentOffice") {
        $(this).addClass('active');
        $(".myTourOffices").css("display", "none");

        $(".myHotels").css("display", "none");
        $(".tour_filter").css("display", "none");
        $(".hotels_filter").css("display", "none");
        $(".rentOffices").css("display", "block");
        $(".rentOffice_filter").css("display", "block");



    }



});

$(".rentOffice_filter :checkbox").change(function () {
    var divs = $(".rentOffices");
    var isMotoCheckd = $("#moto:checkbox:checked").length > 0;

    var isCarChecked = $("#car:checkbox:checked").length > 0;

    divs.each(function () {


        $(this).find(".motoTable").css("display", "");
        $(this).find("#motoTitle").css("display", "");
        $(this).find(".carTable").css("display", "");
        $(this).find("#carTitle").css("display", "");
    });


    if (isMotoCheckd == true && isCarChecked == false) {

        divs.each(function () {

            $(this).find(".motoTable").css("display", "");
            $(this).find("#motoTitle").css("display", "");
            $(this).find(".carTable").css("display", "none");
            $(this).find("#carTitle").css("display", "none");





        });
    }
    if (isMotoCheckd == false && isCarChecked == true) {

        divs.each(function () {

            $(this).find(".motoTable").css("display", "none");
            $(this).find("#motoTitle").css("display", "none");

            $(this).find(".carTable").css("display", "");
            $(this).find("#carTitle").css("display", "");




        });

    }
    if (isMotoCheckd == true && isCarChecked == true) {

        divs.each(function () {

            $(this).find(".motoTable").css("display", "");
            $(this).find(".carTable").css("display", "");
            $(this).find("#carTitle").css("display", "");
            $(this).find("#motoTitle").css("display", "");

        });

    }
    if (isMotoCheckd == false && isCarChecked == false) {
        divs.each(function () {

            $(this).find(".motoTable").css("display", "none");
            $(this).find(".carTable").css("display", "none");
            $(this).find("#carTitle").css("display", "none");
            $(this).find("#motoTitle").css("display", "none");




        });
    }




});


$(".rentOffice_filter").find(".btn-md").click(function () {

    var divs = $(".rentOffices");
    var kvSearchField = parseInt($("#searchByKv").val());





    if ($(".rentOffice_filter").find(".vehicles").val() == "moto") {
        $("#moto:checkbox").prop('checked', true);
        divs.each(function () {
            var motoTable = $(this).find(".motoTable");
            var carT = $(this).find(".carTable");
            $(this).find("#motoTitle").css("display", "");
            $(this).find("#carTitle").css("display", "none");
            motoTable.each(function () {

                $(this).css("display", "");


            });

            carT.each(function () {

                $(this).css("display", "none");


            });





            motoTable.each(function () {

                var table = $(this).find(".myTable");

                table.each(function () {
                    $(this).css("display", "");
                });

                table.each(function () {
                    var kv = parseInt($(this).find("#kv").text());

                    if (kvSearchField < kv) {
                        $(this).css("display", "none");

                    }


                });





            });


        });


    }

    if ($(".rentOffice_filter").find(".vehicles").val() == "cars") {
        $("#car:checkbox").prop('checked', true);
        divs.each(function () {
            var carsTable = $(this).find(".carTable");
            var motoT = $(this).find(".motoTable");
            $(this).find("#carTitle").css("display", "");
            $(this).find("#motoTitle").css("display", "none");
            carsTable.each(function () {
                $(this).css("display", "");


            });

            motoT.each(function () {
                $(this).css("display", "none");


            });


            carsTable.each(function () {

                var table = $(this).find(".myTable");

                table.each(function () {



                    $(this).css("display", "");




                });

                table.each(function () {
                    var kv = parseInt($(this).find("#carKV").text());

                    if (kvSearchField < kv) {
                        $(this).css("display", "none");

                    }


                });


            });


        });


    }






});

$(".rentOffice_filter").find(".days").change(function () {

    var nights = parseInt($(this).val());
    var divs = $(".rentOffices");
    var prices = [];
    divs.each(function () {
        var motoTable = $(this).find(".motoTable");
        var carTable = $(this).find(".carTable");

        motoTable.each(function () {

            var table = $(this).find(".myTable");

            table.each(function () {
                var finalPrice = 0;
                var priceIncrease = parseInt($(this).find("#priceIncrease").text());
                var price = parseInt($(this).find("#charge").text());

                for (i = 0; i < nights; i++) {
                    prices[i] = price;
                    price = price + priceIncrease;
                }

                for (i = 0; i < prices.length; i++) {
                    finalPrice = finalPrice + prices[i];
                }

                $(this).find("#motoFinalPrice").text(finalPrice + "€");

            });


        });

        carTable.each(function () {

            var table = $(this).find(".myTable");
            table.each(function () {
                var finalPrice = 0;
                var priceIncrease = parseInt($(this).find("#priceIncrease2").text());
                var price = parseInt($(this).find("#charge2").text());

                for (i = 0; i < nights; i++) {
                    prices[i] = price;
                    price = price + priceIncrease;
                }

                for (i = 0; i < prices.length; i++) {
                    finalPrice = finalPrice + prices[i];
                }

                $(this).find("#carFinalPrice").text(finalPrice + "€");



            });


        });




    });


});

$(".rooms select").change(function () {
    divs = $(".well-lg");
    if ($(this).attr("id") == "roomsChange") {
        var newNumber = $(this).val();


        divs.each(function () {

            $(this).find("#monoklinaRooms").text(newNumber);


        });

    } else {
        var newNumber = $(this).val();


        divs.each(function () {

            $(this).find("#diklinaRooms").text(newNumber);


        });

    }
});

$(".change_info select").change(function () {
    var divs = [];
    divs = $(".well-lg");
    if ($(this).attr("id") == "grownUps") {

        var numberOfClients = $(this).val();
        divs.each(function () {
            $(this).find("#adults").text(numberOfClients);


            var price = parseInt($(this).find("#initialPrice").text());
            var adultsNumber = parseInt($(this).find("#adults").text());
            var childrenNumber = parseInt($(this).find("#children").text());
            var days = parseInt($(this).find("#days").text());



            var adultsPrice = price * adultsNumber;
            var childrenPrice = (price - (price * 0.3)) * childrenNumber;

            var finalPrice = (adultsPrice + childrenPrice) * days;

            $(this).find("#price").text(finalPrice.toString() + "€");


        });


    } else {

        var numberOfClients = $(this).val();
        divs.each(function () {
            $(this).find("#children").text(numberOfClients);


            var price = parseInt($(this).find("#initialPrice").text());
            var adultsNumber = parseInt($(this).find("#adults").text());
            var childrenNumber = parseInt($(this).find("#children").text());
            var days = parseInt($(this).find("#days").text());



            var adultsPrice = price * adultsNumber;
            var childrenPrice = (price - (price * 0.3)) * childrenNumber;

            var finalPrice = (adultsPrice + childrenPrice) * days;

            $(this).find("#price").text(finalPrice.toString() + "€");


        });



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
$("#slider_value").html(0 + "€");

$("#slider").slider({
    min: 0,
    max: 5000,
    step: 10,
    slide: function (event, ui) {
        $("#slider_value").html(ui.value + "€");

        var myHotelList = $(".myHotels");
        var sliderPrice = parseInt($("#slider_value").text());
        myHotelList.each(function (e) {

            if (parseInt($(this).find("#price").text()) > sliderPrice) {
                $(this).css("display", "none");

            } else {
                $(this).css("display", "block");

            }



        });

    }


});



$("#slider_value3").html(0 + "€");

$("#slider3").slider({
    min: 0,
    max: 5000,
    step: 10,
    slide: function (event, ui) {
        $("#slider_value3").html(ui.value + "€");


    }


});






function rentOfficeSlider() {

    $("#moto:checkbox").prop('checked', true);
    $("#car:checkbox").prop('checked', true);
    $("#modelSearch").val("");
    $("#searchByKv").val("");

    var silderVal = parseInt($("#slider_value4").text());

    var div = $(".rentOffices");

    var isTrue = false;
    var isTrue1 = false;

    div.each(function () {

        $(this).css("display", "block");
        var motoDivs = $(this).find(".motoTable");
        var carDivs = $(this).find(".carTable");

        motoDivs.each(function () {
            $(this).css("display", "");
        });
        carDivs.each(function () {
            $(this).css("display", "");
        });


    });

    div.each(function () {
        var motoDivs = $(this).find(".motoTable");
        var carDivs = $(this).find(".carTable");

        carDivs.each(function () {
            var table = $(this).find(".myTable");

            table.each(function () {
                var finalPrice = parseInt($(this).find("#carFinalPrice").text());
                if (silderVal < finalPrice) {

                    $(this).css("display", "none");
                } else {
                    isTrue1 = true;
                    $(this).css("display", "");
                }


            });



        });

        motoDivs.each(function () {
            var table = $(this).find(".myTable");

            table.each(function () {
                var finalPrice = parseInt($(this).find("#motoFinalPrice").text());

                if (silderVal < finalPrice) {

                    $(this).css("display", "none");
                } else {
                    isTrue = true;
                    $(this).css("display", "");
                }


            });




        });


        if (isTrue == false) {
            $(this).css("display", "none");
        }

        isTrue = false;

        if (isTrue1 == false) {
            $(this).css("display", "none");
        }

        isTrue1 = false;




    });






}

$("#slider_value4").html(0 + "€");

$("#slider4").slider({
    orientation: "vertical",
    min: 0,
    max: 5000,
    step: 10,
    slide: function (event, ui) {
        $("#slider_value4").html(ui.value + "€");
        rentOfficeSlider();

    }


});





$(".numberOfpeopleAdjust a").click(function (e) {
    e.preventDefault();

    if ($(this).attr("name") == "plus") {

        var numberOfPeople = parseInt($(this).prev().prev().text());

        $(this).prev().prev().text(numberOfPeople + 1);


    }

    if ($(this).attr("name") == "sub") {

        var numberOfPeople = parseInt($(this).prev().prev().prev().text());

        if (numberOfPeople > 0)
            $(this).prev().prev().prev().text(numberOfPeople - 1);


    }


    setToursPrices();



});




$("#tourSearch").keyup(function () {
    var word = $(this).val();
    var div = $(".myTourOffices");
    var isTrue = false;


    div.each(function () {

        $(this).css("display", "block");


    });

    div.each(function () {

        var tableDivs = $(this).find(".myTable");

        tableDivs.each(function () {
            var destination = $(this).find("#destination").text();
            if (destination.indexOf(word) > -1) {
                isTrue = true;
                $(this).css("display", "");
            } else {
                $(this).css("display", "none");
            }



        });


        if (isTrue == false) {
            $(this).css("display", "none");
        }

        isTrue = false;
    });
});

$("#tourNameSearch").keyup(function () {
    var word = $(this).val();
    var div = $(".myTourOffices");
    div.each(function () {

        $(this).css("display", "block");


    });
    div.each(function () {
        var officeName = $(this).find("#officeName").text();
        if (officeName.indexOf(word) > -1) {
            $(this).css("display", "");
        } else {
            $(this).css("display", "none");
        }



    });
});




$("#slider_value2").html(0 + "€");
$("#slider2").slider({
    orientation: "vertical",
    min: 0,
    max: 5000,
    step: 10,
    slide: function (event, ui) {
        $("#slider_value2").html(ui.value + "€");
        tourTableSearch();
    }


});


function tourTableSearch() {
    var silderVal = parseInt($("#slider_value2").text());
    var div = $(".myTourOffices");

    var isTrue = false;

    div.each(function () {

        $(this).css("display", "block");


    });

    div.each(function () {
        var tableDivs = $(this).find(".myTable");
        tableDivs.each(function () {
            var finalPrice = parseInt($(this).find("#finalPrice").text());
            if (silderVal < finalPrice) {

                $(this).css("display", "none");
            } else {
                isTrue = true;
                $(this).css("display", "");
            }



        });


        if (isTrue == false) {
            $(this).css("display", "none");
        }

        isTrue = false;



    });



}



$(function () {
    $("#datepicker").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});
$(function () {
    $("#datepicker1").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});



