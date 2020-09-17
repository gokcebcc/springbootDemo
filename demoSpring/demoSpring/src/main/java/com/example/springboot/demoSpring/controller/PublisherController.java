package com.example.springboot.demoSpring.controller;


import com.example.springboot.demoSpring.model.Publisher;
import com.example.springboot.demoSpring.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PublisherController {

    @Autowired
    PublisherRepository publisherRepository;

    @GetMapping(value ="/listAllPublishers")
    public List<Publisher> getAllPublishers()
    {
        return publisherRepository.findAll();
    }


    @PostMapping(value ="/createPublisher")
    public Publisher createPublisher(@RequestBody Publisher publisher)
    {
        return this.publisherRepository.save(publisher);
    }


    @GetMapping("/publishers/{publisherId}")
    public ResponseEntity<Optional<Publisher>> getPublisherById(@PathVariable(value ="publisherId") Integer publisherId)
    {
        Optional<Publisher> publisher=publisherRepository.findById(publisherId);
        return ResponseEntity.ok().body(publisher);
    }


    @PutMapping("publishers/{publisherId}")
    public void updatePublisher(@PathVariable(value ="publisherId") Integer publisherId,@RequestBody Publisher publisher)
    {}


    @DeleteMapping("/publishers/{publisherId}")
    public void deletePublisher(@PathVariable(value ="publisherId") Integer publisherId)
    {
        this.publisherRepository.deleteById(publisherId);
    }

    @PutMapping("/updatePublisher")
    public void updatePublisher(@RequestBody Publisher publisher)
    {
        this.publisherRepository.save(publisher);
    }



}
