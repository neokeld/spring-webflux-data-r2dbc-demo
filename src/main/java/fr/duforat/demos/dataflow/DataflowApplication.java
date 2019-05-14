package fr.duforat.demos.dataflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class DataflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataflowApplication.class, args);
	}

}
