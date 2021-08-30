package com.bsaletest.apirest.repository;

import com.bsaletest.apirest.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


/**
 * Esta clase se encarga de realizar la peticiones a la base de datos de la entidad Product.
 * Todos métodos usan parmáetros para evitar ataques de inyección de sql.
 * @see ProductRepository
 * @author AndZuñ
 */
@Repository("repositoryProduct")
public interface ProductRepository extends JpaRepository<Product, Serializable> {

    /**
     * Este método se utiliza para listar todos los productos.
     * @return lista de productos.
     */
    @Query("SELECT p FROM Product p")
    public abstract List<Product> findAllByOrderByName();

    /**
     * Este método se utiliza para listar los productos cuyo nombre contenga un nombre que se pasa como parametro, ordenados por nombre.
     * @param name texto que debe contener el nombre del producto.
     * @return lista de producctos.
     */
    @Query("select p from Product p where p.name like %:name%")
    public abstract  List<Product> findProductByNameContainingOrderByName(@Param("name") String name);

    /**
     * Este método se utiliza para listar los productos que pertenecen a una categoria, ordenados por nombre.
     * @param category categoria por la que se filtraran los productos.
     * @return lista de productos.
     */
    @Query("SELECT p FROM Product p WHERE p.category = :category")
    public abstract List<Product> findByCategoryOrderByName(@Param("category") int category);
}
