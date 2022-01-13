package net.chamfam.bugcatcherpat.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bug {
    private String id;
    private String description;
    private LocalDateTime created;

    public Bug(String id) {
        this.id = id;
        
    }

    public void update(Bug updates) {
        setDescription(updates.getDescription());
        setCreated(updates.getCreated());
    }
}
