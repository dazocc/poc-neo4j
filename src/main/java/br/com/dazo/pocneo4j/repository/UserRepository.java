package br.com.dazo.pocneo4j.repository;

import br.com.dazo.pocneo4j.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User) <- [r:RATED]-(m:Movie) return u,r,m")
    Collection<User> findAllUser();
}
