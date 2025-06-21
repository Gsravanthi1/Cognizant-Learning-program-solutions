// ===================== Exercise 10: MVC Pattern =====================

// Model class
class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getId() { return id; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setGrade(String grade) { this.grade = grade; }
}

// View class
class StudentView {
    public void displayStudentDetails(Student student) {
        System.out.println("Student Info:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Grade: " + student.getGrade());
    }
}

// Controller class
class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void updateStudentName(String name) {
        student.setName(name);
    }

    public void updateStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void showStudent() {
        view.displayStudentDetails(student);
    }
}

// Test class for MVC Pattern
class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Ravi", "101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.showStudent();
        controller.updateStudentGrade("A+");
        controller.showStudent();
    }
}
