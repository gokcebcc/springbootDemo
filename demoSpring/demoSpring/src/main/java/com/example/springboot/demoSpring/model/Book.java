package com.example.springboot.demoSpring.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "book",catalog = "testdb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="All details about the books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String bookName;
    private String bookPublishDate;
    private String bookPageNo;

    public Book(String bookName, String bookPublishDate, String bookPageNo) {
        this.bookName = bookName;
        this.bookPublishDate = bookPublishDate;
        this.bookPageNo = bookPageNo;
    }
}