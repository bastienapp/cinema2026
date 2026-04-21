package co.simplon.cinema2026.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
Pour qu'une entité fonctionne, il faut que ce soit un Java Bean

Java Bean :
- propriétés privées
- constructeur vide
- getters et setters (bien formés)
- serializable : transformé en texte, ou reconstruit en objet à partir de texte

*/
@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // protection dans la table en base de données (côté SQL)
    @Column(nullable=false)
    // couche de sécurité java
    @Nonnull
    private String title;

    private String description;

    @Column(columnDefinition="INT DEFAULT 0")
    private Integer duration = 0;

    public MovieEntity() {

    }

    public MovieEntity(String title, String description, Integer duration) {

        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    private Long getId() {
        return this.id;
    }

    private void setId(Long newId) {
        this.id = newId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
