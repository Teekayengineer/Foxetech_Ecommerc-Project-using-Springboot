package foxetech.com.ecommerce.service;

import foxetech.com.ecommerce.dto.OrderDTO;
import foxetech.com.ecommerce.exception.OrderNotFoundException;
import foxetech.com.ecommerce.model.Order;
import foxetech.com.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Method to create a new order
    @Transactional
    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setUserId(orderDTO.getUserId());
        order.setOrderDate(new Date());
        order.setStatus("NEW");
        order.setTotalAmount(orderDTO.getTotalAmount());
        return orderRepository.save(order);
    }

    // Method to get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Method to get an order by its ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with ID: " + id));
    }

    // Method to delete an order by its ID
    @Transactional
    public void deleteOrder(Long id) {
        if (!orderRepository.existsById(id)) {
            throw new OrderNotFoundException("Order not found with ID: " + id);
        }
        orderRepository.deleteById(id);
    }
}
