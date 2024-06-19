package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

// DTO
public class SimpleBookRequest {

    @JsonProperty(defaultValue = "0")
    private Integer id;

    @JsonProperty("title")
    private String bookTitle;

    public SimpleBookRequest() {
        this.id = 0;
        this.setBookTitle("no name");
    }

    public SimpleBookRequest(int id, String bookTitle) {
        this.id = id;
        this.bookTitle = bookTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "SimpleBookRequest{" +
                "id=" + id +
                ", title='" + bookTitle + '\'' +
                '}';
    }
}
