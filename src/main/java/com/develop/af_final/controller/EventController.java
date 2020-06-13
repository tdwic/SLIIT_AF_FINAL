package com.develop.af_final.controller;

import com.develop.af_final.model.EventAll;
import com.develop.af_final.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

    @Autowired
    public EventRepository eventRepository;

    @RequestMapping(value = "/event", method = RequestMethod.POST)
    public EventAll addNewEvent(@RequestBody EventAll event){
        return eventRepository.save(event);
    }

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public ArrayList<EventAll> addNewEvent(){
        return (ArrayList<EventAll>) eventRepository.findAll();
    }

}
