package com.cts.onlineShopping.config;

import java.util.Random;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ProductProducer {
	
	public final KafkaTemplate<Integer, String> template;
	
	public ListenableFuture<SendResult<Integer, String>> send(String topic, String msg){
		Random random = new Random();
		return template.send(topic, (random.nextInt()%100), msg);
	}

}
