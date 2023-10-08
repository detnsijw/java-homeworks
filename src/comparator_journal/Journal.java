package comparator_journal;

import java.util.HashMap;
import java.util.Map;

public class Journal {
    private static Map<String, Integer> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printA();
    }

    private static void addStudents() {
        addStudent(new Student("Math", 4));
        addStudent(new Student("English", 3));
        addStudent(new Student("History", 5));
        addStudent(new Student("Art", 4));
    }

    private static void addStudent(Student student) {
        grades.put(student.getSubject(), student.getGrade());
    }

    private static void printA() {
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println("subject: " + entry.getKey() + ", grade: " + entry.getValue());
        }
    }
}