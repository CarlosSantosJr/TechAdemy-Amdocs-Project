package br.com.carlossantosjr.amdocsproject.repository;

import br.com.carlossantosjr.amdocsproject.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository  extends JpaRepository<Feedback, Long> {
}
