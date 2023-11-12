package library_task;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Student s1 = new Student("Alexey", "Ivanov", 1);
        Student s2 = new Student("Sergey", "Vladimirovich", 2);

        s1.takeBook("Harry Potter", "J.K.Rowling");
        s2.takeBook("Witcher", "Andrzej Sapkowski");

        s1.takeBook("Война и Мир", "Lev Tolstoy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы вернуть книгу?(да/нет)");
        String s = scanner.nextLine();
        if(s.equals("да")) {
            s1.retakeBook("Harry Potter", "J.K.Rowling");
        }
    }
}