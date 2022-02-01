package br.com.carlossantosjr.amdocsproject.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user1")
public class User1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="phone_no")
    private String phone_no;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="reg_date")
    private Date reg_date;

    @Column(name="password")
    private String password;

    @Column(name="upload_photo")
    private String upload_photo;

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
