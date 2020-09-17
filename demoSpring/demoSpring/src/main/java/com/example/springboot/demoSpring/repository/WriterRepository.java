package com.example.springboot.demoSpring.repository;

import com.example.springboot.demoSpring.model.Book;
import com.example.springboot.demoSpring.model.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterRepository extends JpaRepository<Writer,Integer> {
}
