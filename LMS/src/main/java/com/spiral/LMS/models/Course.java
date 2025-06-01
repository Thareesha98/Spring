//package com.spiral.LMS.models;
//
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Course {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String title;
//    private String description;
//
//    // Each course is taught by one teacher
//    @ManyToOne
//    @JoinColumn(name = "teacher_id")
//    private User teacher;
//
//    // Enrollments
//    @OneToMany(mappedBy = "course")
//    private List<Enrollment> enrollments;
//
//    // Assignments
//    @OneToMany(mappedBy = "course")
//    private List<Assignment> assignments;
//}
