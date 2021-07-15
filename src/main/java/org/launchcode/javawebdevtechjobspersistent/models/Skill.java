package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    @Size(min = 5,max = 100,message = "Field must be between 5 and 100 characters.")
    private String skillDescription;

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public Skill() { }
}