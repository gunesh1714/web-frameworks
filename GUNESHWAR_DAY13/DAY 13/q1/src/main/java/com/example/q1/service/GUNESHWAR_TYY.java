package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GUNESHWAR_HO;
import com.example.q1.model.GUNESHWAR_ROO;
import com.example.q1.repository.GUNESHWAR_TO;
import com.example.q1.repository.GUNESHWAR_IO;

@Service
public class GUNESHWAR_TYY {
    @Autowired
    private GUNESHWAR_IO bookRepository;
@Autowired
private GUNESHWAR_TO authorRepository;
    public GUNESHWAR_ROO saveBook(Long authorId, GUNESHWAR_ROO book) {
        GUNESHWAR_HO author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public GUNESHWAR_ROO getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

