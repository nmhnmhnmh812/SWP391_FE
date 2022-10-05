
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Mentor {
    private int mentorID;
    private User user;
    private ArrayList<Skill> skills;
    public Mentor() {
    }

    public Mentor(int mentorID, User user) {
        this.mentorID = mentorID;
        this.user = user;
    }

    public Mentor(int mentorID, User user, ArrayList<Skill> skills) {
        this.mentorID = mentorID;
        this.user = user;
        this.skills = skills;
    }

    public int getMentorID() {
        return mentorID;
    }

    public User getUser() {
        return user;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Mentor{" + "mentorID=" + mentorID + ", user=" + user + ", skills=" + skills + '}';
    }
    

    
    
    
}
