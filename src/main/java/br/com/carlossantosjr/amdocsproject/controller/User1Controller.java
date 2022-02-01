package br.com.carlossantosjr.amdocsproject.controller;

import br.com.carlossantosjr.amdocsproject.controller.dto.User1Rq;
import br.com.carlossantosjr.amdocsproject.controller.dto.User1Rs;
import br.com.carlossantosjr.amdocsproject.model.User1;
import br.com.carlossantosjr.amdocsproject.repository.User1Repository;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user1")
public class User1Controller {
    private final User1Repository user1Repository;

    public User1Controller(User1Repository user1Repository) {
        this.user1Repository = user1Repository;
    }

    @GetMapping("/")
    public List<User1Rs> findAll() {
        var users = user1Repository.findAll();
        return users
                .stream()
                .map(User1Rs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public User1Rs findById(@PathVariable("id") Long id) {
        var user = user1Repository.getOne(id);
        return User1Rs.converter(user);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        user1Repository.deleteById(id);
    }

    @PostMapping("/")
    public void saveUser(@RequestBody User1Rq user) {
        var u = new User1();
        u.setName(user.getName());
        u.setUpload_photo(user.getUpload_photo());
        u.setPassword(user.getPassword());
        u.setEmail(user.getEmail());
        u.setAddress(user.getAddress());
        u.setPhone_no(user.getPhone_no());
        user1Repository.save(u);
    }
}
