package com.example.day6pah.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6pah.model.GUNESHWAR_model;
import com.example.day6pah.repository.GUNESHWAR_repo;

@Service
public class GUNESHWAR_service {
    public GUNESHWAR_repo languageRepo;
    public GUNESHWAR_service(GUNESHWAR_repo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(GUNESHWAR_model language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GUNESHWAR_model> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<GUNESHWAR_model> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<GUNESHWAR_model> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}
