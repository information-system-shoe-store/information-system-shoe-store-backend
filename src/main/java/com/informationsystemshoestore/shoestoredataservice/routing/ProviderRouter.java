package com.informationsystemshoestore.shoestoredataservice.routing;

import com.informationsystemshoestore.shoestoredataservice.handler.ProviderHandler;
import com.informationsystemshoestore.shoestoredataservice.routing.path.ProviderPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ProviderRouter {

    @Bean
    public RouterFunction<ServerResponse> providerRoute(ProviderHandler handler) {

        return RouterFunctions
                .route(ProviderPath.GET_ALL_PROVIDER, request -> handler.getAllProvider())
                .andRoute(ProviderPath.GET_PROVIDER, handler::getProvider)
                .andRoute(ProviderPath.ADD_PROVIDER, handler::addProvider)
                .andRoute(ProviderPath.DELETE_PROVIDER, handler::deleteProvider);
    }
}