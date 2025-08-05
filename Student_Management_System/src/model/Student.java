package model;

import java.util.Date;

public class Student {
    private int studentId;
    private String studentName;
    private int marks;
    private String grade;
    private String course;
    private String gender;
    private String address;

    public Student(int studentId, String studentName, int marks, String grade, String course, String gender, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.grade = grade;
        this.course = course;
        this.gender = gender;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                ", course='" + course + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
