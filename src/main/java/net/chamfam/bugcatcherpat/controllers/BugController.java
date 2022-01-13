package net.chamfam.bugcatcherpat.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.chamfam.bugcatcherpat.model.Bug;

@RestController
public class BugController {

    @GetMapping("/bug/{id}")
    public Bug getBug(@PathVariable String id) {

        Bug notFound = new Bug(id);

        notFound.setDescription("The GET method is not implemented yet.");
        notFound.setCreated(LocalDateTime.now());

        return notFound;
    }

    @PostMapping("/bug")
    public Bug createBug(@RequestBody Bug newBug) {

        newBug.setId(UUID.randomUUID().toString());
        newBug.setCreated(LocalDateTime.now());

        return newBug;
    }

    @PutMapping("/bug/{id}")
    public Bug updateBug(@RequestBody Bug newValues, @PathVariable String id) {
        Bug updateBug = new Bug(id);

        updateBug.update(newValues);
        updateBug.setDescription("The PUT method has not been implemented yet. " + updateBug.getDescription());
        return updateBug;
    }

    @DeleteMapping("/bug/{id}") 
    public Bug deleteBug(@PathVariable String id) {
        Bug deletedBug = new Bug(id);

        deletedBug.setId(id);
        deletedBug.setDescription("The DELETE method has not been implemented yet.");

        return deletedBug;
    }
}