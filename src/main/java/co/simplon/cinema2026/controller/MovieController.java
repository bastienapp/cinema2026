package co.simplon.cinema2026.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cinema2026.entity.MovieEntity;

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

    @GetMapping("/movies")
    public List<MovieEntity> getAllMovies() {
        List<MovieEntity> movieList = new ArrayList<>();
        movieList.add(new MovieEntity("Alien", "Ça fait peur", 128));
        movieList.add(new MovieEntity("Retour vers le futur", "C'est sympa", 155));

        return movieList;
    }

}
