package com.example.shareit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String token;
    private Instant createdDate;

    public RefreshToken() {
    }

    public RefreshToken(Long id, String token, Instant createdDate) {
        this.id = id;
        this.token = token;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }
}
