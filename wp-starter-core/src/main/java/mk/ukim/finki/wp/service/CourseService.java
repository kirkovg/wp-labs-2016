package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Course;

import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
public interface CourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course entity);
    void update(Long id, Course entity);
    void delete(Long id);
}
