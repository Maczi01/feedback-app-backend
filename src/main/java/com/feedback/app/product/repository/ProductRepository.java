package com.feedback.app.product.repository;

import com.feedback.app.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from products p order by p.grade limit(10)")
    List<Product> getTenBestProducts();

}
