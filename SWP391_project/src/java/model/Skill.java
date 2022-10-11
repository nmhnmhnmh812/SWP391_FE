package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Skill {

    private int skillId;
    private String skillName;
    private String skillDescription;
    private ArrayList<Mentor> mentors = new ArrayList<>();

    public Skill() {
    }

    public Skill(int skillId, String skillName, String skillDescription) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(ArrayList<Mentor> mentors) {
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Skill{" + "skillId=" + skillId + ", skillName=" + skillName + ", skillDescription=" + skillDescription + ", mentors=" + mentors + '}';
    }
    

    

}
