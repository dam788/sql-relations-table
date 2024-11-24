package com.jpa.fcdemo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "asociation")
public class AssociationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String president;

    // fetch y mappedBy va en el @OneToMany
    @OneToMany(
            targetEntity = ClubEntity.class,
            fetch = FetchType.LAZY,
            mappedBy = "association" // ésta es la clave foránea
    )
    private List<ClubEntity> clubs;

}
