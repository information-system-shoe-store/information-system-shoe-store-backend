package com.informationsystemshoestore.shoestoredataservice.routing.path;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;

import java.net.URI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SalePath {
    private static final URI SALE_GLOBAL_PATH = URI.create("/sale");
    private static final RequestPredicate SALE_GLOBAL_ACCEPT_TYPE = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    public static final RequestPredicate ADD_SALE = RequestPredicates.POST(String.valueOf(SALE_GLOBAL_PATH))
            .and(SALE_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate DELETE_SALE = RequestPredicates.DELETE(SALE_GLOBAL_PATH + "/{id}")
            .and(SALE_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_ALL_SALE = RequestPredicates.GET(String.valueOf(SALE_GLOBAL_PATH))
            .and(SALE_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_SALE = RequestPredicates.GET(SALE_GLOBAL_PATH + "/{id}")
            .and(SALE_GLOBAL_ACCEPT_TYPE);
}