package fr.duforat.demos.dataflow.model;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

@Repository
public interface DataSourceRepository extends ReactiveCrudRepository<DataSource, Long> {

	@Query("SELECT id, kind, source, title FROM datasource d")
	Flux<DataSource> findAll();
	
}
