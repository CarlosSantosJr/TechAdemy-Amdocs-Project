package br.com.carlossantosjr.amdocsproject.controller.dto;

import br.com.carlossantosjr.amdocsproject.model.Admin;

public class AdminRS {
    private Long id;
    private String name;
    private String email;
    private String password;

    public static AdminRS converter(Admin u) {
        var adm = new AdminRS();
        adm.setId(u.getId());
        adm.setName(u.getName());
        adm.setEmail(u.getEmail());
        adm.setPassword(u.getPassword());
        return adm;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
