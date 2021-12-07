package com.informationsystemshoestore.shoestoredataservice.routing.path;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;

import java.net.URI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class HomePath {
    private static final URI HOME_GLOBAL_PATH = URI.create("/");
    private static final RequestPredicate HOME_GLOBAL_ACCEPT_TYPE = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    public static final RequestPredicate HOME_PAGE = RequestPredicates.GET(String.valueOf(HOME_GLOBAL_PATH)).and(HOME_GLOBAL_ACCEPT_TYPE);
}