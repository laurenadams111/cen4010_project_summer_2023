package com.geektext.geektext_backend_api.entity;
import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "BIGINT GENERATED BY DEFAULT AS IDENTITY")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "published_date")
    private Date published_date;

    @Column(name = "isbn")
    private long isbn;

    @Column(name = "copies_sold")
    private long copies_sold;

    @Column(name = "rating")
    private double rating;

    @Column(name = "price")
    private double price;

    @Column(name = "publisher")
    private String publisher;


    public BookEntity(Long id, String title, String author, String genre, Date published_date, long isbn, long copies_sold, double rating, double price, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published_date = published_date;
        this.isbn = isbn;
        this.copies_sold = copies_sold;
        this.rating = rating;
        this.price = price;
        this.publisher = publisher;

    }

    public BookEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getCopies_sold() {
        return copies_sold;
    }

    public void setCopies_sold(long copies_sold) {
        this.copies_sold = copies_sold;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getpublisher(){return publisher;}

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
}
