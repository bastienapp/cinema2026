package co.simplon.cinema2026.repository;

// hibernate : il remplit le code des méthodes de mon interface

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.cinema2026.entity.MovieEntity;

// TODO : faire une démo des type générique et comment on en est arrivé là
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

}
