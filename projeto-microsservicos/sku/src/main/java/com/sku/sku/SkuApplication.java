package com.sku.sku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication ( exclude = DataSourceAutoConfiguration.class)
public class SkuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkuApplication.class, args);
	}

}
