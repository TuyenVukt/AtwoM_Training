package com.springtest.controller;

import com.springtest.domain.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectJava {

    @RequestMapping("/list")
    public  String list(Model model){
        Project p1 = new Project();
        p1.setId(1L);
        p1.setTitle("Training");
        p1.setStartDate(LocalDate.now());
        p1.setEndDate(LocalDate.now().plusDays(30));
        p1.setStatus("In-program");
        List<Project> projectList = new ArrayList<>();
        projectList.add(p1);

        Project p2 = new Project();
        p2.setId(2L);
        p2.setTitle("Training");
        p2.setStartDate(LocalDate.now());
        p2.setEndDate(LocalDate.now().plusDays(30));
        p2.setStatus("In-program");
        projectList.add(p2);

        model.addAttribute("list", projectList);
        return "project/list";

    }
}
