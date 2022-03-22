package com.informationsystemshoestore.shoestorestatisticsservice.router

import com.informationsystemshoestore.shoestorestatisticsservice.handler.StatisticHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class StatisticRouter(private val statisticHandler: StatisticHandler) {

    @Bean
    fun apiRouter() = coRouter {
        "/api/v1/statistics".nest {
            accept(APPLICATION_JSON).nest {
                GET("", statisticHandler::getStatistic)
            }
        }
    }
}