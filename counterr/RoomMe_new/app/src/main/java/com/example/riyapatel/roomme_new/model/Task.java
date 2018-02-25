package com.example.riyapatel.roomme_new.model;

import java.util.Date;

/**
 * Created by riyapatel on 2/24/18.
 */

public class Task {

    private Date eventDate;
    private String description;

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
