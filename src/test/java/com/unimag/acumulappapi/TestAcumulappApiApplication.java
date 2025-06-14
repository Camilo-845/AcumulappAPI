package com.unimag.acumulappapi;

import org.springframework.boot.SpringApplication;

public class TestAcumulappApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(AcumulappApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
