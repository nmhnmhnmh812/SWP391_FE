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
public class Comment {
    private int commentID;
    private Mentor mentor;
    private Mentee mentee;
    private String cmtContent;
    private Date time;

    public Comment() {
    }

    public Comment(int commentID, Mentor mentor, Mentee mentee, String cmtContent, Date time) {
        this.commentID = commentID;
        this.mentor = mentor;
        this.mentee = mentee;
        this.cmtContent = cmtContent;
        this.time = time;
    }

    public int getCommentID() {
        return commentID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public String getCmtContent() {
        return cmtContent;
    }

    public Date getTime() {
        return time;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public void setCmtContent(String cmtContent) {
        this.cmtContent = cmtContent;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
}
