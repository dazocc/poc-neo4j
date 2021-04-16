package br.com.dazo.pocneo4j.resource;

import br.com.dazo.pocneo4j.model.Movie;
import br.com.dazo.pocneo4j.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> listar() {
        List<Movie> listMovie = movieService.listar();

        return ResponseEntity.status(HttpStatus.OK).body(listMovie);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> buscar(@PathVariable Long id) {

        Movie Movie = movieService.buscarPorId(id);

        return ResponseEntity.status(HttpStatus.OK).body(Movie);
    }

    @PostMapping
        public ResponseEntity<Movie> salvar(@RequestBody Movie movie) {

        movie = movieService.salvar(movie);

        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> atualizar(@RequestBody Movie movie, @PathVariable Long id) {

        movieService.atualizar(movie, id);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        movieService.deletar(id);

        return ResponseEntity.noContent().build();
    }

}
