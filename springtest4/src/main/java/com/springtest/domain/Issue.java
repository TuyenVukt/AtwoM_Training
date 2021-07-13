package com.springtest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    private Long id;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private User assignee;
}
