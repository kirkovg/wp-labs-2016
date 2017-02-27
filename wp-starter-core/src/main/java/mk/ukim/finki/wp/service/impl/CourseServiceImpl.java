package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Course;
import mk.ukim.finki.wp.persistence.CourseRepository;
import mk.ukim.finki.wp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */
public class CourseServiceImpl implements CourseService{

    CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }


    public List<Course> findAll() {
        return null;
    }

    public Course findById(Long id) {
        return null;
    }

    public void save(Course entity) {

    }

    public void update(Long id, Course entity) {

    }

    public void delete(Long id) {

    }
}
