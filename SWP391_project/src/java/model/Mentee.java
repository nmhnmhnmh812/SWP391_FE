/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Mentee {
    private int menteeID;
    private User user;

    public Mentee() {
    }

    public Mentee(int menteeID, User user) {
        this.menteeID = menteeID;
        this.user = user;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public User getUser() {
        return user;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
