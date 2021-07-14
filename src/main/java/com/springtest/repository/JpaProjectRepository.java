package com.springtest.repository;

import com.springtest.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAll();
}
