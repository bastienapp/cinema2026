package co.simplon.cinema2026.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cinema2026.entity.MovieEntity;
import co.simplon.cinema2026.repository.MovieRepository;


/*
Méthodes HTTP :
- POST : créer un truc (Create du CRUD)
- GET : récupérer des trucs (Read du CRUD)
- PUT : modifier un truc entièrement (Update du CRUD)
- PATCH : modifier une partie d'un truc (Update du CRUD)
- DELETE : supprimer un truc entièrement (Delete du CRUD)

*/

@RestController
// avec cette annotation, je sais que je ne vais faire que les endpoints d'API
public class MovieController {

    private final MovieRepository movieRepository;

    // injection de dépendance
    public MovieController(MovieRepository movieRepositoryInjected) {
        this.movieRepository = movieRepositoryInjected;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAllMovies() {

        return this.movieRepository.findAll();
    }

    /*
    json: {
        "title": "",
        "description": "",
        "duration": 0,
    } -> Jackson : convertit du JSON en Objet
    */

    @PostMapping("/movies")
    public MovieEntity createMovie(@RequestBody MovieEntity movie) {

        // TODO : service et implémentation
        MovieEntity movieSaved = this.movieRepository.save(movie);
        // dans le corps de la réponse, on lui renvoi l'élément enregistré
        return movieSaved;
    }

}
