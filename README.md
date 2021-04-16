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

listAll
curl -X GET  http://localhost:8081/user 

RetrieveById
curl -X GET  http://localhost:8081/user/2

save
curl -X POST -H "Content-Type: application/json" -d '{"name":"DAZO","age":"38"}' http://localhost:8081/user

update
curl -X PUT -H "Content-Type: application/json" -d '{"name":"DAZO2","age":"39"}' http://localhost:8081/user/5

delete
curl -X DELETE http://localhost:8081/user/5

save with movies
curl -X POST -H "Content-Type: application/json" -d '{"name":"DAZO","age":"38", "listRated": [{"rating": 5, "movie": {"title": "teste title", "director": "teste director"}}]}' http://localhost:8081/user

----------------------------------------------------------------------------------------------


listAll
curl -X GET  http://localhost:8081/movie

RetrieveById
curl -X GET  http://localhost:8081/movie/1

save
curl -X POST -H "Content-Type: application/json" -d '{"title":"Spider-Man","director":"Sam Raimi", "listActor": [{"name": "Tobey Maguire", "star": true}, {"name": "Kirsten Dunst", "star": false}]}' http://localhost:8081/movie

update
curl -X PUT -H "Content-Type: application/json" -d '{"title":"Spider-Man","director":"Sam Raimi2"}' http://localhost:8081/movie/8

delete
curl -X DELETE http://localhost:8081/movie/8