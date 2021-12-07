package com.informationsystemshoestore.shoestoredataservice.repository;

import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProviderRepository extends ReactiveCrudRepository<Provider, Long> {

}
