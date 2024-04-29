package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.GUNESHWAR_P;
import com.example.day14ce2.service.GUNESHWAR_SER;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class GUNESHWAR_CONN {
    @Autowired
    GUNESHWAR_SER bookService;

    @PostMapping("/api/book")
    public GUNESHWAR_P addBook(@RequestBody GUNESHWAR_P book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public GUNESHWAR_P updateBook(@PathVariable int id,@RequestBody GUNESHWAR_P book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<GUNESHWAR_P> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<GUNESHWAR_P> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
