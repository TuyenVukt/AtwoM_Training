package com.springtest.service;

import com.springtest.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl {
    @Autowired
    JpaRepository repository;

    public List<Project> findAll(){
        return repository.findAll();
    }
}
