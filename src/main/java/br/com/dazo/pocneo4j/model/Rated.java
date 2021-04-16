package br.com.dazo.pocneo4j.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@Data
@NoArgsConstructor
public class Rated {

    @Id
    @GeneratedValue
    private Long id;

    private Integer rating;

    @TargetNode
    private Movie movie;

}
