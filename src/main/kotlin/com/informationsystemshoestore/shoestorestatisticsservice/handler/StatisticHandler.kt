package com.informationsystemshoestore.shoestorestatisticsservice.handler

import com.informationsystemshoestore.shoestorestatisticsservice.model.Statistic
import org.json.simple.JSONObject
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import java.util.*

@Component
class StatisticHandler(
    private val webClient: WebClient,
    @Value("\${webclient.shoe-store-data-service.get-statistic}") private val statisticPath: String
) {

    suspend fun getStatistic(req: ServerRequest): ServerResponse {

        val startDate = req.queryParam("startDate")
        val endDate = req.queryParam("endDate")

        val statistic = Statistic(
            productCount = (getStatisticFromClient(startDate, endDate)["t1"] as Int).toLong(),
            providerCount = (getStatisticFromClient(startDate, endDate)["t2"] as Int).toLong(),
            saleCount = (getStatisticFromClient(startDate, endDate)["t3"] as Int).toLong()
        )

        return statistic.let {
            ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValueAndAwait(it)
        }
    }

    private suspend fun getStatisticFromClient(startDate: Optional<String>, endDate: Optional<String>): JSONObject {
        return webClient.get()
            .uri { builder ->
                builder
                    .path(statisticPath)
                    .queryParamIfPresent("startDate", startDate)
                    .queryParamIfPresent("endDate", endDate)
                    .build()
            }
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .awaitBody()
    }
}