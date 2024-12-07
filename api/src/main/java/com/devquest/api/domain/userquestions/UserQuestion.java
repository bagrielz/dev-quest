package com.devquest.api.domain.userquestions;

import com.devquest.api.domain.question.Question;
import com.devquest.api.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity // Representa as entradas da tabela como objetos
@Table(name = "user_questions") // Mapeia para o nome da tabela
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserQuestion {
    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private boolean isCorrect;
    private Date answeredAt;
}
