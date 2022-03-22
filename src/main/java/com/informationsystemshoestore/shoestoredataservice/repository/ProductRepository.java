package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Product;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

    @Query(value = "SELECT count(product.id) FROM product " +
            "WHERE (cast(:startDate as datetime) is null OR product.created_date >= :startDate) " +
            "AND (cast(:endDate as datetime) is null OR product.created_date <= :endDate)")
    Mono<Long> getProductCountWithParam(@Param("startDate") String startDate, @Param("endDate") String endDate);

}
