package com.informationsystemshoestore.shoestoredataservice.routing.path;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;

import java.net.URI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ProductPath {
    private static final URI PRODUCT_GLOBAL_PATH = URI.create("/product");
    private static final RequestPredicate PRODUCT_GLOBAL_ACCEPT_TYPE = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    public static final RequestPredicate ADD_PRODUCT = RequestPredicates.POST(String.valueOf(PRODUCT_GLOBAL_PATH))
            .and(PRODUCT_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate DELETE_PRODUCT = RequestPredicates.DELETE(PRODUCT_GLOBAL_PATH + "/{id}")
            .and(PRODUCT_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_ALL_PRODUCT = RequestPredicates.GET(String.valueOf(PRODUCT_GLOBAL_PATH))
            .and(PRODUCT_GLOBAL_ACCEPT_TYPE);
    public static final RequestPredicate GET_PRODUCT = RequestPredicates.GET(PRODUCT_GLOBAL_PATH + "/{id}")
            .and(PRODUCT_GLOBAL_ACCEPT_TYPE);
}
