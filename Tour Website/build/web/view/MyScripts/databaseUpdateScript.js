$(".dropdownContent").css('display', 'none');
$("#hotel_fields").css('display', 'block');
$("#defaultOpen").css('background-color', "red");


var max_fields = 4; //maximum input boxes allowed
var wrapper = $(".extra_fields"); //Fields wrapper
var wrapper2 = $(".exist_office_forward"); //Fields wrapper


var form_number = 1;
var x = 1;
var moto_max_fields = 4;
var x1 = 1;
var x2 = 1;
var x3 = 1;
var show = 0;

var tour_number_form=0;



$(".accordion").click(function () {

    $(".extra_fields").toggle();
    $(".moto_info").toggle();
});



$("#add_more_tour_fields_butt").click(function (e) {
    e.preventDefault();


if(tour_number_form<max_fields){
    tour_number_form++;
    
    
    
     $("#extra_fields_tour_offff").append('<div id="tour_duplicate"> <label >Αφετηρία </label><span class="removeeee">(Αφαιρεση)</span>  <input type="text"  name="tour_beginning" placeholder="Αφετηρία.." required> <label >Προορισμός </label><input type="text"  name="tour_destination" placeholder="Προορισμός.." required> <label >Ώρα Αναχώρησης </label>\n\
<input type="text"  name="time_destination" placeholder="Ώρα Αναχώρησης.." required> <label >Ώρα Αφετηρίας </label><input type="text"  name="time_arrival" placeholder="Ώρα Αφετηρίας.." required> <label >Τιμή </label>  <input type="text"  name="price" placeholder="Τιμή.." required>\n\
 <h3>Πακέτα Προσφορών</h3><label>Άνω των</label>  <select id="mainselection2" name="nubmer_of_people"> <option value="2">2 Ατόμων</option> <option value="3">3 Ατόμων</option> <option value="4">4 Ατόμων</option> <option value="5">5 Ατόμων</option><option value="6">6 Ατόμων</option>\n\
</select><br><br> <label >Μείωση τιμής κατά</label><input type="text"  name="price_cut" placeholder="%"></div>')
    
    
    
  if(tour_number_form>0){
       $(".tour_office_forwardddd").css("display", "block");
  }
    
}



});

$("#tour_office_modi").on("click",".removeeee",function(e){
   
   
        $(this).parents('div:first').remove();
         tour_number_form--;
         
         if(tour_number_form===0){
              $(".tour_office_forwardddd").css("display", "none");
         }
    
      
  
    
});



$(wrapper).on("click", ".remove", function (e) {
    e.preventDefault();

    $(this).parents('div:first').remove();
    x--;
});

$(wrapper2).on("click", ".remove", function (e) {
    e.preventDefault();

    $(this).parents('div:first').remove();
    x2--;



    if (x2 === 1 && x3 === 1) {
        show = 0;
        $(".exist_office_forward").css("display", "none");
    }


});


$(wrapper2).on("click", ".remove_moto", function (e) {
    e.preventDefault();

    $(this).parents('div:first').remove();
    x3--;
    show = 0;
    if (x2 === 1 && x3 === 1) {
        show = 0;
        $(".exist_office_forward").css("display", "none");
    }

});




$(wrapper).on("click", ".remove_moto", function (e) {
    e.preventDefault();

    $(this).parents('div:first').remove();
    x--;
});

$(".extra_fields").on("click", ".remove_tour_plus", function (e) {
    e.preventDefault();

    $(this).parents('div:first').remove();
    form_number--;
});



$("#add_more_fields").click(function (e) {

    e.preventDefault();
    if (x < max_fields) { //max input box allowed
        x++; //text box increment
        $(wrapper).append('<div class="car_info2"> <h3>Πληροφορίες Αυτοκινήτου <span class="remove">(Αφαιρεση)</span></h3><label >Αριθμό Κυκλοφορίας</label> <input type="text"  name="licence_car_number" placeholder="Αριθμό Κυκλοφορίας.." required>\n\
 <label >Κυβικά</label> <input type="text"  name="kv" placeholder="Κυβικά.." required><label >Θέσεις Επιβατών</label><input type="text"  name="passenger_sits" placeholder="Θέσεις Επιβατών.." required>\n\
 <label >Κατηγοριες</label><br> <select id="mainselection" name="selection"> <option value="1">1 Κατηγορία</option> <option value="2">2 Κατηγορία</option> <option value="3">3 Κατηγορία</option>\n\
 <option value="4">4 Κατηγορία</option><option value="5">5 Κατηγορία</option></select><br><br><label >Χρέωση ανα μέρα</label><input type="text"  name="charge_per_day" placeholder="Χρέωση ανα μέρα.." required>\n\
<label >Αύξηση Χρέωσης  ανα μέρα</label><input type="text"  name="price_car_plus" placeholder="Αύξηση Χρέωσης ανα μέρα.." required>     </div>'); //add input box

    }


});

