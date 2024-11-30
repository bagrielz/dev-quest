package com.devquest.api.domain.exercise;

import com.devquest.api.domain.userexercises.UserExercise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity // Representa as entradas da tabela como objetos
@Table(name = "users") // Mapeia para o nome da tabela
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    @Id
    @GeneratedValue
    private UUID id;

    private String technology;
    private String content;
    private Date createdAt;

    @OneToMany(mappedBy = "exercise")
    private List<UserExercise> userExercises = new ArrayList<>();
}
