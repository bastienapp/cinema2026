package co.simplon.cinema2026.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.simplon.cinema2026.entity.MovieEntity;
import co.simplon.cinema2026.repository.MovieRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public DataInitializer(MovieRepository movieRepositoryInjected) {
        this.movieRepository = movieRepositoryInjected;
    }

    @Override
    public void run(String... args) throws Exception {
        // Créé des films au démarrage
        // repository : permet d'interagir avec la base de données (avec des entités)

        MovieEntity alien = new MovieEntity("Alien", "Ça fait peur", 128);
        MovieEntity backToTheFuture = new MovieEntity("Retour vers le futur", "C'est sympa", 155);

        this.movieRepository.save(alien);
        this.movieRepository.save(backToTheFuture);

        System.out.println(alien);
        System.out.println(backToTheFuture);
    }

}
