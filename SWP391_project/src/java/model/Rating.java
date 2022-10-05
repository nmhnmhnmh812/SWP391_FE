
package model;

/**
 *
 * @author Admin
 */
public class Rating {
    private int rateId;
    private int mentorId;
    private int menteeId;
    private int rateStar;

    public Rating() {
    }

    public Rating(int rateId, int mentorId, int menteeId, int rateStar) {
        this.rateId = rateId;
        this.mentorId = mentorId;
        this.menteeId = menteeId;
        this.rateStar = rateStar;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public int getMenteeId() {
        return menteeId;
    }

    public void setMenteeId(int menteeId) {
        this.menteeId = menteeId;
    }

    public int getRateStar() {
        return rateStar;
    }

    public void setRateStar(int rateStar) {
        this.rateStar = rateStar;
    }

    @Override
    public String toString() {
        return "Rating{" + "rateId=" + rateId + ", mentorId=" + mentorId + ", menteeId=" + menteeId + ", rateStar=" + rateStar + '}';
    }
    
    
}
