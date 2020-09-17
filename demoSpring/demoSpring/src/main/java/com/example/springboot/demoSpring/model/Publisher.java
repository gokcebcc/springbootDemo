package com.example.springboot.demoSpring.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="publisher",catalog="testdb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="All details about the books")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer publisherId;
    private String publisherName;
    private String publisherAddress;

    public Publisher(String publisherName,String publisherAddress){
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }

}
