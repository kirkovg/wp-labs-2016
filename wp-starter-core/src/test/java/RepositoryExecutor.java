import mk.ukim.finki.wp.model.Group;
import mk.ukim.finki.wp.persistence.GroupRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:spring/persistence-config.xml")
public class RepositoryExecutor {

    @Autowired
    GroupRepository repository;


    @Test
    public void showAllGroups() {
        List<Group> results = repository.findAll();

        System.out.println(results);
    }

    @Test
    public void getGroupById() {
        System.out.println(repository.findById(3L));
    }

    @Test
    public void saveGroup(){
        repository.save(new Group("newGroup",40,33));
    }

    @Test
    public void updateGroup() {
        repository.update(2L, new Group("group2Updated",40,33));
    }

    @Test
    public void deleteGroup() {
        repository.delete(2L);
    }
}