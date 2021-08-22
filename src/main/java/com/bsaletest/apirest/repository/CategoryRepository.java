package com.bsaletest.apirest.repository;

import com.bsaletest.apirest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repositoryCategory")
public interface CategoryRepository extends JpaRepository<Category, Serializable> {
    public abstract List<Category> findAll();
}
