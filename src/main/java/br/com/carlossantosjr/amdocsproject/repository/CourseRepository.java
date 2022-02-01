package br.com.carlossantosjr.amdocsproject.repository;

import br.com.carlossantosjr.amdocsproject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
