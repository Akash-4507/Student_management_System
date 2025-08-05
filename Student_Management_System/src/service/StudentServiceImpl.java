package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    public static List<Student> students = new ArrayList<Student>();

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        int flag=0;
        for(Student student : students) {
            if (student.getStudentId() == id) {
                flag = 1;
                return student;
            }
        }
        return null;
    }

    @Override
    public String deleteStudentById(int id) {
        for(Student student : students) {
            if (student.getStudentId() == id) {
                students.remove(student);
                return "Student deleted";
            }
        }
        return "Student not found";
    }

    @Override
    public String updateStudent(Student student) {
        for(Student stud : students) {
            if (stud.getStudentId() == student.getStudentId()) {
                stud.setStudentId(student.getStudentId());
                stud.setStudentName(student.getStudentName());
                stud.setCourse(student.getCourse());
                stud.setGender(student.getGender());
                stud.setGrade(student.getGrade());
                stud.setMarks(student.getMarks());
                return "Student updated";
            }
        }
        return "student not found";
    }

    @Override
    public String addStudent(Student student) {
        students.add(student);
        return "Student added";
    }
}