$("#add_more_tour_fields").click(function (e) {
    e.preventDefault();

    if (form_number < max_fields) {
        form_number++;

        $("#extra_fi").append('<div id="tours2">   <label >Αφετηρία </label> <span class="remove_tour_plus">(Αφαιρεση)</span><input type="text"  name="" placeholder="Αφετηρία.." required> <label >Προορισμός </label>  <input type="text"  name="" placeholder="Προορισμός.." required>  <label >Ώρα Αναχώρησης </label><input type="text"  name="" placeholder="Ώρα Αναχώρησης.." required>\n\
<label >Ώρα Αφετηρίας </label> <input type="text"  name="" placeholder="Ώρα Αφετηρίας.." required> <label >Τιμή </label>  <input type="text"  name="" placeholder="Τιμή.." required> <h3>Πακέτα Προσφορών</h3><label>Άνω των</label> <select id="mainselection2">\n\
 <option value="2">2 Ατόμων</option>   <option value="3">3 Ατόμων</option>  <option value="4">4 Ατόμων</option><option value="5">5 Ατόμων</option> <option value="6">6 Ατόμων</option></select><br><br> <label >Μείωση τιμής κατά</label> <input type="text"  name="" placeholder="%">\n\
</div>');


    }


});

$("#add_more_fields3").click(function (e) {

    e.preventDefault();
    if (x2 < max_fields) { //max input box allowed
        x2++; //text box increment
        $(wrapper2).append('<div class="car_info2"> <h3>Πληροφορίες Αυτοκινήτου <span class="remove">(Αφαιρεση)</span></h3><label >Αριθμό Κυκλοφορίας</label> <input type="text"  name="licence_car_number" placeholder="Αριθμό Κυκλοφορίας.." required>\n\
 <label >Κυβικά</label> <input type="text"  name="kv" placeholder="Κυβικά.." required><label >Θέσεις Επιβατών</label><input type="text"  name="passenger_sits" placeholder="Θέσεις Επιβατών.." required>\n\
 <label >Κατηγοριες</label><br> <select id="mainselection" name="selection"> <option value="1">1 Κατηγορία</option> <option value="2">2 Κατηγορία</option> <option value="3">3 Κατηγορία</option>\n\
 <option value="4">4 Κατηγορία</option><option value="5">5 Κατηγορία</option></select><br><br><label >Χρέωση ανα μέρα</label><input type="text"  name="charge_per_day" placeholder="Χρέωση ανα μέρα.." required>\n\
<label >Αύξηση Χρέωσης  ανα μέρα</label><input type="text"  name="price_car_plus" placeholder="Αύξηση Χρέωσης ανα μέρα.." required>     </div>'); //add input box

    }

    if (show == 0) {
        $(".exist_office_forward").css("display", "block");
    }


});



$("#add_more_fields_moto").click(function (e) {

    e.preventDefault();
    if (x1 < moto_max_fields) { //max input box allowed
        x1++; //text box increment
        $(wrapper).append('<div class="moto_info2"><h3>Πληροφορίες Μηχανακίου <span class="remove_moto">(Αφαιρεση)</span></h3> <label >Αριθμό Κυκλοφορίας</label> <input type="text"  name="lice_moto" placeholder="Αριθμό Κυκλοφορίας.." required><label >Κυβικά</label>\n\
 <input type="text"  name="moto_kv" placeholder="Κυβικά.." required><label >Κατηγοριες</label><br> <select id="mainselection" name="moto_selection"><option value="1">1 Κατηγορία</option><option value="2">2 Κατηγορία</option> <option value="3">3 Κατηγορία</option>\n\
 <option value="4">4 Κατηγορία</option> <option value="5">5 Κατηγορία</option> </select><br><br> <label >Χρέωση ανα μέρα</label> <input type="text"  name="moto_charge" placeholder="Χρέωση ανα μέρα.." required><label >Αύξηση Χρέωσης  ανα μέρα</label> <input type="text"  name="moto_price_Car_plus" placeholder="Αύξηση Χρέωση ανα μέρα.." required>');


    }

});


