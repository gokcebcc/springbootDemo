package com.example.springboot.demoSpring.repository;

import com.example.springboot.demoSpring.model.Book;
import com.example.springboot.demoSpring.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
