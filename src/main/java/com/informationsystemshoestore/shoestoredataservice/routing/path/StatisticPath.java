package com.informationsystemshoestore.shoestoredataservice.routing.path;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;

import java.net.URI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StatisticPath {
    private static final URI STATISTIC_GLOBAL_PATH = URI.create("/statistic");
    private static final RequestPredicate STATISTIC_GLOBAL_ACCEPT_TYPE = RequestPredicates.accept(MediaType.APPLICATION_JSON);

    public static final RequestPredicate EXPORT_STATISTIC = RequestPredicates.GET(STATISTIC_GLOBAL_PATH + "/export").and(STATISTIC_GLOBAL_ACCEPT_TYPE);
}
