$(".myTable_onewway").find(".booking").click(function () {
    var companyName = $(this).closest("tr").find("td:eq(0)").text();
    var departureDate = $(this).closest("tr").find("td:eq(1)").text();
    var departureTime = $(this).closest("tr").find("td:eq(2)").text();
    var arrivalTime = $(this).closest("tr").find("td:eq(3)").text();
    var fromAirport = $(this).closest("tr").find("td:eq(4)").text();
    var toAirport = $(this).closest("tr").find("td:eq(5)").text();
    var fromCountry = $(this).closest("tr").find("td:eq(6)").text();
    var toCountry = $(this).closest("tr").find("td:eq(7)").text();
    var price = $(this).closest("tr").find("td:eq(8)").text();



    $.ajax({
        type: 'post',
        url: 'BookingServlet',
        data: {companyName: companyName, departureDate: departureDate, departureTime: departureTime, arrivalTime: arrivalTime, fromAirport: fromAirport, toAirport: toAirport, fromCountry: fromCountry, toCountry: toCountry, price: price, action: "store_custumer_booking_aeroplane"},
        success: function (data) {

            alert("Ή Κράτηση σας έγινε επιτυχώς");




        }, error: function () {
            alert('error');
        }



    });

});

$("#twoWaysBookButton").click(function () {
    var from = $(".from");
    var to = $(".to");

    from.each(function () {

        if ($(this).find(":radio").prop("checked", true)) {

            var companyName = $(this).closest("tr").find("td:eq(0)").text();

            var departureDate = $(this).closest("tr").find("td:eq(1)").text();
            var departureTime = $(this).closest("tr").find("td:eq(2)").text();
            var arrivalTime = $(this).closest("tr").find("td:eq(3)").text();
            var fromAirport = $(this).closest("tr").find("td:eq(4)").text();
            var toAirport = $(this).closest("tr").find("td:eq(5)").text();
            var fromCountry = $(this).closest("tr").find("td:eq(6)").text();
            var toCountry = $(this).closest("tr").find("td:eq(7)").text();
            var price = $(this).closest("tr").find("td:eq(8)").text();


            $.ajax({
                type: 'post',
                url: 'BookingServlet',
                data: {companyName: companyName, departureDate: departureDate, departureTime: departureTime, arrivalTime: arrivalTime, fromAirport: fromAirport, toAirport: toAirport, fromCountry: fromCountry, toCountry: toCountry, price: price, action: "store_custumer_booking_aeroplane_two_ways"},
                success: function (data) {

                    alert("Ή Κράτηση σας έγινε επιτυχώς");




                }, error: function () {
                    alert('error');
                }



            });

            return false;

        }



    });

    to.each(function () {
        
        if ($(this).find(".radio1").prop("checked")==true) {
           
            var companyName = $(this).closest("tr").find("td:eq(0)").text();
            var departureDate = $(this).closest("tr").find("td:eq(1)").text();
            var departureTime = $(this).closest("tr").find("td:eq(2)").text();
            var arrivalTime = $(this).closest("tr").find("td:eq(3)").text();
            var fromAirport = $(this).closest("tr").find("td:eq(4)").text();
            var toAirport = $(this).closest("tr").find("td:eq(5)").text();
            var fromCountry = $(this).closest("tr").find("td:eq(6)").text();
            var toCountry = $(this).closest("tr").find("td:eq(7)").text();
            var price = $(this).closest("tr").find("td:eq(8)").text();
           
            $.ajax({
                type: 'post',
                url: 'BookingServlet',
                data: {companyName: companyName, departureDate: departureDate, departureTime: departureTime, arrivalTime: arrivalTime, fromAirport: fromAirport, toAirport: toAirport, fromCountry: fromCountry, toCountry: toCountry, price: price, action: "store_custumer_booking_aeroplane_two_ways"},
                success: function (data) {

                    alert("Ή Κράτηση σας έγινε επιτυχώς");




                }, error: function () {
                    alert('error');
                }



            });


          
        }



    });




});