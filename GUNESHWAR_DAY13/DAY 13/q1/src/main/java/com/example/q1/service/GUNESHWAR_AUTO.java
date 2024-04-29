package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GUNESHWAR_HO;
import com.example.q1.repository.GUNESHWAR_TO;

@Service
public class GUNESHWAR_AUTO {
    @Autowired
    private GUNESHWAR_TO authorRepository;

    public GUNESHWAR_HO saveAuthor(GUNESHWAR_HO author) {
        return authorRepository.save(author);
    }

    public GUNESHWAR_HO getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<GUNESHWAR_HO> getAllAuthors() {
        return authorRepository.findAll();
    }

    public GUNESHWAR_HO updateAuthor(Long id, GUNESHWAR_HO author) {
        GUNESHWAR_HO existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
