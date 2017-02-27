package mk.ukim.finki.wp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
@Entity
@Table(name = "lab_students")
public class Student extends BaseEntity{

    @NotNull
    public String name;

    @NotNull
    public String surname;

    @Column(unique = true, name = "student_index")
    public String index;

    @ManyToMany(mappedBy = "students")
    public List<Course> courses;
}
