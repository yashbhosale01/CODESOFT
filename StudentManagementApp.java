import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. List All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Grade: ");
                    char grade = scanner.next().charAt(0);

                    Student student = new Student(rollNumber, name, grade);
                    students.add(student);
                    break;
                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int rollNumberToRemove = scanner.nextInt();
                    students.removeIf(studentToRemove -> studentToRemove.getRollNumber() == rollNumberToRemove);
                    break;
                case 3:
                    System.out.println("All Students:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
class Student {
    private int rollNumber;
    private String name;
    private char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Grade: " + grade;
    }
}
