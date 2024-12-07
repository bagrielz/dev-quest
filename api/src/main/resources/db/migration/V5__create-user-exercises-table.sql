CREATE TABLE user_exercises (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id UUID NOT NULL,
    exercise_id UUID NOT NULL,
    status VARCHAR(50),
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),

    CONSTRAINT fk_exercise FOREIGN KEY (exercise_id) REFERENCES exercises(id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
)