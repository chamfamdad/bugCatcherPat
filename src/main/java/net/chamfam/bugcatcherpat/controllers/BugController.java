package net.chamfam.bugcatcherpat.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.chamfam.bugcatcherpat.model.Bug;

@RestController
public class BugController {
    @GetMapping("/bug/{id}")
    public Bug getBug(@PathVariable int id) {

        Bug notFound = new Bug();

        notFound.setId(id);
        notFound.setDescription("This method is not implemented yet.");
        notFound.setCreated(LocalDateTime.now());

        return notFound;
    }
}