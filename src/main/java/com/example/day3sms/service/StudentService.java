package com.example.day3sms.service;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    //    create
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }

//    Display Student
    public List<StudentModel> getStudents(){
        return repository.findAll();
    }
//    Update
    public StudentModel updateStudent(String id, StudentModel student){
        StudentModel existingStudent = repository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found"));
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        return repository.save(existingStudent);

    }

//    Delete
    public void deleteStudent(String id){
        if (!repository.existsById(id)) {
            throw new RuntimeException("Student Not Found");
        }
        repository.deleteById(id);
    }
}
