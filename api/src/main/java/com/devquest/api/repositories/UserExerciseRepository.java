package com.devquest.api.repositories;

import com.devquest.api.domain.userexercises.UserExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserExerciseRepository extends JpaRepository<UserExercise, UUID> {
}
