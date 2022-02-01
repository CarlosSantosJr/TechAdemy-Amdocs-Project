package br.com.carlossantosjr.amdocsproject.controller.dto;

import br.com.carlossantosjr.amdocsproject.model.User1;

import javax.persistence.Column;
import java.util.Date;

public class User1Rs {
    private Long id;
    private String name;
    private String phone_no;
    private String email;
    private String address;
    private Date reg_date;
    private String password;
    private String upload_photo;

    public static User1Rs converter(User1 u) {
        var user = new User1Rs();
        user.setId(u.getId());
        user.setName(u.getName());
        user.setAddress(u.getAddress());
        user.setEmail(u.getEmail());
        user.setPassword(u.getPassword());
        user.setPhone_no(u.getPhone_no());
        user.setReg_date(u.getReg_date());
        user.setUpload_photo(u.getUpload_photo());
        return user;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpload_photo() {
        return upload_photo;
    }

    public void setUpload_photo(String upload_photo) {
        this.upload_photo = upload_photo;
    }
}
