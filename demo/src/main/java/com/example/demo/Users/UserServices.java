package com.example.demo.Users;

import com.example.demo.Login.LoginRequest;
import com.example.demo.Registeration.RegistrationRequest;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String registerUser(RegistrationRequest request) {
        try {
            if (request.getRole()==1){
                teacherRepository.save(new Teacher(request.getName(),request.getName(),
                        passwordEncoder.encode(request.getPassword()),request.isGender()));
            }
            else if(request.getRole()==2)
            studentRepository.save(new Student(request.getName(), request.getEmail(),
                    passwordEncoder.encode(request.getPassword()), request.isGender()));
            return "sucess";
        } catch (Exception e) {
            Throwable t = e.getCause();
            if (t instanceof ConstraintViolationException) {
                String constraint = ((ConstraintViolationException) t).getConstraintName();
                switch (constraint) {
                    case "student.UK_email":
                        return "email is already taken";
                }
            }
            return "unknown error";
        }
    }
   public String loginUser(LoginRequest request){
        Optional<Teacher> tmp1=null;
        Optional<Student> tmp2=null;
            if(request.getRole()==1)
                 tmp1 = teacherRepository.findByEmail(request.getEmail());
            else if(request.getRole()==2)
             tmp2 = studentRepository.findByEmail(request.getEmail());

        if(tmp1.isPresent()){
            if(passwordEncoder.matches(request.getPassword(),tmp1.get().getPassword())){
                return "success";
            }
        } else if (tmp2.isPresent()) {
            if(passwordEncoder.matches(request.getPassword(),tmp2.get().getPassword())){
                return "success";
            }
        }
        return "email or password is incorrect";
    }
}
