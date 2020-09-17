package com.example.springboot.demoSpring.model;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="writer",catalog="testdb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="All details about the books")
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer writerId;
    private String writerName;
    private String writerSurname;

    public Writer(String writerName,String writerSurname){
        this.writerName = writerName;
        this.writerSurname = writerSurname;
    }
}
