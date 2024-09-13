package com.example.Question.service;

import com.example.Question.repository.QuestionRepository;
import com.example.Question.entities.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getQuestionsByQuestionnaireId(Long questionnaireId) {
        return questionRepository.findByQuestionnaire_QuestionnaireId(questionnaireId);
    }

}


