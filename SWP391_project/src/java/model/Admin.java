/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Admin {
    private int adminID;
    private User user;

    public Admin() {
    }

    public Admin(int adminID, User user) {
        this.adminID = adminID;
        this.user = user;
    }

    public int getAdminID() {
        return adminID;
    }

    public User getUser() {
        return user;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
