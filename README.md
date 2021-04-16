# poc-neo4j
This is a POC about neo4j funcionalities

Start neo4j database
docker run -p7474:7474 -p7687:7687 -e NEO4J_AUTH=neo4j/s3cr3t neo4j

can access by browser http://localhost:7474/browser/

create data direct:

create (Inception:Movie {title: 'Inception', director: 'Christopher Nolan'})

create (Inception:Movie {title: 'Inception', director: 'Christopher Nolan'})

create (DarkKnight:Movie {title: 'The Dark Knight', director: 'Christopher Nolan'})

create (Peter:User {name: 'Peter N', age: 30})

create (Sam:User {name: 'Sam Sheldon', age: 20})

create (Ryan:User {name: 'Ryan A.', age: 35})

create (Inception)-[:RATED {rating: 9}]->(Peter)

create (Inception)-[:RATED {rating: 8}]->(Sam)

create (DarkKnight)-[:RATED {rating: 9}]->(Sam)

create (DarkKnight)-[:RATED {rating: 8}]->(Peter)
