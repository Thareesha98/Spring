//package com.spiral.LMS.models;
//
//package com.example.lms.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//
//public class Entrollment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // Student
//    @ManyToOne
//    @JoinColumn(name = "student_id")
//    private User student;
//
//    // Course
//    @ManyToOne
//    @JoinColumn(name = "course_id")
//    private Course course;
//}
