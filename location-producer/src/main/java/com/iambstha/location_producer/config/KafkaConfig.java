package com.iambstha.location_producer.config;

import com.iambstha.location_producer.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic locationTopic(){
        return TopicBuilder
                .name(AppConstant.LOCATION)
                .build();
    }

    @Bean
    public NewTopic addressTopic(){
        return TopicBuilder
                .name(AppConstant.ADDRESS)
                .build();
    }

}
