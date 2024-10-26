package foxetech.com.ecommerce.dto;

public class OrderDTO {
    private Long userId;     // ID of the user placing the order
    private Double totalAmount; // Total amount for the order

    // Getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}