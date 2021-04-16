package br.com.dazo.pocneo4j.service;

import br.com.dazo.pocneo4j.model.Movie;
import br.com.dazo.pocneo4j.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> listar() {
        return movieRepository.findAll();
    }

    public Movie buscarPorId(Long id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);

        return optionalMovie.isPresent() ? optionalMovie.get() : null;
    }

    public Movie salvar(Movie Movie) {
        return movieRepository.save(Movie);
    }

    public void atualizar(Movie movie, Long id) {

        Movie movieBanco = buscarPorId(id);

        if(movieBanco != null){
            movieBanco.setDirector(movie.getDirector());
            movieBanco.setTitle(movie.getTitle());

            movieRepository.save(movieBanco);
        }
    }

    public void deletar(Long id) {
        movieRepository.deleteById(id);
    }
}
