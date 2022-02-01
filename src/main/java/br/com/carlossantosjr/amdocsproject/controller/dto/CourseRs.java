package br.com.carlossantosjr.amdocsproject.controller.dto;

import br.com.carlossantosjr.amdocsproject.model.Course;

public class CourseRs {
    private Long id;
    private String name;
    private String desp;
    private String resource;
    private Double fees;

    public static CourseRs converter(Course c) {
        var course = new CourseRs();
        course.setId(c.getId());
        course.setName(c.getName());
        course.setDesp(c.getDesp());
        course.setResource(c.getResource());
        course.setFees(c.getFees());
        return course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
}
