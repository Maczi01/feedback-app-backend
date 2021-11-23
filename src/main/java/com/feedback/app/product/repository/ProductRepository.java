package com.feedback.app.product.repository;

import com.feedback.app.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "select p from products p order by p.averageGrade desc limit :amount", nativeQuery = true)
    List<Product> getBestProducts(@Param("amount") int amount);
}
