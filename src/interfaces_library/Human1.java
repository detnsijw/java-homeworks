package interfaces_library;

public class Human1 extends User implements Librarian, Administrator {

    public Human1(String name, int age) {
        super(name, age);
    }


    @Override
    public void overDueNotification(Reader reader) {
        System.out.println("Администратор информирует читателя " + reader.getName() + " о задолженности");
    }

    @Override
    public void giveBook(Reader reader, String title) {
        System.out.println("Администратор выдает книгу читателю " + reader.getName());
    }

    @Override
    public void findBook(String title) {
        System.out.println("Администратор ищет книгу " + title);
    }

    @Override
    public void makeOrder(String title, Supplier supplier) {
        System.out.println("Библиотекарь заказывает книгу " + title);
        supplier.bringBook(title);
    }
}

