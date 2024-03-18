package com.remotelms.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private String description;
    private List<Lecture> lectures;

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        this.lectures = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }
}
