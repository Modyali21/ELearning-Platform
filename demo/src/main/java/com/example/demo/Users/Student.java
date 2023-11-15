package com.example.demo.Users;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student",
        uniqueConstraints = @UniqueConstraint(name = "UK_email", columnNames = "email"))
public class Student {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "gender", nullable = false)
        private boolean gender;

        public Student(String name, String email, String password, boolean gender) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.gender = gender;
        }
}
