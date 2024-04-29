package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.GUNESHWAR_ROO;
import com.example.q1.service.GUNESHWAR_TYY;

@RestController
public class GUNESHWAR_CE1 {
    @Autowired
    private GUNESHWAR_TYY bookService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<GUNESHWAR_ROO> getBookById(@PathVariable Long bookId) {
        GUNESHWAR_ROO book = bookService.getBookById(bookId);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
