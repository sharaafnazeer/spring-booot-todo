package com.sharaafnazeer.todo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="appointment")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "description", length = 200, nullable = false)
    private String description;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "scheduled_on")
    private Date scheduledOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getScheduledOn() {
        return scheduledOn;
    }

    public void setScheduledOn(Date scheduledOn) {
        this.scheduledOn = scheduledOn;
    }
}
