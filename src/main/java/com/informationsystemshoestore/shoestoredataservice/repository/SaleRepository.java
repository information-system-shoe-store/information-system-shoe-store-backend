package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SaleRepository extends ReactiveCrudRepository<Sale, Long> {

}
