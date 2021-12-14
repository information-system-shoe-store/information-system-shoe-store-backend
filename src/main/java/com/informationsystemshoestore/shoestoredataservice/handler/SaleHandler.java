package com.informationsystemshoestore.shoestoredataservice.handler;

import com.informationsystemshoestore.shoestoredataservice.mapper.DtoMapper;
import com.informationsystemshoestore.shoestoredataservice.payload.request.SaleRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.response.SaleResponse;
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
public class SaleHandler {

    private final SaleService saleService;
    private final DtoMapper dtoMapper;

    public Mono<ServerResponse> getAllSale() {

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(saleService.getAllSale().map(dtoMapper::saleToDto), SaleResponse.class);
    }

    public Mono<ServerResponse> getSale(ServerRequest request) {
        long productId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(saleService.getSale(productId).map(dtoMapper::saleToDto), SaleResponse.class)
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> addSale(ServerRequest request) {
        final var product = request.bodyToMono(SaleRequest.class);

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(product.flatMap(saleService::addSale).map(dtoMapper::saleToDto), SaleResponse.class);
    }

    public Mono<ServerResponse> deleteSale(ServerRequest request) {
        long saleId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(saleService.deleteSale(saleId), Void.class);
    }
}
