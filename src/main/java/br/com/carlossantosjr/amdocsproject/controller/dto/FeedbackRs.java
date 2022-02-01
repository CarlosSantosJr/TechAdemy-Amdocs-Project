package br.com.carlossantosjr.amdocsproject.controller.dto;

import br.com.carlossantosjr.amdocsproject.model.Feedback;

public class FeedbackRs {
    private Long id;
    private Long user_id;
    private String name;
    private String email;
    private String feedback;

    public static FeedbackRs converter(Feedback f) {
        var feedback = new FeedbackRs();
        feedback.setId(f.getId());
        feedback.setUser_id(f.getUser_id());
        feedback.setName(f.getName());
        feedback.setEmail(f.getEmail());
        feedback.setFeedback(f.getFeedback());
        return feedback;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
