package br.com.carlossantosjr.amdocsproject.controller;

import br.com.carlossantosjr.amdocsproject.controller.dto.AdminRS;
import br.com.carlossantosjr.amdocsproject.controller.dto.ContactRs;
import br.com.carlossantosjr.amdocsproject.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/")
    public List<ContactRs> findAll() {
        var contacts = contactRepository.findAll();
        return contacts
                .stream()
                .map(ContactRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ContactRs findById(@PathVariable("id") Long id) {
        var contact = contactRepository.getOne(id);
        return ContactRs.converter(contact);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        contactRepository.deleteById(id);
    }
}
