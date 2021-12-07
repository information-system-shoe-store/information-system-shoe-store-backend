package com.informationsystemshoestore.shoestoredataservice.handler;

import org.springframework.http.MediaType;
import org.springframework.http.ReactiveHttpOutputMessage;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HomeHandler {

    public Mono<ServerResponse> home() {
        BodyInserter<String, ReactiveHttpOutputMessage> body =
                BodyInserters.fromValue("Home page");

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(body);
    }
}
