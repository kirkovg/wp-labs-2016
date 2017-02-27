package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Group;
import mk.ukim.finki.wp.persistence.GroupRepository;
import mk.ukim.finki.wp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Win 8 on 29.11.2016.
 */

@Service
public class GroupServiceImpl implements GroupService {

    GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group findById(Long id) {
        return groupRepository.findById(id);
    }

    public void save(Group entity) {
        groupRepository.save(entity);
    }

    public void update(Long id, Group entity) {
        groupRepository.update(id,entity);
    }

    public void delete(Long id) {
        groupRepository.delete(id);
    }
}
