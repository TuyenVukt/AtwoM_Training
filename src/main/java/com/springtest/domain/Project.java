package com.springtest.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Project {
    private Long id;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private List<Issue> issues;
}
