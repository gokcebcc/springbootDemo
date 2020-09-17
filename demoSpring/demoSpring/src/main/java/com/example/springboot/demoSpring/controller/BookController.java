package com.example.springboot.demoSpring.controller;

import com.example.springboot.demoSpring.model.Book;
import com.example.springboot.demoSpring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    //tüm kitapları getir
    @GetMapping(value ="/book")
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    //kitapları kaydet
    @PostMapping(value ="/books")
    public Book createbook(@RequestBody Book book)
    {
        return this.bookRepository.save(book);
    }

    //id ye göre kitap getir
    @GetMapping("/books/{bookId}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable(value ="bookId") Integer bookId)
    {
        Optional<Book> book=bookRepository.findById(bookId);
        return ResponseEntity.ok().body(book);
    }

    //id ye göre güncelle
    @PutMapping("books/{bookId}")
    public void updateBook(@PathVariable(value ="bookId") Integer bookId,@RequestBody Book book)
    {}

    //id ye göre sil
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable(value ="bookId") Integer bookId)
    {
        this.bookRepository.deleteById(bookId);
    }

    //güncelle
    // jpaRepository update olmadığı için save ile güncelledik
    @PutMapping("/books")
    public void updateBook(@RequestBody Book book)
    {
        this.bookRepository.save(book);
    }

}

