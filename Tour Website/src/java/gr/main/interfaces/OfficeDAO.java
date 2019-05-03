package gr.database.interfaces;

import gr.javabeans.Cars;
import gr.javabeans.MotorBikes;
import gr.javabeans.Office;
import java.util.ArrayList;

public interface OfficeDAO {

    public void officeInsert(Office office);

    public void carInsert(ArrayList<Cars> cars);

    public void motorBikeInsert(ArrayList<MotorBikes> motorBike);

    public ArrayList<Office> officeInformation();

    public ArrayList<Office> findOfficeByName(String officeArea);
    
    public ArrayList<Office> getOffices();

    public ArrayList<MotorBikes> getMotorBikes(String officeName);

    public ArrayList<Cars> getCars(String officeName);

    public void carInsertForExistedOff(String officeName, ArrayList<Cars> cars);

    public void motorBikeForExistedOff(String officeName, ArrayList<MotorBikes> motorBike);

}
