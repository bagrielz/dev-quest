package com.devquest.api.domain.user;

import com.devquest.api.domain.userexercises.UserExercise;
import com.devquest.api.domain.userquestions.UserQuestion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
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
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String username;
    private String email;
    private String passwordHash;
    private Integer questionsCorrect;
    private Integer exercisesCompleted;
    private Date createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user")
    private List<UserQuestion> userQuestions = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserExercise> userExercises = new ArrayList<>();
}
