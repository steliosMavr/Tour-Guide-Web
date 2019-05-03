
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>  
    <meta charset="utf-8"/>
    <title>Buckys Website</title>
    <link rel="stylesheet" href="result.css"/>
    
    
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
   <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    
  
    <meta charset="utf-8"/>
</head>
<body>
   
      <div class="top">
      
       <div class="buttons">
           
           
           
       <button type="button" >Συνδεση</button>
       <button type="button" id="register">Εγγραφειτε</button>
 
        </div>
    
     
             
        
  
    </div>
    
    
    <div class="search_results">
    
         <form id="myForm"   class="hotels">  
         <input type="text" name="name" placeholder="Ξενοδοχειο,Πολη">
         <input type="date" name="firstname"  >   
         <input type="date" name="firstname" >
         
            
         <input type="submit" value="Ευρεση Ξενοδοχειων">   
        
            
        </form>
    
    </div>
    
    
   
   <div class="main_c">
    <div class="main">
    
        <div class="hotels_header">
         <a>Ταξινωμηση Κατα:</a>
              
      <select>
    <option>τιμη</option>
    <option>Αυξουσα σε φθυνουσα</option>
     <option>φθυνουσα σε φθυνουσα</option>
    
  </select>
            <select>
    <option>Κατηγορια Ξενοδωχειου</option>
    <option>1 Κατηγορια</option>
     <option>2 Κατηγορια</option>
   <option>3 Κατηγορια</option>
    <option>4 Κατηγορια</option>
    <option>5 Κατηγορια</option>
    
  </select>

           
        </div>
        
     
        <c:forEach items="${hotelList}" var="hotelList">
       <div class="hotels2">

             <img src="data:image/jpeg;base64,${hotelList.imgArray}"  height="190" width="300">
            
            <div class="hotel_inf">
                  <h5>Ονομα :${hotelList.name}</h5> 
                 <h5>Διευθηνση:${hotelList.address} </h5>
                 <h5>Τηλεφωνο :${hotelList.telephone}</h5>
                 <h5>Κατηγορια: ${hotelList.roomCategory}</h5>
                 <h5>Τιμη:1000 </h5>
                   <input type="submit" value="BOOK NOW">   
            </div>
           
        
        </div>
        
       
   </c:forEach>
    </div>
        
    
    
    
    
    <div class="sidebar">
        
        
         <h5>Filter</h5>
        
        
        <div class="slider_container">
        <h5>Price Per night</h5>
       <div id="slider"></div>
       <div id="slider_value"></div>
                 
        </div>
        
        
        <div class="acidjs-rating-stars">
            
            <h5>Stars Rating</h5>
            
    <form>
        <input type="radio" name="group-1" id="group-1-0" value="5" /><label for="group-1-0"></label><!--
        --><input type="radio" name="group-1" id="group-1-1" value="4" /><label for="group-1-1"></label><!--
        --><input type="radio" name="group-1" id="group-1-2" value="3" /><label for="group-1-2"></label><!--
        --><input type="radio" name="group-1" id="group-1-3" value="2" /><label for="group-1-3"></label><!--
        --><input type="radio" name="group-1" id="group-1-4"  value="1" /><label for="group-1-4"></label>
    </form>
         
</div>
        
        
        <div class="Search">
        
        
        <form id="Search_Form"   class="search">
        <h5>Search refresh</h5>
         <input type="date" name="firstname"  > <br>
         <input type="date" name="firstname" ><br>
            
       <div class="styled-select slate">
  <select>
    <option>1 δωματιο</option>
    <option>2 δωματια</option>
    <option>3 δωματια</option>
    <option>4 δωματια</option>
    <option>5 δωματια</option>
    <option>6 δωματια</option>
    <option>7 δωματια</option>
  </select>
</div>
            
            
           
            
    <div class="styled-select slate2">
  <select>
    <option>1 Ενηλικας</option>
    <option>2 Ενηλικες</option>
    <option>3 Ενηλικες</option>
    <option>4 Ενηλικες</option>
    <option>5 Ενηλικες</option>
    <option>6 Ενηλικες</option>
    <option>7 Ενηλικες</option>
  </select>
         <select>
    <option>0 Παιδια</option>
    <option>1 Παιδι</option>
    <option>2 Παιδια</option>
    <option>3 Παιδια</option>
    <option>4 Παιδια</option>
    <option>5 Παιδια</option>
    <option>6 Παιδια</option>
  </select>
</div>
         <input type="submit" value="Ευρεση Ξενοδοχειων">   
        
            
        </form>
        
        </div>
        
        
        <div class="aksiotheata">
        <h5>Δραστηριοτητες</h5>
        
       <input type="checkbox" id="checkbox-1-1" class="regular-checkbox" />Μουσεια<br>
        <input type="checkbox" id="checkbox-1-1" class="regular-checkbox" />Αξιοθεατα<br>
		
             
		
		
            
            
        </div>
        

   </div>
       </div>
   
    </body>
    
    <script>
        
        $(document).ready(function(){
           $("#slider_value").html(0+"$");
          
            $("#slider").slider({
                min:0,
                max:1000,
                step:10,
               
               
                
                slide:function(event,ui){
                $("#slider_value").html(ui.value+"$");
                
            }
            
            });
            
            
            
            
        });
        
    
    
    
    </script>
    
</html>