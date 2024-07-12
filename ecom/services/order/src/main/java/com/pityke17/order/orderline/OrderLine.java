package com.pityke17.order.orderline;

import com.pityke17.order.order.Order;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Entity

public class OrderLine {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn( name = "order_id")
    private Order order;
    private Integer productId;
    private double quantity;
}
