package com.devquest.api.repositories;

import com.devquest.api.domain.userquestions.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserQuestionRepository extends JpaRepository<UserQuestion, UUID> {
}
