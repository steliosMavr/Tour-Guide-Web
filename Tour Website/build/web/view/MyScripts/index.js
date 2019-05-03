



$("#routes,#fun").change(function () {

    if ($(this).attr("id") == "routes") {

        $("#fun_form").css("display", "none");
        $("#routes_form").css("display", "")


    } else {
        $("#fun_form").css("display", "");
        $("#routes_form").css("display", "none")


    }

});



$("#routes_form").find("#userChoice").change(function () {

    if ($(this).val() == "simple") {

        $("#backDate").css("display", "none")

    } else {
        $("#backDate").css("display", "");

    }
});

$(".panel-footer").find("li").click(function (e) {

    e.preventDefault();

    if ($(this).val() == 1) {
        $("#popular_hotels_table").toggle();
    }

    if ($(this).val() == 2) {
        $("#popular_destinations_table").toggle();
    }



});



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

$(function () {
    $("#datepicker2").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});

$(function () {
    $("#datepicker3").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});


$(function () {
    $("#dateBackPicker").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});


$(function () {
    $("#departureDatePicker").datepicker({dateFormat: 'yy-M-dd', changeMonth: true,
        changeYear: true,
        monthNames: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"],
        monthNamesShort: ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"]});
});


