/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private Date dob;
    private String fullname;
    private String address;
    private boolean gender;
    private String phonenumber;
    private String avatar;
    private String status;
    private int role;

    public User() {
    }
    
    public User(int userId, String username, String password, String email, Date dob, String fullname, String address, boolean gender, String status, String avatar, String phonenumber, int role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dob = dob;
        this.fullname = fullname;
        this.address = address;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.avatar = avatar;
        this.status = status;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender ? "Male" : "Female";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + ", dob=" + getGender() + ", fullname=" + fullname + ", address=" + address + ", gender=" + gender + ", phonenumber=" + phonenumber + ", avatar=" + avatar + ", status=" + status + ", role=" + role + '}';
    }
    
        
}
