package mk.ukim.finki.wp.persistence.impl;

import mk.ukim.finki.wp.model.Course;
import mk.ukim.finki.wp.persistence.CourseRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by Win 8 on 20.12.2016.
 */

@Repository
@Transactional
public class CourseRepositoryImpl implements CourseRepository {


    @PersistenceContext(name = "wp")
    EntityManager entityManager;

    public List<Course> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> from = cq.from(Course.class);

        return entityManager.createQuery(cq).getResultList();
    }

    public Course findById(Long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> from = cq.from(Course.class);

        cq.where(cb.equal(from.get("id"),id));

        return entityManager.createQuery(cq).getSingleResult();
    }

    public void save(Course entity) {
        entityManager.merge(entity);
    }

    public void update(Long id, Course entity) {
       /* CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaUpdate cu = cb.createCriteriaUpdate(Course.class);
        Root<Course> c = cu.from(Course.class);
        cu.set("groupSize",entity.getGroupSize());
        cu.set("name",entity.getName());
        cu.set("numClasses",entity.getNumClasses());
        cu.where(cb.equal(c.get("id"),id));

        entityManager.createQuery(cu).executeUpdate();*/

    }

    public void delete(Long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<Course> cd = cb.createCriteriaDelete(Course.class);
        Root<Course> c = cd.from(Course.class);

        cd.where(cb.equal(c.get("id"),id));

        entityManager.createQuery(cd).executeUpdate();
    }
}
