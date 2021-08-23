package com.bsaletest.apirest.repository;

import com.bsaletest.apirest.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repositoryProduct")
public interface ProductRepository extends JpaRepository<Product, Serializable> {
    public abstract List<Product> findAll();

    public abstract  List<Product> findProductByNameContainingOrderByName(String name);

    public abstract List<Product> findByCategoryOrderByName(int category);
}
