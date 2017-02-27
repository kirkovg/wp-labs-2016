package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by Win 8 on 22.11.2016.
 */

@Service
public class OrderServiceImpl implements OrderService {


    public Order placeOrder(String pizzaType, String clientName, String address) {
        Random r = new Random();
        Order order = new Order(pizzaType, clientName, address);
        order.setOrderId(r.nextLong());

        return order;
    }
}
