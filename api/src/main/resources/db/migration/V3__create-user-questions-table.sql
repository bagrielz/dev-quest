CREATE TABLE user_questions (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(), -- Relacionamento com a tabela de usuários
    user_id UUID NOT NULL, -- Relacionamento com a tabela de questões
    question_id UUID NOT NULL,
    status VARCHAR(50), -- Status da questão (ex.: respondida, correta)
    created_at TIMESTAMP NOT NULL DEFAULT NOW(), -- Data de criação

    CONSTRAINT fk_question FOREIGN KEY (question_id) REFERENCES questions(id),
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
)