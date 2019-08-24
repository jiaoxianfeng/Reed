package com.example.table;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@Document(collection = "Book")
public class BookEntity{
    private String bookName;
    private String author;
    private String publisher;
    private String chupin;
    private String subtitle;
    private String originalTitle;
    private Date publishingYear;
    private String ISBN;
    private String price;
    private String translator;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getChupin() {
        return chupin;
    }

    public void setChupin(String chupin) {
        this.chupin = chupin;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Date getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Date publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }
}
