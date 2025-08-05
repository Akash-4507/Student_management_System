package view;

import model.Student;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentView {
   public static Scanner sc = new Scanner(System.in);
    public static Student getNewStudent() {
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student grade:");
        String grade = sc.nextLine();
        System.out.println("Enter student course: ");
        String course = sc.nextLine();
        System.out.println("Enter student gender(male/female): ");
        String gender = sc.nextLine();
        System.out.println("Enter student address: ");
        String address = sc.nextLine();
        return new Student(id,name,marks,grade,course,gender,address);
    }
    public static int getStudentByIdView(){
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        return  id;
    }

    public void getMessage(String s) {
        System.out.println(s);
    }

    public int getOptions() {
        System.out.println("Enter your option: ");
        System.out.println("1. Add Student");
        System.out.println("2. update Student");
        System.out.println("3. get Student By Id");
        System.out.println("4. Delete Student");
        System.out.println("5.Get all Students");
        System.out.println("6. Exit");
        return sc.nextInt();
    }

    public int getStudentById() {
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        return  id;
    }

    public void Display(List<Student> allStudents) {
        if(allStudents.size()==0) {
            System.out.println("There is no student");
            return;
        }
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }

    public void displayStud(Student studentById) {
        System.out.println(studentById);
    }
}
