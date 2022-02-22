package com.day2Homework.example.day2Homework.controllers;

import com.day2Homework.example.day2Homework.models.Folder;
import com.day2Homework.example.day2Homework.repository.FolderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRespository folderRespository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRespository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id) {
        return new ResponseEntity<>(folderRespository.findById(id),HttpStatus.OK);
    }

    @PostMapping(value =" /folders")
    public ResponseEntity<Folder> createFolder(@RequestBody Folder folder){
        folderRespository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
