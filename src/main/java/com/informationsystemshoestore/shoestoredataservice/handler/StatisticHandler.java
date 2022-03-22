package com.informationsystemshoestore.shoestoredataservice.handler;

import com.informationsystemshoestore.shoestoredataservice.service.ProductService;
import com.informationsystemshoestore.shoestoredataservice.service.ProviderService;
import com.informationsystemshoestore.shoestoredataservice.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class StatisticHandler {

    private final ProductService productService;
    private final ProviderService providerService;
    private final SaleService saleService;

    public Mono<ServerResponse> exportCountStatistic(ServerRequest request) {
        var startDate = request.queryParam("startDate").orElse(null);
        var endDate = request.queryParam("endDate").orElse(null);

        var countStatistic = Mono.zip(productService.getProductCount(startDate, endDate),
                providerService.getProviderCount(startDate, endDate), saleService.getSaleCount(startDate, endDate));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(countStatistic, Long.class);
    }
}