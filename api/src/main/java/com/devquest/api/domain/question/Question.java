package com.devquest.api.domain.question;

import com.devquest.api.domain.userquestions.UserQuestion;
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
@Table(name = "user_questions") // Mapeia para o nome da tabela
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue
    private UUID id;

    private String technology;
    private String content;
    private List<String> options;
    private String correctAnswer;
    private Date createdAt;

    @OneToMany(mappedBy = "question")
    private List<UserQuestion> userQuestions = new ArrayList<>();
}
