package com.informationsystemshoestore.shoestoredataservice.routing;

import com.informationsystemshoestore.shoestoredataservice.handler.SaleHandler;
import com.informationsystemshoestore.shoestoredataservice.routing.path.SalePath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class SaleRouter {

    @Bean
    public RouterFunction<ServerResponse> saleRoute(SaleHandler handler) {

        return RouterFunctions
                .route(SalePath.GET_ALL_SALE, request -> handler.getAllSale())
                .andRoute(SalePath.GET_SALE, handler::getSale)
                .andRoute(SalePath.ADD_SALE, handler::addSale)
                .andRoute(SalePath.DELETE_SALE, handler::deleteSale);
    }
}