package com.example.web.client.Services;

import com.example.web.client.Models.NotesModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class NotesService {
    WebClient.Builder builder=WebClient.builder();
    Logger logger= LoggerFactory.getLogger(NotesService.class);

    public List<NotesModel> getAllNotes(){
        logger.info("Fetching all Notes");
        String url="http://localhost:3000/getNotes";
        List<NotesModel> response=builder.build().get().uri(url).retrieve().toEntity(List.class).block().getBody();
        logger.info("Service is Gonna Send Back the Response from getUserCollectionByTitle");
        return response;
    }
}
