package com.yesthink.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.yesthink.website.Common.CustomBanner;

@EnableJpaAuditing
@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WebsiteApplication.class);
        application.setBanner(new CustomBanner());
        application.run(args);
	}

}
