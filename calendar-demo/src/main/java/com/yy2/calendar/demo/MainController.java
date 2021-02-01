package com.yy2.calendar.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MainController {

    @Autowired
    private CalendarService calendarService;

    @GetMapping(path="/welcome")
    public String Welcome() {
        return "Calendar app";
    }

    @GetMapping(path="/events/{date}")
    public Event getEvents(@PathVariable String date) {
        return calendarService.getEventList(date);
    }
}
