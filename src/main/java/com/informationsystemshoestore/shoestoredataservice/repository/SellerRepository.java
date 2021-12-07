package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Seller;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SellerRepository extends ReactiveCrudRepository<Seller, Long> {

}
