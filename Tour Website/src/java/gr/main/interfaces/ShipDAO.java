

package gr.database.interfaces;

import gr.javabeans.Ships;
import java.util.ArrayList;


public interface ShipDAO {
    
    public void insert(Ships ship);
    public ArrayList<Ships>getRecords();
    
}
