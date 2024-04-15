package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.Book;
import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);
}
