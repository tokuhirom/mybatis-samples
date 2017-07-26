package com.example;

import com.example.service.SampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class MybatisSpringBootSampleApplication implements CommandLineRunner {
    private final SampleService sampleService;

    public MybatisSpringBootSampleApplication(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sampleService.run();
    }
}
