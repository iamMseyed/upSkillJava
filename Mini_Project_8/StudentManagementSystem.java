import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Record Management System!");

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();

                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter student marks: ");
                    double marks = scanner.nextDouble();

                    Student student = new Student(name, age, marks);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("Student List:");
                        for (Student s : students) {
                            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", Marks: " + s.getMarks());
                        }
                    }
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("Thank you for using the Student Record Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
