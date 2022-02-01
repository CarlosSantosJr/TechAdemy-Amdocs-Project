package br.com.carlossantosjr.amdocsproject.controller.dto;

import br.com.carlossantosjr.amdocsproject.model.Contact;

public class ContactRs {
    private Long id;
    private Long user_id;
    private String name;
    private String phone_no;
    private String email;
    private String messege;

    public static ContactRs converter(Contact c) {
        var contact = new ContactRs();
        contact.setId(c.getId());
        contact.setUser_id(c.getUser_id());
        contact.setName(c.getName());
        contact.setPhone_no(c.getPhone_no());
        contact.setEmail(c.getEmail());
        contact.setMessege(c.getMessege());
        return contact;
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

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }
}
