package gr.database.interfaces;

import gr.javabeans.LandMark;
import java.util.ArrayList;

public interface LandMarkDAO {

    public void insert(LandMark landMark);

    public ArrayList<LandMark> getRecords();
}
