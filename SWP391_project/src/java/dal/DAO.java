/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import model.*;

/**
 *
 * @author Account
 */
public class DAO extends DBContext {

    private ArrayList<User> userList;
    private Connection con;
    private String status;

    public DAO(ArrayList<User> userList, String status) {
        this.userList = userList;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public DAO() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception e) {
            status = "Error connection " + e.getMessage();
        }
    }

    //load account from database
    public ArrayList<User> loadListUser() {
        userList = new ArrayList<>();
        String sql = "select * from [User]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int userId = Integer.parseInt(rs.getString(1));
                String username = rs.getString(2);
                String password = rs.getString(3);
                String email = rs.getString(4);
                Date dob = rs.getDate(5);
                String fullname = rs.getString(6);
                String address = rs.getString(7);
                boolean gender = rs.getBoolean(8);
                int role = Integer.parseInt(rs.getString(9));
                String status = rs.getString(10);
                String avatar = rs.getString(11);
                String phonenum = rs.getString(12);

                userList.add(new User(userId, username, password, email, dob, fullname, address, gender, status, avatar, phonenum, role));
            }
        } catch (Exception e) {
            status = "Error load user: " + e.getMessage();
        }
        return userList;
    }

    // update User Profile
    public void updateUserProfile(String avatar, String fullname, Date dob, String address, String email, String phonenum, boolean gender, int userid) {
        String sql = "update [User] set avatar = ?, fullname = ?, dob = ?, address = ?, email = ?, phonenumber = ?, gender = ? where userID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, avatar);
            ps.setString(2, fullname);
            ps.setDate(3, dob);
            ps.setString(4, address);
            ps.setString(5, email);
            ps.setString(6, phonenum);
            ps.setBoolean(7, gender);
            ps.setInt(8, userid);
            ps.execute();
        } catch (Exception e) {
            status = "Error at update user profile" + e.getMessage();
        }
    }

    //register
    public void register(String username, String password, String email, Date dob, String fullname, String address, boolean gender, String avata, String phonenmuner) {
        String sql = "INSERT INTO [dbo].[User]([username],[password],[email],[dob],[fullname],[address],[gender],[role],[status],[avatar],[phonenumber])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setDate(4, dob);
            ps.setString(5, fullname);
            ps.setString(6, address);
            ps.setBoolean(7, gender);
            ps.setInt(8, 1);
            ps.setString(9, "inactive");
            ps.setString(10, avata);
            ps.setString(11, phonenmuner);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error at register: "+e.getMessage());
        }
    }
    
    //active account
    
    public void activeUser(String username) {
        String sql = "update [User] set status='active' where username like ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.execute();
        } catch (Exception e) {
            status = "Error at update user active" + e.getMessage();
        }
    }

//    //load post from database
//    public void loadPost() {
//        postList = new ArrayList<Post>();
//        String sql = "select * from post_he161531";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int postId = Integer.parseInt(rs.getString(1));
//                String title = rs.getString(2);
//                String content = rs.getString(3);
//                String image = rs.getString(4);
//                String time = rs.getString(5);
//                String hastag = rs.getString(6);
//                postList.add(new Post(postId, title, content, image, time, hastag));
//            }
//        } catch (Exception e) {
//            status = "Error load post: " + e.getMessage();
//        }
//    }
//    
//    //load post from database
//    public ArrayList<Post> loadListPost() {
//        postList = new ArrayList<Post>();
//        String sql = "select * from post_he161531";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int postId = Integer.parseInt(rs.getString(1));
//                String title = rs.getString(2);
//                String content = rs.getString(3);
//                String image = rs.getString(4);
//                String time = rs.getString(5);
//                String hastag = rs.getString(6);
//                postList.add(new Post(postId, title, content, image, time, hastag));
//            }
//        } catch (Exception e) {
//            status = "Error load post: " + e.getMessage();
//        }
//        return postList;
//    }
//
//    //load comment of a post by postId
//    public void loadComment(int id) {
//        cmtList = new ArrayList<Comment>();
//        String sql = "select * from comment_he161531 where postId = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int accId = Integer.parseInt(rs.getString(1));
//                int postId = Integer.parseInt(rs.getString(2));
//                String comment = rs.getString(3);
//                String time = rs.getString(4);
//                cmtList.add(new Comment(accId, postId, comment, time));
//            }
//        } catch (Exception e) {
//            status = "Error load comment: " + e.getMessage();
//        }
//    }
//    
//
//    //insert account to database
//    public void signup(String fname, String user, String pass, String firstAns, String secondAns, String email) {
//        String sql = "insert into account_he161531(fullname,username,[password],firstSecureAns,secondSecureAns,email) values (?,?,?,?,?,?)";
//        try {
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setString(1, fname);
//            st.setString(2, user);
//            st.setString(3, pass);
//            st.setString(4, firstAns);
//            st.setString(5, secondAns);
//            st.setString(6, email);
//            st.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    //insert post to database
//    public void insertPost(String title, String content, String image, String time, String hastag) {
//        String sql = "insert into post_he161531(title,content,image,time,hastag) values (?,?,?,?,?)";
//        try {
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setString(1, title);
//            st.setString(2, content);
//            st.setString(3, image);
//            st.setString(4, time);
//            st.setString(5, hastag);
//            st.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    //insert comment to database
//    public void insertComment(int accountId, int postId, String comment, String time) {
//        String sql = "insert into comment_he161531 values (?,?,?,?)";
//        try {
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setInt(1, accountId);
//            st.setInt(2, postId);
//            st.setString(3, comment);
//            st.setString(4, time);
//            st.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    // reset password
//    public void updatePass(String pass, String username) {
//        String sql = "update account_he161531 set password = ? where username like ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, pass);
//            ps.setString(2, username);
//            ps.execute();
//        } catch (Exception e) {
//            status = "Error at update password" + e.getMessage();
//        }
//    }
//
//    // to update post
//    public void updatePost(String title, String content, String imageFilename, String strDate, String hastag, int postId) {
//        String sql = "update post_he161531 set title=?,content=?,image=?,time=?,hastag=? where postId = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, title);
//            ps.setString(2, content);
//            ps.setString(3, imageFilename);
//            ps.setString(4, strDate);
//            ps.setString(5, hastag);
//            ps.setInt(6, postId);
//            ps.execute();
//        } catch (Exception e) {
//            status = "Error at update post" + e.getMessage();
//        }
//    }
//
//    // to delete post
//    public void deletePost(int deleteId) {
//        String sql = "Delete from post_he161531 where postId = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, deleteId);
//            ps.executeUpdate();
//        } catch (Exception e) {
//            status = "Error at delete post" + e.getMessage();
//        }
//    
//    }
//
//    public void updateActiveAcc(String username) {
//        String sql = "update account_he161531 set status='active' where username like ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, username);
//            ps.execute();
//        } catch (Exception e) {
//            status = "Error at update account active" + e.getMessage();
//        }
//
//    }
    public static void main(String[] args) {
        DAO d = new DAO();
        for (User u : d.loadListUser()) {
            System.out.println(u.toString());
        }
    }

}
