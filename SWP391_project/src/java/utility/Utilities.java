/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import dal.DAO;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Admin
 */
public class Utilities {

    public Utilities() {
    }
    
    DAO d = new DAO();
    ArrayList<User> listUser = d.loadListUser();

    public ArrayList<User> getListUser() {
        return listUser;
    }

    
    public User getUser(int userId) {
        for(User u : getListUser()) {
            if(u.getUserId() == userId) {
                return u;
            }
        }
        return null;
    }
    
}
