package com.informationsystemshoestore.shoestoredataservice.routing;

import com.informationsystemshoestore.shoestoredataservice.handler.HomeHandler;
import com.informationsystemshoestore.shoestoredataservice.routing.path.HomePath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HomeRouter {

    @Bean
    public RouterFunction<ServerResponse> homeRoute(HomeHandler homeHandler) {

        return RouterFunctions
                .route(HomePath.HOME_PAGE, request -> homeHandler.home());
    }
}
