package gr.database.interfaces;

import gr.javabeans.TourOffice;
import gr.javabeans.Tours;
import java.util.ArrayList;

public interface TourOfficeDAO {

    public void insert(TourOffice tourOffice);

    public void toursInsert(ArrayList<Tours> tours);

    public ArrayList<Tours> getTours(String officeName);
    
     public ArrayList<Tours> getAllTours();

    public ArrayList<TourOffice> getOffices();

    public ArrayList<TourOffice> tourOfficeInfo();

    public ArrayList<TourOffice> findTourOfficeByName(String area);

    public void insertTourForExistedOffice(String officeName, ArrayList<Tours> tour);

}
