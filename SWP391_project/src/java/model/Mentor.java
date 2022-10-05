
package model;

/**
 *
 * @author Admin
 */
public class Mentor {
    private int userId;
    private int mentorId;

    public Mentor() {
    }
    
    public Mentor(int userId, int mentorId) {
        this.userId = userId;
        this.mentorId = mentorId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    @Override
    public String toString() {
        return "Mentor{" + "userId=" + userId + ", mentorId=" + mentorId + '}';
    }
    
    
}
