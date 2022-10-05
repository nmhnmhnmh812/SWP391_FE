/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Invitation {
    private int invitationID;
    private Mentor mentor;
    private Mentee mentee;
    private String status;
    private Date time;

    public Invitation() {
    }

    public Invitation(int invitationID, Mentor mentor, Mentee mentee, String status, Date time) {
        this.invitationID = invitationID;
        this.mentor = mentor;
        this.mentee = mentee;
        this.status = status;
        this.time = time;
    }

    public int getInvitationID() {
        return invitationID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public String getStatus() {
        return status;
    }

    public Date getTime() {
        return time;
    }

    public void setInvitationID(int invitationID) {
        this.invitationID = invitationID;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
}
