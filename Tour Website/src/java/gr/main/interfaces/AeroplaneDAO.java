package gr.database.interfaces;

import gr.javabeans.Aeroplane;
import java.util.ArrayList;

public interface AeroplaneDAO {

    public void insert(Aeroplane aeroplane);
    public ArrayList<Aeroplane> getRecords();
}
