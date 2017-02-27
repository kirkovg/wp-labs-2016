package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Student;
import mk.ukim.finki.wp.persistence.StudentRepository;
import mk.ukim.finki.wp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    public void save(Student entity) {
        studentRepository.save(entity);
    }

    public void update(Long id, Student entity) {
        studentRepository.update(id,entity);
    }

    public void delete(Long id) {
        studentRepository.delete(id);
    }
}
