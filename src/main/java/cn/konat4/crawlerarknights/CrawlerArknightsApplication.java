package cn.konat4.crawlerarknights;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//使用定时任务, 需要先开启定时任务, 需要添加注解
@EnableScheduling
public class CrawlerArknightsApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(CrawlerArknightsApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);
		// SpringApplication.run(CrawlerArknightsApplication.class, args);
		
	}

}