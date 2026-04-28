package co.simplon.cinema2026.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.cinema2026.entity.MovieEntity;
import co.simplon.cinema2026.repository.MovieRepository;

/*
public
private : que la classe elle-même
package : type par défaut : accès dans le même dossier (package) : véritable nom : package private
protected : accès par les classes enfants (qui héritent)
*/

@Service
// un service, ça fait la logique métier : en clair, ça fait des traitements, ex
// :
// validation des données reçue par l'API (ex: longueur d'un mot de passe...)
public class MovieService {

    private final MovieRepository movieRepository;
    // injection de dépendance du MovieRepository
    public MovieService(MovieRepository movieRepositoryInjected) {
        this.movieRepository = movieRepositoryInjected;
    }

    public List<MovieEntity> findAllMovies() {
        return this.movieRepository.findAll();
    }

    public List<MovieEntity> findMoviesByTitle(String title) {
        return this.movieRepository.findByTitleIgnoreCaseContaining(title);
    }

    public MovieEntity createMovie(MovieEntity movie) {

        return this.movieRepository.save(movie);
    }
}
