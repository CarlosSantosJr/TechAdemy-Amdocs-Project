package br.com.carlossantosjr.amdocsproject.controller;

import br.com.carlossantosjr.amdocsproject.controller.dto.AdminRS;
import br.com.carlossantosjr.amdocsproject.repository.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("/")
    public List<AdminRS> findAll() {
        var admins = adminRepository.findAll();
        return admins
                .stream()
                .map(AdminRS::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AdminRS findById(@PathVariable("id") Long id) {
        var admin = adminRepository.getOne(id);
        return AdminRS.converter(admin);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        adminRepository.deleteById(id);
    }
}
