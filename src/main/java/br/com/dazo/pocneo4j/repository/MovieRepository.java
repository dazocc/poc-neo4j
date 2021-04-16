package br.com.dazo.pocneo4j.repository;

import br.com.dazo.pocneo4j.model.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
}
