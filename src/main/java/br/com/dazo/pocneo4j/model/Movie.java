package br.com.dazo.pocneo4j.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@NoArgsConstructor
@Data
@Node
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String director;

    @Relationship(type= "ACTED", direction = Relationship.Direction.INCOMING)
    private List<Actor> listActor;
}
