package com.shrestha.kush.codefellowship;

import javafx.geometry.Pos;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne
    public AppUser user;

    private String body;
    private Timestamp createAt;

    public Post(){}

    public Post(String body, Timestamp createAt){
        this.body = body;
        this.createAt = createAt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }
}
