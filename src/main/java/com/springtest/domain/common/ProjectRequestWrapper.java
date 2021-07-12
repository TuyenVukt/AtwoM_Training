package com.springtest.domain.common;

import com.springtest.domain.Project;
import com.springtest.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectRequestWrapper {
    private List<Project> projects;
    private User loggedUser;
    private Map<String, Object> additional;
}
