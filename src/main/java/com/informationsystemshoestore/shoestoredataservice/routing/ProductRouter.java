package com.informationsystemshoestore.shoestoredataservice.routing;

import com.informationsystemshoestore.shoestoredataservice.handler.ProductHandler;
import com.informationsystemshoestore.shoestoredataservice.routing.path.ProductPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ProductRouter {

    @Bean
    public RouterFunction<ServerResponse> productRoute(ProductHandler handler) {

        return RouterFunctions
                .route(ProductPath.GET_ALL_PRODUCT, request -> handler.getAllProduct())
                .andRoute(ProductPath.GET_PRODUCT, handler::getProduct)
                .andRoute(ProductPath.ADD_PRODUCT, handler::addProduct)
                .andRoute(ProductPath.DELETE_PRODUCT, handler::deleteProduct);
    }
}
