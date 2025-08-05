# Student Record Management System (CLI - Java MVC)

### 🎯 Task Objective:
Create a Command Line Interface (CLI) based application to manage student records with full CRUD (Create, Read, Update, Delete) operations using Java and OOP principles.

---

### 🛠️ Tools & Technologies:
- Java (21)
-IntelliJ Community Edition
- Git & GitHub

---

### 📚 Concepts Practiced:
- Java OOP: Classes, Interfaces, Encapsulation
- MVC Design Pattern
- ArrayList for data management
- Control flow, loops, and user input handling with Scanner

---

### ⚙️ Features:
- Add a new student record
- View all student records
- Update a student record by ID
- Delete a student record by ID
- Clean and modular structure following MVC
- Interface-based service layer

---

### 📦 Folder Structure

StudentRecordManagement/
├── src/
│ ├── controller/
│ │ └── StudentController.java
│ ├── model/
│ │ └── Student.java
│ ├── service/
│ │ ├── StudentService.java # interface
│ │ └── StudentServiceImpl.java # implementation
│ ├── view/
│ │ └── StudentView.java
│ └── Main.java # Entry point
├── README.md
└── .gitignore


---

### 🧩 MVC Component Roles

| Layer         | Responsibility                                          |
|---------------|---------------------------------------------------------|
| **Model**     | `Student.java` - Defines the data structure (ID, Name, Marks) |
| **View**      | `StudentView.java` - Handles user input/output via console |
| **Controller**| `StudentController.java` - Acts as the brain; calls service and view |
| **Service**   | `StudentService.java` (interface) and `StudentServiceImpl.java` (logic for add/update/delete/search)

---

### 📂 Sample Class Overview

#### ✅ Student.java
```java
public class Student {
    private int id;
    private String name;
    private double marks;
    // Constructor, Getters, Setters
}

--- Student Record Management ---
1. Add Student
2. View All Students
3. Update Student by ID
4. Delete Student by ID
5. Exit
Enter your choice:

