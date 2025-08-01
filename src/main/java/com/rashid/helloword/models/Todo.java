package com.rashid.helloword.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data //Both getter and setter and constructor
//@Getter
//@Setter
//@AllArgsConstructor // constructor
//@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue
    long id;
//    @NotNull
//    @NotBlank
//    String title;
//    @NotNull
//    @NotBlank
//    String description;
    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    Boolean isCompleted;
}
