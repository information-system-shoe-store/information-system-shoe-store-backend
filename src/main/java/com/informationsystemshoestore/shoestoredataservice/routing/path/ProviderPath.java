package com.informationsystemshoestore.shoestoredataservice.routing.path;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;

import java.net.URI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ProviderPath {
    private static final URI PROVIDER_GLOBAL_PATH = URI.create("/provider");
    private static final RequestPredicate PROVIDER_GLOBAL_ACCEPT_TYPE = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    public static final RequestPredicate ADD_PROVIDER = RequestPredicates.POST(String.valueOf(PROVIDER_GLOBAL_PATH))
            .and(PROVIDER_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate DELETE_PROVIDER = RequestPredicates.DELETE(PROVIDER_GLOBAL_PATH + "/{id}")
            .and(PROVIDER_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_ALL_PROVIDER = RequestPredicates.GET(String.valueOf(PROVIDER_GLOBAL_PATH))
            .and(PROVIDER_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_PROVIDER = RequestPredicates.GET(PROVIDER_GLOBAL_PATH + "/{id}")
            .and(PROVIDER_GLOBAL_ACCEPT_TYPE);
}