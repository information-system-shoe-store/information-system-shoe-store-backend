package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProviderRepository extends ReactiveCrudRepository<Provider, Long> {

    @Query(value = "SELECT count(provider.id) FROM provider " +
            "WHERE (cast(:startDate as datetime) is null OR provider.created_date >= :startDate) " +
            "AND (cast(:endDate as datetime) is null OR provider.created_date <= :endDate)")
    Mono<Long> getProviderCountWithParam(@Param("startDate") String startDate, @Param("endDate") String endDate);

}
