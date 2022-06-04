package com.tuysss.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private int tid;
    private String title;
    private String description;
    private int hours;
    private String pic;
    private String sort;
}
