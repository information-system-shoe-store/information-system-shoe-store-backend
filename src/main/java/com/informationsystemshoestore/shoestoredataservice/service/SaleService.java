package com.informationsystemshoestore.shoestoredataservice.service;

import com.informationsystemshoestore.shoestoredataservice.mapper.ModelMapper;
import com.informationsystemshoestore.shoestoredataservice.model.Sale;
import com.informationsystemshoestore.shoestoredataservice.payload.request.SaleRequest;
import com.informationsystemshoestore.shoestoredataservice.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository saleRepository;
    private final ModelMapper modelMapper;

    public Flux<Sale> getAllSale() {

        return saleRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Sale> getSale(Long id) {

        return saleRepository.findById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }

    public Mono<Long> getSaleCount(String startDate, String endDate) {

        return saleRepository.getSaleCountWithParam(startDate, endDate);
    }

    @Transactional
    public Mono<Sale> addSale(SaleRequest sale) {

        return saleRepository.save(modelMapper.dtoToSale(sale));
    }

    @Transactional
    public Mono<Void> deleteSale(Long id) {

        return saleRepository.deleteById(id).switchIfEmpty(Mono.error(new RuntimeException("id не найдено")));
    }
}