package com.geektext.geektext_backend_api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", columnDefinition = "BIGINT GENERATED BY DEFAULT AS IDENTITY")
    private Long author_id;

    @Column(name = "author_name")
    private String author_name;

    @JsonIgnore
    @OneToMany(mappedBy = "author_id")
    private List<BookEntity> books;


    public AuthorEntity() {}

    public AuthorEntity(String author_name) {
        this.author_name = author_name;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

}
