package gr.database.interfaces;

import gr.javabeans.Mesuem;
import java.util.ArrayList;

public interface MesuemDAO {

    public void mesuemInsert(Mesuem mesuem);

    public ArrayList<Mesuem> getMesuem();

}
