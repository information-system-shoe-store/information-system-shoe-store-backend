package com.informationsystemshoestore.shoestoredataservice.handler;

import com.informationsystemshoestore.shoestoredataservice.mapper.DtoMapper;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProductRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.response.ProductResponse;
import com.informationsystemshoestore.shoestoredataservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class ProductHandler {

    private final ProductService productService;
    private final DtoMapper dtoMapper;

    public Mono<ServerResponse> getAllProduct() {

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productService.getAllProduct().map(dtoMapper::productToDto), ProductResponse.class);
    }

    public Mono<ServerResponse> getProduct(ServerRequest request) {
        long productId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productService.getProduct(productId).map(dtoMapper::productToDto), ProductResponse.class)
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> addProduct(ServerRequest request) {
        final var product = request.bodyToMono(ProductRequest.class);

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(product.flatMap(productService::addProduct).map(dtoMapper::productToDto), ProductResponse.class);
    }

    public Mono<ServerResponse> deleteProduct(ServerRequest request) {
        long productId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(productService.deleteProduct(productId), Void.class);
    }
}
