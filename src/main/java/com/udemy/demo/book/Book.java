package com.udemy.demo.book;

import com.udemy.demo.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
//Permet d'indiquer qu'il ya une table qui vas être nommé book
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String title;
    @ManyToOne
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCatgoryId() {
        return catgoryId;
    }

    public void setCatgoryId(int catgoryId) {
        this.catgoryId = catgoryId;
    }

    @ManyToOne
    private User user;

    private BookStatus bookStatus;

    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Transient
    private int catgoryId;

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
