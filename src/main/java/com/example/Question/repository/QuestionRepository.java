package com.example.Question.repository;
import com.example.Question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuestionnaire_QuestionnaireId(Long questionnaireId);
}
