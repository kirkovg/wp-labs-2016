package mk.ukim.finki.wp.persistence.impl;

import mk.ukim.finki.wp.model.Group;
import mk.ukim.finki.wp.persistence.GroupRepository;
import mk.ukim.finki.wp.service.GroupService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Win 8 on 29.11.2016.
 */

@Service
public class InMemoryGroupImpl implements GroupRepository {
    static Map<Long,Group> idToGroup = new HashMap<Long, Group>();


    public List<Group> findAll() {
        List<Group> result = new ArrayList<Group>();
        for (Map.Entry<Long,Group> x : idToGroup.entrySet()) {
            result.add(x.getValue());
        }

        System.out.println("Returning list of groups");
        System.out.println(idToGroup);
        return result;
    }

    public Group findById(Long id) {
        if (idToGroup.containsKey(id)) {
            System.out.println("Found group with id: " + id);
            System.out.println(idToGroup);
            return idToGroup.get(id);
        }
        return null;
    }

    public void save(Group entity) {
        idToGroup.put(entity.getId(),entity);
        System.out.println("Saving group: " + entity);
        System.out.println(idToGroup);
    }

    public void update(Long id, Group entity) {
        System.out.println("Updating group: " + entity + " with id: " + id);
        entity.setId(id);
        idToGroup.put(id,entity);
        System.out.println(idToGroup);
    }

    public void delete(Long id) {
        idToGroup.remove(id);
        System.out.println("Removing group with id: " + id);
        System.out.println(idToGroup);
    }
}
