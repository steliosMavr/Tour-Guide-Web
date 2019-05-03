package gr.UtilClasses;

import gr.javabeans.Hotels;
import gr.javabeans.Office;
import gr.javabeans.TourOffice;
import java.util.ArrayList;
import java.util.List;

public class CustumObjectResponse_2 {

    private List<Hotels> sortHotelList;
    private ArrayList<Office> officeList;
    private ArrayList<TourOffice> tourOfficeList;

    public ArrayList<TourOffice> getTourOfficeList() {
        return tourOfficeList;
    }

    public void setTourOfficeList(ArrayList<TourOffice> tourOfficeList) {
        this.tourOfficeList = tourOfficeList;
    }
    
    
    public List<Hotels> getSortHotelList() {
        return sortHotelList;
    }

    public void setSortHotelList(List<Hotels> sortHotelList) {
        this.sortHotelList = sortHotelList;
    }

    public ArrayList<Office> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(ArrayList<Office> officeList) {
        this.officeList = officeList;
    }

}
