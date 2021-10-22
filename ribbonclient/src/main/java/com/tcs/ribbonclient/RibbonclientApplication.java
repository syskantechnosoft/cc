package com.tcs.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.tcs.ribbonclient.config.RibbonConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class RibbonclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonclientApplication.class, args);
	}

}
