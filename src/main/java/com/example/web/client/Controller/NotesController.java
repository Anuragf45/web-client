package com.example.web.client.Controller;

import com.example.web.client.Services.NotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotesController {
    Logger logger = LoggerFactory.getLogger(NotesService.class);
    @Autowired
    private NotesService notesService;
    @GetMapping("/gettingUsers")
    public ResponseEntity<List> getAllNotes(){
        logger.info("Getting all notes");
        return new ResponseEntity<>(notesService.getAllNotes(), HttpStatus.OK);
    }
}
