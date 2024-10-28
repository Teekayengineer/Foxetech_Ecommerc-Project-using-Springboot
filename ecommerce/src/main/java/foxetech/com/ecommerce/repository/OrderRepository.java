package foxetech.com.ecommerce.repository;

import foxetech.com.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // No additional methods are needed for findById
}