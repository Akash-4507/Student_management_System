package service;

import model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    String deleteStudentById(int id);
    String updateStudent(Student student);
    String addStudent(Student student);
}