$("#add_more_fields_moto3").click(function (e) {

    e.preventDefault();
    if (x3 < moto_max_fields) { //max input box allowed
        x3++; //text box increment
        $(wrapper2).append('<div class="moto_info2"><h3>Πληροφορίες Μηχανακίου <span class="remove_moto">(Αφαιρεση)</span></h3> <label >Αριθμό Κυκλοφορίας</label> <input type="text"  name="lice_moto" placeholder="Αριθμό Κυκλοφορίας.." required><label >Κυβικά</label>\n\
 <input type="text"  name="moto_kv" placeholder="Κυβικά.." required><label >Κατηγοριες</label><br> <select id="mainselection" name="moto_selection"><option value="1">1 Κατηγορία</option><option value="2">2 Κατηγορία</option> <option value="3">3 Κατηγορία</option>\n\
 <option value="4">4 Κατηγορία</option> <option value="5">5 Κατηγορία</option> </select><br><br> <label >Χρέωση ανα μέρα</label> <input type="text"  name="moto_charge" placeholder="Χρέωση ανα μέρα.." required><label >Αύξηση Χρέωσης  ανα μέρα</label> <input type="text"  name="moto_price_Car_plus" placeholder="Αύξηση Χρέωση ανα μέρα.." required>');


    }
    if (show == 0) {
        $(".exist_office_forward").css("display", "block");
    }



});


$("#hotel_partner").click(function () {
    $("#transport_partner").css('display', 'none');
    $("#partner_H").css('display', 'block');
    $("#hotel_partner").css('background-color', "red");
    $("#transport_P").css('background-color', "grey");


});

$("#transport_P").click(function () {

    $("#transport_partner").css('display', 'block');
    $("#partner_H").css('display', 'none');
    $("#transport_P").css('background-color', "red");
    $("#hotel_partner").css('background-color', "grey");

});



$("#ships").click(function () {
    $("#aeroplane").css('display', 'none');
    $("#defaultOpen2").css('background-color', "grey");
    $("#ships").css('background-color', "red");
    $("#shi").css('display', 'block');


});

$("#defaultOpen2").click(function () {
    $("#aeroplane").css('display', 'block');
    $("#defaultOpen2").css('background-color', "red");
    $("#ships").css('background-color', "grey");
    $("#shi").css('display', 'none');

});

$("#tour_office_modification").click(function () {



    $("#tour_office_modi").css("display", "block");
    $("#tour_office_modification").css('background-color', "red");
    $("#extra_fields_tour_off").css("display", "none");
    $("#tour_office_insert").css('background-color', "grey");



});

$("#office_insert").click(function () {
    $("#office_forms").css("display", "block");
    $("#office_insert").css('background-color', "red");
    $("#office_modification").css('background-color', "grey");

    $(".existing_office").css("display", "none");
});

$("#office_modification").click(function () {

    $("#office_insert").css('background-color', "grey");
    $("#office_modification").css('background-color', "red");
    $("#office_forms").css("display", "none");
    $(".existing_office").css("display", "block");


});
$("#tour_office_insert").click(function () {
    $("#extra_fields_tour_off").css("display", "block");
    $("#tour_office_modi").css("display", "none");
    $("#tour_office_modification").css('background-color', "grey");
    $("#tour_office_insert").css('background-color', "red");
});

$('.top-menu').find('a').click(function () {
    $('.top-menu').find('a').css('background-color', "#333");

    $(this).css('background-color', "red");

    if ($(this).attr('name') == 'office_update') {
        $(".dropdownContent").css('display', 'none');
        $("#office_fields").css('display', 'block');
        $("#office_forms").css("display", "block");
        $("#office_insert").css('background-color', "red");
        $("#office_modification").css('background-color', "grey");
        $(".existing_office").css('display', 'none');

    }

    if ($(this).attr('name') == 'hotels_update') {
        $(".dropdownContent").css('display', 'none');
        $("#hotel_fields").css('display', 'block');
    }

    if ($(this).attr('name') == 'museum_update') {
        $(".dropdownContent").css('display', 'none');
        $("#mesuem_fields").css('display', 'block');
    }

    if ($(this).attr('name') == 'landmark_update') {

        $(".dropdownContent").css('display', 'none');
        $("#landmarks_fields").css('display', 'block');
    }

    if ($(this).attr('name') == 'routes_update') {
        $(".dropdownContent").css('display', 'none');
        $("#routes_fields").css('display', 'block');
        $("#aeroplane").css('display', 'block');
        $("#defaultOpen2").css('background-color', "red");
        $("#ships").css('background-color', "grey")
    }
    if ($(this).attr('name') == 'tour_office_update') {
        $(".dropdownContent").css('display', 'none');
        $("#tour_office_fields").css('display', 'block');
        $("#tour_office_insert").css('background-color', "red");
        $("#tour_office_modification").css('background-color', "grey")
        $("#extra_fields_tour_off").css('display', 'block');
        
        $("#tour_office_modi").css('display', 'none');

    }



    if ($(this).attr('name') == 'partners_update') {
        $(".dropdownContent").css('display', 'none');
        $("#partnerss").css('display', 'block');
        $("#partner_H").css('display', 'block');
        $("#hotel_partner").css('background-color', "red");


    }



});