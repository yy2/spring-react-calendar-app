package com.yy2.calendar.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalendarService {
    private List<Event> eventList = new ArrayList<>();

    public CalendarService() {
        eventList.add(new Event("Doc", "12:00", "Doctor's appointment at this place here"));
        eventList.add(new Event("Dinner", "19:00", "Dinner at Bern's"));
        eventList.add(new Event("Meeting", "17:00", "Discuss the project over Zoom"));
    }

    public Event getEventList(String date) {
        if(date.equals("2021-1-27")) {
            return eventList.get(0);
        }
        if(date.equals("2021-1-28")) {
            return eventList.get(1);
        }
        if(date.equals("2021-1-29")) {
            return eventList.get(2);
        }
        return new Event("No Events today", "", "");
    }

    public void setEventList(String date) {
        this.eventList = eventList;
    }
}
