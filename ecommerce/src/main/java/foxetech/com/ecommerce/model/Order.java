package foxetech.com.ecommerce.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")  // Optional: specify the table name
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)  // Specify column name and constraints
    private Long userId; // Field to store the user ID who placed the order

    @Temporal(TemporalType.TIMESTAMP)  // Specify the temporal type for date
    @Column(name = "order_date", nullable = false)
    private Date orderDate; // Date when the order was placed

    @Column(name = "status", nullable = false)
    private String status; // Status of the order (e.g., NEW, SHIPPED, DELIVERED)

    @Column(name = "total_amount", nullable = false)
    private Double totalAmount; // Total amount for the order

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @SuppressWarnings("unused")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    @SuppressWarnings("unused")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    @SuppressWarnings("unused")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @SuppressWarnings("unused")
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}