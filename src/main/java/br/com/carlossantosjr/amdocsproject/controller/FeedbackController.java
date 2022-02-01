package br.com.carlossantosjr.amdocsproject.controller;

import br.com.carlossantosjr.amdocsproject.controller.dto.FeedbackRs;
import br.com.carlossantosjr.amdocsproject.repository.FeedbackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    private final FeedbackRepository feedbackRepository;

    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @GetMapping("/")
    public List<FeedbackRs> findAll() {
        var feedbacks = feedbackRepository.findAll();
        return feedbacks
                .stream()
                .map(FeedbackRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FeedbackRs findById(@PathVariable("id") Long id) {
        var feedback = feedbackRepository.getOne(id);
        return FeedbackRs.converter(feedback);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        feedbackRepository.deleteById(id);
    }
}
