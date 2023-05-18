package com.ust.BookService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private  Integer bookId;
    private String bookName;
    private  Double bookCost;

    public Book(Integer id, String headFirstJava, int i, int i1) {
    }
}
