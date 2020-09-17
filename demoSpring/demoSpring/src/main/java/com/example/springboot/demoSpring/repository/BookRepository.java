package com.example.springboot.demoSpring.repository;


import com.example.springboot.demoSpring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface BookRepository extends JpaRepository<Book,Integer> {
    }

