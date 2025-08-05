package Controller;

import model.Student;
import service.StudentService;
import view.StudentView;

public class StudentController {
    static StudentService studentService;
    static StudentView studentView;

    public StudentController(StudentService studentService, StudentView studentView) {
        StudentController.studentService = studentService;
        StudentController.studentView = studentView;
    }

    public static void run(){
        while(true){
            studentView.getMessage("Welcome to the student management system");
            int choice=studentView.getOptions();
            if(choice==6){
                studentView.getMessage("Thanks for the using this app");
                break;
            }
            switch(choice){
                case 1:
                    Student student=studentView.getNewStudent();
                    studentView.getMessage(studentService.addStudent(student));
                    break;
                case 3:
                    int id=studentView.getStudentById();
                    studentView.displayStud(studentService.getStudentById(id));
                    break;
                case 2:
                    Student student1=studentView.getNewStudent();
                    studentView.getMessage(studentService.updateStudent(student1));
                    break;
                case 4:
                    int no=studentView.getStudentById();
                    studentView.getMessage(studentService.deleteStudentById(no));
                    break;
                case 5:
                    studentView.Display(studentService.getAllStudents());
                    break;
            }
        }
    }
}
