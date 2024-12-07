CREATE TABLE questions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    technology VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    options TEXT[],
    correct_answer VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
)