$(".mesuemFilter").find(".mesuemSelect").change(function () {
    var divs = $(".meusiumClass");
    
    var people = parseInt($(this).val());
    divs.each(function () {

        var price = parseInt($(this).find("#mesuem_price").text());
        
        var finalprice = people * price;

        $(this).find("#final_mesuem_price").text(finalprice + "€");
        $(this).find("#people").text(people);

    });



});


$("#mesuemFind").keyup(function () {
    var mesuem = $(".meusiumClass");
    var searchName = $(this).val();

    mesuem.each(function () {

        var name = $(this).find("#mesuem_name").text();

        if (name.indexOf(searchName) > -1) {

            $(this).css("display", "");
        } else {
            $(this).css("display", "none");
        }

    });
});


$("#slider_mesuem_value").html(0 + "€");

$("#slider_mesuem").slider({
    min: 0,
    max: 5000,
    step: 10,
    slide: function (event, ui) {
        $("#slider_mesuem_value").html(ui.value + "€");

        var myMesuem = $(".meusiumClass");

        myMesuem.each(function () {

            var price = parseInt($(this).find("#final_mesuem_price").text());
            var sliderPrice = parseInt($("#slider_mesuem_value").text());

            if (price > sliderPrice) {
                $(this).css("display", "none");

            } else {
                $(this).css("display", "block");

            }

        });


    }


});
