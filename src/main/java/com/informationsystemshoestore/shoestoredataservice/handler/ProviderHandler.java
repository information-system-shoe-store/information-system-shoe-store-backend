package com.informationsystemshoestore.shoestoredataservice.handler;

import com.informationsystemshoestore.shoestoredataservice.mapper.DtoMapper;
import com.informationsystemshoestore.shoestoredataservice.payload.request.ProviderRequest;
import com.informationsystemshoestore.shoestoredataservice.payload.response.ProviderResponse;
import com.informationsystemshoestore.shoestoredataservice.service.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@RequiredArgsConstructor
public class ProviderHandler {

    private final ProviderService providerService;
    private final DtoMapper dtoMapper;

    public Mono<ServerResponse> getAllProvider() {

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(providerService.getAllProvider().map(dtoMapper::providerToDto), ProviderResponse.class);
    }

    public Mono<ServerResponse> getProvider(ServerRequest request) {
        long productId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(providerService.getProvider(productId).map(dtoMapper::providerToDto), ProviderResponse.class)
                .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> addProvider(ServerRequest request) {
        final var product = request.bodyToMono(ProviderRequest.class);

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(product.flatMap(providerService::addProvider).map(dtoMapper::providerToDto), ProviderResponse.class);
    }

    public Mono<ServerResponse> deleteProvider(ServerRequest request) {
        long providerId = Long.parseLong(request.pathVariable("id"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(providerService.deleteProvider(providerId), Void.class);
    }
}
