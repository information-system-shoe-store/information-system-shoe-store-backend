package com.informationsystemshoestore.shoestoredataservice.routing;

import com.informationsystemshoestore.shoestoredataservice.handler.StatisticHandler;
import com.informationsystemshoestore.shoestoredataservice.routing.path.StatisticPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class StatisticRouter {

    @Bean
    public RouterFunction<ServerResponse> statisticRoute(StatisticHandler handler) {

        return RouterFunctions
                .route(StatisticPath.EXPORT_STATISTIC, handler::exportCountStatistic);
    }
}
