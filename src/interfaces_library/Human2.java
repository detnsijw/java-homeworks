package interfaces_library;

public class Human2 extends User implements Reader, Supplier {

    public Human2(String name, int age) {
        super(name, age);
    }


    @Override
    public void takeBook(String title) {
        System.out.println("Человек получил книгу " + title);
    }

    @Override
    public void retakeBook(String title) {
        System.out.println("Читатель вернул книгу " + title);
    }

    @Override
    public void bringBook(String title) {

    }
}
