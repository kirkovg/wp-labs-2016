package mk.ukim.finki.wp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
@Entity
@Table(name = "lab_courses")
public class Course extends BaseEntity {

    @NotNull
    public String name;

    @ManyToOne
    public Course dependent;

    @ManyToMany
    public List<Student> students;

}
