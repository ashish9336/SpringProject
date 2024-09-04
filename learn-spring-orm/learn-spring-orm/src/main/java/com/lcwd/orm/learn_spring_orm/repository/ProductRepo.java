package com.lcwd.orm.learn_spring_orm.repository;

import com.lcwd.orm.learn_spring_orm.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, String> {

    // Finder methods
//    List<Product> findByProductName(String productName);
    Optional<Product> findByProductName(String productName);
    List<Product> findByPId(String pId);
    Product findByProductNameIsNot(String productName);
    List<Product> findByProductNameIsNull(Pageable pageable);
    List<Product> findByProductNameStartingWith(String prefix);
    List<Product> findByProductNameEndingWith(String suffix);
    List<Product> findByProductNameContaining(String infix);
    List<Product> findByProductNameLike(String pattern);
    List<Product> findByPriceLessThan(double price);
    List<Product> findByPriceLessThanEqual(double price);
    List<Product> findByProductNameIn(Collection<String> names);
    List<Product> findByProductNameAndPrice(String name, double price);
    List<Product> findByProductNameOrPrice(String name, double price);
    Product findByProductNameOrderByProductNameAsc(String productName);
    Product findByProductNameOrderByProductNameDesc(String productName);

    // Custom Queries
    @Query("SELECT p FROM Product p")
    List<Product> getAllProductWhileLearningJPA();

    @Query("SELECT p FROM Product p WHERE p.productName = 'Iphone 14 max Product'")
    List<Product> getAllActiveProducts();

    @Query("SELECT p FROM Product p WHERE p.pId = :pId AND p.productName = :productName")
    Product getSingleProductByPIdAndProductName(@Param("pId") String pId, @Param("productName") String productName);

    // Native Query
    @Query(value = "SELECT * FROM jpa_product WHERE product_name = :productName", nativeQuery = true)
    Product getProductByNameNative(@Param("productName") String productName);
}
