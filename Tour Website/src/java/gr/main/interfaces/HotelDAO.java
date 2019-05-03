


package gr.database.interfaces;


import gr.javabeans.Hotels;

import java.util.ArrayList;


public interface HotelDAO {
    
    
   
    public void hotelInsert(Hotels hotel);
    public ArrayList <Hotels> hotelRecords();
   
    
   
    
}
