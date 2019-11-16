package edu.neu.csye6200;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "edu.neu.csye6200.group1.module.mapper")
@SpringBootApplication
public class DayCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DayCareApplication.class, args);
	}

}
