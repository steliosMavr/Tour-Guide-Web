package gr.UtilClasses;

import gr.javabeans.Cars;
import gr.javabeans.MotorBikes;
import java.util.ArrayList;

public class CustomObjResponse {

    private ArrayList<MotorBikes> motoList;
    private ArrayList<Cars> carsList;

    public ArrayList<MotorBikes> getMotoList() {
        return motoList;
    }

    public void setMotoList(ArrayList<MotorBikes> motoList) {
        this.motoList = motoList;
    }

    public ArrayList<Cars> getCarsList() {
        return carsList;
    }

    public void setCarsList(ArrayList<Cars> carsList) {
        this.carsList = carsList;
    }

}
