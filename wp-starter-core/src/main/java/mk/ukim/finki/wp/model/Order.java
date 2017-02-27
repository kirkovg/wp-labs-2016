package mk.ukim.finki.wp.model;

/**
 * Created by Win 8 on 22.11.2016.
 */

// lab 5
public class Order {
    private String pizzaType;
    private String clientName;
    private String clientAddress;
    private Long orderId;

    public Order(String pizzaType, String clientName, String clientAddress) {
        this.pizzaType = pizzaType;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
