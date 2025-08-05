import Controller.StudentController;
import service.StudentService;
import service.StudentServiceImpl;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentService studentService=new StudentServiceImpl();
        StudentController studentController = new StudentController(studentService, studentView);
        StudentController.run();
    }
}