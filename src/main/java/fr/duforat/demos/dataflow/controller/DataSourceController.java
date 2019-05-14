package fr.duforat.demos.dataflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.duforat.demos.dataflow.model.DataSource;
import fr.duforat.demos.dataflow.model.DataSourceRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/datasource")
public class DataSourceController {

	private DataSourceRepository dataSourceRepository;
	
	public DataSourceController(DataSourceRepository dataSourceRepository) {
		this.dataSourceRepository = dataSourceRepository;
	}
	
	@GetMapping
	public Flux<DataSource> findAll() {
		return dataSourceRepository.findAll();
	}
	
	public Mono<DataSource> add(@RequestBody DataSource datasource) {
		return dataSourceRepository.save(datasource);
	}
}
