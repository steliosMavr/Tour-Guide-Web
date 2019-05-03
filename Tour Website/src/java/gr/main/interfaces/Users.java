

package gr.database.interfaces;

import gr.javabeans.User;


public interface Users {
    
    
    public void userSave(User user);
    boolean authentication(String email,String password);
    
    
    
}
