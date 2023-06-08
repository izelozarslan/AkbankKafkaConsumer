package com.izelozarslan.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WeatherConsumer {

    @KafkaListener(
            topics = "logs",
            groupId = "logs-for-print"
    )

    public void consume(String log) {
        System.out.println(log);
    }
}