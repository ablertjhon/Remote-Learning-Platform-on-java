package com.remotelms.model;

import java.time.LocalDateTime;

public class Lecture {
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String content;

    public Lecture(String title, LocalDateTime startTime, LocalDateTime endTime, String content) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getContent() {
        return content;
    }
}
