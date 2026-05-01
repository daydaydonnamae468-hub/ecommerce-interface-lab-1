package com.ws101.longcop.repository;

import com.ws101.longcop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
