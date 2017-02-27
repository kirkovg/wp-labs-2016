package mk.ukim.finki.wp.service.impl;

import java.util.ArrayList;
import java.util.List;
import mk.ukim.finki.wp.service.PizzaService;
import org.springframework.stereotype.Service;

/**
 * Created by Win 8 on 22.11.2016.
 */

@Service
public class PizzaServiceImpl implements PizzaService{
    public List<String> getPizzaTypes() {
        List<String> list = new ArrayList<String>();
        list.add("small");
        list.add("medium");
        list.add("large");
        return list;
    }
}
