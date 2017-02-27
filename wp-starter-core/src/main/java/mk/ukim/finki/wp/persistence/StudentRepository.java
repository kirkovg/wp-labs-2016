package mk.ukim.finki.wp.persistence;

import mk.ukim.finki.wp.model.Student;

import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student entity);
    void update(Long id, Student entity);
    void delete(Long id);
}
