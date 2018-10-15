package com.buutcamp.sringdemo.configuration;

import com.buutcamp.sringdemo.beans.SearchAlgorithm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name ="BinarySearch")
    public SearchAlgorithm searchAlgorithm () {
        return new SearchAlgorithm();
    }
}
