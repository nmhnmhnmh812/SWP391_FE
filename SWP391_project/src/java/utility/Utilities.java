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
    
        //check existed email
    public boolean checkExistedEmail(String email) {
        for(User u : listUser) {
            if(u.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
    
    //check existed username
    public boolean checkExistedUsername(String username) {
        for(User u : listUser) {
            if(u.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Utilities uti = new Utilities();
        User u = uti.getUser(8);
        if(u!=null) {
            System.out.println(u.toString());
        } else System.out.println("Fail");
    }

    public User getExistedUser(String username, String password) {
        for(User u : listUser) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;

    }
}
