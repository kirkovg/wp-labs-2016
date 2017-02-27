package mk.ukim.finki.wp.web;

import mk.ukim.finki.wp.service.OrderService;
import mk.ukim.finki.wp.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win 8 on 26.11.2016.
 */


@Controller
public class PizzaOrderController {
    @Autowired
    PizzaService pizzaService;
    @Autowired
    OrderService orderService;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("pizza_index");
        List<String> pizzaTypes = new ArrayList<String>();
        pizzaTypes.addAll(pizzaService.getPizzaTypes());
        //System.out.println(pizzaTypes);
        modelAndView.addObject("pizzaTypes",pizzaTypes);

        return modelAndView;
    }


    @RequestMapping(value = "/delivery",method = RequestMethod.GET)
    public ModelAndView showClientInfo(@RequestParam String pizzaType, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("delivery_info");
        session.setAttribute("pizzaType",pizzaType);

        return modelAndView;
    }


    @RequestMapping(value = "/placeOrder", method = RequestMethod.GET)
    public ModelAndView placeOrder(@RequestParam String clientName, @RequestParam String clientAddress, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("placed_order");
        String pizzaType = session.getAttribute("pizzaType").toString();
        modelAndView.addObject("order",orderService.placeOrder(pizzaType,clientName,clientAddress));

        return modelAndView;
    }
}
