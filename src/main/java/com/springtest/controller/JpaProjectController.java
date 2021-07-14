package com.springtest.controller;

import com.springtest.domain.Project;
import com.springtest.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa/project")
public class JpaProjectController {
    @Autowired
    ProjectServiceImpl projectService;

    @GetMapping("/project-list")
    public ResponseEntity<?> projectList(){
        List<Project> projects = projectService.findAll();
        return ResponseEntity.ok(projects);
    }

}
