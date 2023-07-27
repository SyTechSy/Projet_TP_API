package com.odk3.projet_tp_api.Service;

import com.odk3.projet_tp_api.Repository.QuizRepository;
import com.odk3.projet_tp_api.model.Quiz;
import com.odk3.projet_tp_api.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;


    // creation Quiz
    public Quiz creerquiz (Quiz quiz){
        if (quizRepository.findByIdQuiz(quiz.getIdQuiz()) ==null){
            quizRepository .save(quiz);
            return quizRepository.findByIdQuiz(quiz.getIdQuiz());
        } else {
            return null;
        }
    }
// modification  de  quiz
    public Quiz modifquiz(Quiz quiz){
        if (quizRepository.findByIdQuiz(quiz.getIdQuiz()) != null){
            quizRepository.save(quiz);
            return quizRepository.findByIdQuiz(quiz.getIdQuiz());
        }
        else {
            return null;
        }

    }
    // lister le quiz
      public List<Quiz> listQuiz() {
        return quizRepository.findAll();
    }
    // supprimer le quiz
    public String supprimeQuiz(Quiz quiz) {

        if (quizRepository.findByIdQuiz(quiz.getIdQuiz()) != null) {
            quizRepository.delete(quiz);
            return "quiz supprimer avec succès";
        } else {
            return "pas de quiz ";
        }

    }

}
