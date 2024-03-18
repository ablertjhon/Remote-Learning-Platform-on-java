package com.remotelms;

import com.remotelms.model.Course;
import com.remotelms.model.Lecture;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Programming", "Learn Java programming language");
        Lecture lecture1 = new Lecture("Introduction to Java", LocalDateTime.now(), LocalDateTime.now().plusHours(1), "Java basics");
        Lecture lecture2 = new Lecture("Object-Oriented Programming in Java", LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3), "OOP concepts in Java");

        course.addLecture(lecture1);
        course.addLecture(lecture2);

        System.out.println("Course: " + course.getTitle());
        System.out.println("Description: " + course.getDescription());
        System.out.println("Lectures:");
        for (Lecture lecture : course.getLectures()) {
            System.out.println("- " + lecture.getTitle());
            System.out.println("  Start Time: " + lecture.getStartTime());
            System.out.println("  End Time: " + lecture.getEndTime());
            System.out.println("  Content: " + lecture.getContent());
        }
    }
}
