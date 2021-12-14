package com.informationsystemshoestore.shoestoredataservice.service;

import com.informationsystemshoestore.shoestoredataservice.mapper.ModelMapper;
import com.informationsystemshoestore.shoestoredataservice.model.Provider;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProviderRequest;
import com.informationsystemshoestore.shoestoredataservice.repository.ProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final ProviderRepository providerRepository;
    private final ModelMapper modelMapper;

    public Flux<Provider> getAllProvider() {

        return providerRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Provider> getProvider(Long id) {

        return providerRepository.findById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }

    @Transactional
    public Mono<Provider> addProvider(ProviderRequest provider) {

        return providerRepository.save(modelMapper.dtoToProvider(provider));
    }

    @Transactional
    public Mono<Void> deleteProvider(Long id){

        return providerRepository.deleteById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }
}
