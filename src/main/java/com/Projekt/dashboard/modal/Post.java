package com.Projekt.dashboard.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "post") // نام جدول
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String author;

    @Column(name = "image_url")
    private String imageUrl;

    // -------- Constructors ----------
    public Post() { }

    // برای ایجاد رکورد جدید (بدون id)
    public Post(String title, String description, String author, String imageUrl) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUrl = imageUrl;
    }

    // کامل با id (برای تست)
    public Post(Long id, String title, String description, String author, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUrl = imageUrl;
    }

    // -------- Getters/Setters ----------
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    @Override
    public String toString() {
        return "Post{id=" + id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", author='" + author + '\'' +
               ", imageUrl='" + imageUrl + '\'' +
               '}';
    }
}
