package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface SaleRepository extends ReactiveCrudRepository<Sale, Long> {

    @Query(value = "SELECT count(sale.id) FROM sale " +
            "WHERE (cast(:startDate as datetime) is null OR sale.created_date >= :startDate) " +
            "AND (cast(:endDate as datetime) is null OR sale.created_date <= :endDate)")
    Mono<Long> getSaleCountWithParam(@Param("startDate") String startDate, @Param("endDate") String endDate);

}
