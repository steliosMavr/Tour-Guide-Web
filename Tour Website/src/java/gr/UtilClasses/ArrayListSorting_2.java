

package gr.UtilClasses;

import gr.javabeans.Hotels;
import java.util.Comparator;

 public class ArrayListSorting_2  implements Comparator<Hotels>{

       @Override
    public int compare(Hotels o1, Hotels o2) {

        if (Integer.parseInt(o2.getPrice()) < Integer.parseInt(o1.getPrice())) {
            return -1;
        } else if (Integer.parseInt(o2.getPrice()) > Integer.parseInt(o1.getPrice())) {
            return 1;
        } else if (Integer.parseInt(o2.getPrice()) == Integer.parseInt(o1.getPrice())) {
            return 0;
        }
        return 0;

    }
 
    
}
