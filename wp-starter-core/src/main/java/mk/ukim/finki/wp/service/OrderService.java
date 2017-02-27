package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Order;
/**
 * Created by Win 8 on 22.11.2016.
 */
public interface OrderService {
    public Order placeOrder(String pizzaType, String clientName, String address);
}
