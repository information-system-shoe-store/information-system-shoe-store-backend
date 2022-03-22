package com.informationsystemshoestore.shoestorestatisticsservice.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration(@Value("\${webclient.shoe-store-data-service.url}") private val url: String) {

    @Bean
    fun webClient() = WebClient.builder().baseUrl(url).build()
}