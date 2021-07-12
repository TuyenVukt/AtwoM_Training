package com.springtest.controller;

import com.springtest.domain.Issue;
import com.springtest.domain.Project;
import com.springtest.domain.User;
import com.springtest.domain.common.ProjectRequestWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectRestController {
    @RequestMapping(value = {"/sample2/{path1}", "/sample2"})
    public String sample(@RequestParam Optional<String> arg1, @RequestParam  Optional<String> arg2, @PathVariable Optional<String>  path1){
        System.out.println("Test RESTful API ");
        return arg1.toString()+ arg2.toString();
    }

    @GetMapping({"sample3"})
    public Object sample(@RequestParam Map<String, Object> arg){
        return arg;
    }

    @GetMapping("/project-sample-data")
    public ProjectRequestWrapper  sample(){
        List<Project> projects = new ArrayList<>();
        //User
        User u1 = new User(1001L,"tuyenvu","tuyen.vd@gmail.com",23);
        User u2 = new User(1002L, "xuanthanh","thanhbi@gmail.com",21);
        //Issues
        Issue i1 = new Issue(1L,"Task for tuyenvu", LocalDate.now().plusDays(5),LocalDate.now().plusDays(15),u1);
        Issue i2 = new Issue(2L,"Task for tuyenvu2", LocalDate.now().plusDays(16),LocalDate.now().plusDays(20),u1);
        Issue i3 = new Issue(3L,"Task for xuanthanh", LocalDate.now().plusDays(1),LocalDate.now().plusDays(5),u2);
        List<Issue> issueList = new ArrayList<>();
        issueList.add(i1);
        issueList.add(i2);
        issueList.add(i3);
        //Project
        Project p1 = new Project(1L,"project 1",LocalDate.now().plusDays(1),LocalDate.now().plusDays(21),"In-Prosess",issueList);
        projects.add(p1);
        ProjectRequestWrapper wrapper = new ProjectRequestWrapper();
        wrapper.setProjects(projects);
        wrapper.setLoggedUser(u1);
        return wrapper;

    }

    @PostMapping("/project-sample-data")
    public ResponseEntity<?> sample(@RequestBody ProjectRequestWrapper wrapper){
        Map<String, Object> add  = wrapper.getAdditional();
        Integer col1 = (Integer) add.get("col1");
        String col2 = (String) add.get("col2");
        String col3 = (String) add.get("col3");
        System.out.println(col1+col2+col3);
        return ResponseEntity.ok(wrapper);
    }
}
