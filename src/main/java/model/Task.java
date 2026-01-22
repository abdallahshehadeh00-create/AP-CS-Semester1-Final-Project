package com.example.apcsproject.model;

public class Task {
    // These are private (Encapsulation)
    private String title;
    private String subject;
    private String dueDate;

    // The Constructor - used to create a new Task object
    public Task(String title, String subject, String dueDate) {
        this.title = title;
        this.subject = subject;
        this.dueDate = dueDate;
    }

    // Getters - allow other classes to 'read' the data safely
    public String getTitle() { return title; }
    public String getSubject() { return subject; }
    public String getDueDate() { return dueDate; }
}