package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.GUNESHWAR_P;
import com.example.day14ce2.repository.GUNESHWAR_REPO;

@Service
public class GUNESHWAR_SER {
   @Autowired
   GUNESHWAR_REPO bookRepo;

   public GUNESHWAR_P addBook(GUNESHWAR_P book)
   {
        return bookRepo.save(book);
   }

   public List<GUNESHWAR_P> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<GUNESHWAR_P> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public GUNESHWAR_P updateBook(int id,GUNESHWAR_P book)
   {
        GUNESHWAR_P avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
