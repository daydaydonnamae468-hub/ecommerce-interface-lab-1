package com.ws101.longcopdayday.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * Order entity.
 * One order has many order items.
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    @OneToMany(mappedBy = "order",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<OrderItem> items;
}
