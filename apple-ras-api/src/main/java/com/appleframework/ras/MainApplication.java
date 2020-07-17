package com.appleframework.ras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration //这个注解用得不多，一般用@SpringBootApplication
@SpringBootApplication
//@EnableApolloConfig({"db.properties","cache.properties"})
@ComponentScan(basePackages = "com.appleframework.ras")
public class MainApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
	
}
