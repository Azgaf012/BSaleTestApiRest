package com.bsaletest.apirest.repository;

import com.bsaletest.apirest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


/**
 * Esta clase se encarga de realizar la peticiones a la base de datos de la entidad Category
 * @see CategoryRepository
 */
@Repository("repositoryCategory")
public interface CategoryRepository extends JpaRepository<Category, Serializable> {

    /**
     * Este método se utiliza para listar todas los categorias ordenas por nombre.
     * @return lista de categorias.
     */
    public abstract List<Category> findAllOrOrderByName();
}
