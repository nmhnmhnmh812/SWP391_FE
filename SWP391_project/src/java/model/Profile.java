/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Profile {
    private int profileID;
    private Mentor mentor;
    private String achievement;
    private String experience;
    private String bio;

    public Profile() {
    }

    public Profile(int profileID, Mentor mentor, String achievement, String experience, String bio) {
        this.profileID = profileID;
        this.mentor = mentor;
        this.achievement = achievement;
        this.experience = experience;
        this.bio = bio;
    }

    public int getProfileID() {
        return profileID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getExperience() {
        return experience;
    }

    public String getBio() {
        return bio;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
}
