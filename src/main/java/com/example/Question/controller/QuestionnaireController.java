package com.example.Question.controller;

import com.example.Question.service.QuestionService;
import com.example.Question.entities.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionnaireController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questionnaire/{id}/question")
    public List<Question> getQuestions(@PathVariable Long id) {
        return questionService.getQuestionsByQuestionnaireId(id);
    }
}
