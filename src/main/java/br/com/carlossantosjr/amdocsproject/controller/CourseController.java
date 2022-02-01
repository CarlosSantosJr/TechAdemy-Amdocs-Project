package br.com.carlossantosjr.amdocsproject.controller;

import br.com.carlossantosjr.amdocsproject.controller.dto.ContactRs;
import br.com.carlossantosjr.amdocsproject.controller.dto.CourseRs;
import br.com.carlossantosjr.amdocsproject.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/")
    public List<CourseRs> findAll() {
        var courses = courseRepository.findAll();
        return courses
                .stream()
                .map(CourseRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CourseRs findById(@PathVariable("id") Long id) {
        var course = courseRepository.getOne(id);
        return CourseRs.converter(course);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        courseRepository.deleteById(id);
    }
}
