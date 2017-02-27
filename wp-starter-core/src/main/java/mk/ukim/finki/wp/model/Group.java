package mk.ukim.finki.wp.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Win 8 on 29.11.2016.
 */

@Entity
@Table(name = "lab_groups")
public class Group extends BaseEntity{

    @NotNull
    private String name;

    @Min(value = 0)
    private Integer groupSize;

    @Min(value = 1)
    private Integer numClasses;

    public Group(String name, Integer groupSize, Integer numClasses) {
        //this.id = id;
        this.name = name;
        this.groupSize = groupSize;
        this.numClasses = numClasses;
    }

    public Group() {}



    // added new constructor with added numClasses attirbute
    /*public Group(Long id, String name, Integer capacity) {
        this.id = id;
        this.name = name;
        this.groupSize = capacity;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
    }

    public Integer getNumClasses() {
        return numClasses;
    }

    public void setNumClasses(Integer numClasses) {
        this.numClasses = numClasses;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupSize=" + groupSize +
                ", numClasses=" + numClasses +
                '}';
    }
}
