package mk.ukim.finki.wp.persistence;

import mk.ukim.finki.wp.model.Group;

import java.util.List;

/**
 * Created by Win 8 on 13.12.2016.
 */
public interface GroupRepository {
    List<Group> findAll();
    Group findById(Long id);
    void save(Group entity);
    void update(Long id, Group entity);
    void delete(Long id);
}
