package com.informationsystemshoestore.shoestoredataservice.service;

import com.informationsystemshoestore.shoestoredataservice.mapper.ModelMapper;
import com.informationsystemshoestore.shoestoredataservice.model.Product;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProductRequest;
import com.informationsystemshoestore.shoestoredataservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public Flux<Product> getAllProduct() {

        return productRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Product> getProduct(Long id) {

        return productRepository.findById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }

    public Mono<Long> getProductCount(String startDate, String endDate) {

        return productRepository.getProductCountWithParam(startDate, endDate);
    }

    @Transactional
    public Mono<Product> addProduct(ProductRequest product) {

        return productRepository.save(modelMapper.dtoToProduct(product));
    }

    @Transactional
    public Mono<Void> deleteProduct(Long id) {

        return productRepository.deleteById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }
}
