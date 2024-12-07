package com.devquest.api.domain.userexercises;

import com.devquest.api.domain.exercise.Exercise;
import com.devquest.api.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity // Representa as entradas da tabela como objetos
@Table(name = "user_exercises") // Mapeia para o nome da tabela
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserExercise {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Exercise exercise;

    private boolean isDone;
    private Date completedAt;
}
