package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Developer implements Prototype<Developer>, Cloneable {

    private DeveloperRank rank;
    private List<DeveloperSkill> skills = new ArrayList<>();

    public Developer(DeveloperRank rank) {
        this.rank = rank;
    }

    public void addNewSkill(DeveloperSkill skill) {
        skills.add(skill);
    }

    public DeveloperRank getRank() {
        return rank;
    }

    public void setRank(DeveloperRank rank) {
        this.rank = rank;
    }

    public List<DeveloperSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<DeveloperSkill> skills) {
        this.skills = skills;
    }

    @Override
    public Developer clone() {
        try {
            Developer clone = (Developer) super.clone();
            clone.skills = new ArrayList<>(this.skills);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Can't clone " + this.getClass().getSimpleName());
        }
    }
}
