
package model;

/**
 *
 * @author Admin
 */
public class EnrollSkill {
    private int enrollId;
    private int mentorId;
    private int skillId;

    public EnrollSkill() {
    }

    public EnrollSkill(int enrollId, int mentorId, int skillId) {
        this.enrollId = enrollId;
        this.mentorId = mentorId;
        this.skillId = skillId;
    }

    public int getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(int enrollId) {
        this.enrollId = enrollId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    @Override
    public String toString() {
        return "EnrollSkill{" + "enrollId=" + enrollId + ", mentorId=" + mentorId + ", skillId=" + skillId + '}';
    }
    
}
