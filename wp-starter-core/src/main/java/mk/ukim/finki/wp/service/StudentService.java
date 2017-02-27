package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Student;

import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student entity);
    void update(Long id, Student entity);
    void delete(Long id);
}
