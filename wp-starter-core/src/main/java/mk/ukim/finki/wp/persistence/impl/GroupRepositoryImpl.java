package mk.ukim.finki.wp.persistence.impl;

import mk.ukim.finki.wp.model.Group;
import mk.ukim.finki.wp.persistence.GroupRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by Win 8 on 13.12.2016.
 */

@Repository
@Primary
@Transactional
public class GroupRepositoryImpl implements GroupRepository{

    @PersistenceContext(name = "wp")
    EntityManager entityManager;

    public List<Group> findAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Group> cq = cb.createQuery(Group.class);
        Root<Group> from = cq.from(Group.class);

        return entityManager.createQuery(cq).getResultList();
    }

    public Group findById(Long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Group> cq = cb.createQuery(Group.class);
        Root<Group> from = cq.from(Group.class);

        cq.where(cb.equal(from.get("id"),id));

        return entityManager.createQuery(cq).getSingleResult();
    }


    public void save(Group entity) {
        entityManager.merge(entity);
    }

    public void update(Long id, Group entity) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaUpdate cu = cb.createCriteriaUpdate(Group.class);
        Root<Group> c = cu.from(Group.class);
        cu.set("groupSize",entity.getGroupSize());
        cu.set("name",entity.getName());
        cu.set("numClasses",entity.getNumClasses());
        cu.where(cb.equal(c.get("id"),id));

        entityManager.createQuery(cu).executeUpdate();
    }

    public void delete(Long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaDelete<Group> cd = cb.createCriteriaDelete(Group.class);
        Root<Group> c = cd.from(Group.class);

        cd.where(cb.equal(c.get("id"),id));

        entityManager.createQuery(cd).executeUpdate();
    }
}
