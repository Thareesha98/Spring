package com.spiral.LMS.models;


import java.util.List;

import javax.management.relation.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import lombok.*;
import java.util.Arrays;


@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

  //  @Enumerated(EnumType.STRING)
  //  private Role role;

//    // A teacher can create multiple courses
//    @OneToMany(mappedBy = "teacher")
//    private List<Course> taughtCourses;
//
//    // A student can have many enrollments
//    @OneToMany(mappedBy = "student")
//    private List<Enrollment> enrollments;
//
//    // A student can make many submissions
//    @OneToMany(mappedBy = "student")
//    private List<Submission> submissions;
}
