package com.xMIFx.SEAP.application.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xMIFx.SEAP.application.starter.springConfig.MvcConfig;
import com.xMIFx.SEAP.application.starter.springConfig.SpringSecurityConfig;
import com.xMIFx.SEAP.warehouse.h2base.impl.springConfig.DataBaseConfig;

@Controller
@Import({MvcConfig.class, SpringSecurityConfig.class, DataBaseConfig.class})
@SpringBootApplication
public class SeapApplication {

	@RequestMapping("/")
	String home() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SeapApplication.class, args);
	}
}
