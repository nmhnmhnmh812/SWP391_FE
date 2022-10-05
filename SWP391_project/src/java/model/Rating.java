
package model;

/**
 *
 * @author Admin
 */
public class Rating {
    private int rateID;
    private Mentor mentor;
    private Mentee mentee;
    private int rateStar;

    public Rating() {
    }

    public Rating(int rateID, Mentor mentor, Mentee mentee, int rateStar) {
        this.rateID = rateID;
        this.mentor = mentor;
        this.mentee = mentee;
        this.rateStar = rateStar;
    }

    public int getRateID() {
        return rateID;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public Mentee getMentee() {
        return mentee;
    }

    public int getRateStar() {
        return rateStar;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public void setMentee(Mentee mentee) {
        this.mentee = mentee;
    }

    public void setRateStar(int rateStar) {
        this.rateStar = rateStar;
    }
    
    
}
