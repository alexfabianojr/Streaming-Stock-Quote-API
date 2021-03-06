package com.streaming.stock.quote.service.service;

import com.streaming.stock.quote.service.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {
    Flux<Quote> fetchQuoteStream(Duration period);
}
