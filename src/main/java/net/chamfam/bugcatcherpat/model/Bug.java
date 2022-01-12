package net.chamfam.bugcatcherpat.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Bug {
    private int id;
    private String description;
    private LocalDateTime created;
}
