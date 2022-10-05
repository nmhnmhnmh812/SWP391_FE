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
public class Response {
    private int responseID;
    private Mentor mentor;
    private Mentee mentee;
    private String resContent;
    private String status;
    private Date time;
    private Request request;

    public Response() {
    }

    public Response(int responseID, Mentor mentor, Mentee mentee, String resContent, String status, Date time, Request request) {
        this.responseID = responseID;
        this.mentor = mentor;
        this.mentee = mentee;
        this.resContent = resContent;
        this.status = status;
        this.time = time;
        this.request = request;
    }

    public int getResponseID() {
        return responseID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public String getResContent() {
        return resContent;
    }

    public String getStatus() {
        return status;
    }

    public Date getTime() {
        return time;
    }

    public Request getRequest() {
        return request;
    }

    public void setResponseID(int responseID) {
        this.responseID = responseID;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public void setResContent(String resContent) {
        this.resContent = resContent;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
    
}
