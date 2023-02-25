package com.example.web.client.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class NotesModel {
    @Id
    private String id;
    private String createdBy;
    private String description;
    private String title;
}
