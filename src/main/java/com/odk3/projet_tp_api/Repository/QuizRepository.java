package com.odk3.projet_tp_api.Repository;

import com.odk3.projet_tp_api.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    public Quiz findByIdQuiz(int IdQuiz);

}
