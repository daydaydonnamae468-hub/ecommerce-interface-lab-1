package com.ws101.longcopdayday.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * Category entity.
 * One category has many products.
 */
@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Product> products;
}
