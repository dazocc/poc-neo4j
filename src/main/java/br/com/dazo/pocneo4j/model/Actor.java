package br.com.dazo.pocneo4j.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@NoArgsConstructor
@Data
@Node
public class Actor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Boolean star;
}
