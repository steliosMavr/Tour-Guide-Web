$(".hotelCancelBooking").click(function () {
    var hotelName = $(this).closest("tr").find("#hotelName").text();



    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {hotelName: hotelName, action: "cancelBooking"},
        success: function (data) {


            alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
            location.reload();


        }, error: function () {
            alert('error');
        }



    });
});


$(".tourCancelBooking").click(function () {

    var destination = $(this).closest("tr").find("td:eq(0)").text();
    var beggining = $(this).closest("tr").find("td:eq(1)").text();


    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {destination: destination, beggining: beggining, action: "cancelTourBooking"},
        success: function (data) {


            alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
            location.reload();


        }, error: function () {
            alert('error');
        }



    });


});



$(".carCancelBooking").click(function () {

    var licenceNumber = $(this).closest("tr").find("#licenceNumber").text();



    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {licenceNumber: licenceNumber, action: "cancelCarBooking"},
        success: function (data) {


            alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
            location.reload();


        }, error: function () {
            alert('error');
        }



    });



});

$(".motoCancelBooking").click(function () {

    var licenceNumber = $(this).closest("tr").find("#licenceNumber").text();



    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {licenceNumber: licenceNumber, action: "cancelMotoBooking"},
        success: function (data) {


            alert("Ή Κράτηση σας αφαιρεθηκε επιτυχώς.");
            location.reload();


        }, error: function () {
            alert('error');
        }



    });



});


