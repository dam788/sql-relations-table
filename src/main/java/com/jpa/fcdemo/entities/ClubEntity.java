package com.jpa.fcdemo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "club")
public class ClubEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // UNO A UNO
    // la relacion se hace donde queremos que quede la clave foránea
    @OneToOne(
            targetEntity = CoachEntity.class, // cual es la entidad con la que se va a hacer la relación
            cascade = CascadeType.PERSIST
    )
    @JoinColumn(name = "id_coach") // personalizamos el nombre, pasó de "coach_id" a "id_coach"
    private CoachEntity coach;

    // UNO A MUCHOS
    @OneToMany(
            targetEntity = PlayerEntity.class,
            fetch = FetchType.LAZY, // EAGER: me trae toda la lista - LAZY: solo cuando la solicite (carga perezosa)...
            mappedBy = "club" // se usa para mapear la clave foránea club que está en player (para no crear tabla intermedia)...
    )
    private List<PlayerEntity> players;

    // MUCHOS A UNO
    @ManyToOne(targetEntity = AssociationEntity.class)
    @JoinColumn(name = "id_association")
    private AssociationEntity association;

    // MUCHOS A MUCHOS
    @ManyToMany(
            targetEntity = CompetitionEntity.class,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "club_competitions", // nombre de tabla intermedia
            joinColumns = @JoinColumn(name = "club"), // nombre primer id tabla
            inverseJoinColumns = @JoinColumn(name = "competition") // nombre de segundo id

    )
    private List<CompetitionEntity> competitions;

}
