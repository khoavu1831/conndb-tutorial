package com.example.conndb_tutorial.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;

    // ✅ Constructor không tham số
    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // ✅ Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
