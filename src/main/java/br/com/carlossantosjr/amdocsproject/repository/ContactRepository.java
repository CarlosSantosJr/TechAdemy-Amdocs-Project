package br.com.carlossantosjr.amdocsproject.repository;

import br.com.carlossantosjr.amdocsproject.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
