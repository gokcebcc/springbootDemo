package com.example.springboot.demoSpring.controller;


import com.example.springboot.demoSpring.model.Writer;
import com.example.springboot.demoSpring.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WriterController {

    @Autowired
    WriterRepository writerRepository;

    @GetMapping(value ="/writers")
    public List<Writer> getAllWriters()
    {
        return writerRepository.findAll();
    }


    @PostMapping(value ="/writer")
    public Writer createWriter(@RequestBody Writer writer)
    {
        return this.writerRepository.save(writer);
    }


    @GetMapping("/writers/{writerId}")
    public ResponseEntity<Optional<Writer>> getPublisherById(@PathVariable(value ="writerId") Integer writerId)
    {
        Optional<Writer> writer=writerRepository.findById(writerId);
        return ResponseEntity.ok().body(writer);
    }


    @PutMapping("writers/{writerId}")
    public void updateWriter(@PathVariable(value ="writerId") Integer writerId,@RequestBody Writer writer)
    {}


    @DeleteMapping("/writers/{writerId}")
    public void deleteWriter(@PathVariable(value ="writerId") Integer writerId)
    {
        this.writerRepository.deleteById(writerId);
    }

    @PutMapping("/updateWriter")
    public void updateWriter(@RequestBody Writer writer)
    {
        this.writerRepository.save(writer);
    }


}
