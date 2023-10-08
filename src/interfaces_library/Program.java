package interfaces_library;

public class Program {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        Human1 h1 = new Human1("Василий", 24);
        Human2 h2 = new Human2("Амир", 39);

        h1.giveBook(h2, "Harry Potter");
        h1.makeOrder("Harry Potter", h2);

        newBooksInStore(h1, store, "Warcraft 3");
        human2WantBook(h1, h2, "Warcraft 3");
        human2DoNotReturnBook(h1, h2);
        human2ReturnBook(h2, "Warcraft 3");
    }

    private static void newBooksInStore(Librarian librarian, Supplier supplier, String title) {
        librarian.makeOrder(title, supplier);
    }

    private static void human2WantBook(Administrator administrator, Reader reader, String title) {
        administrator.findBook(title);
        administrator.giveBook(reader, title);
    }

    private static void human2DoNotReturnBook(Administrator administrator, Reader reader) {
        administrator.overDueNotification(reader);
    }

    private static void human2ReturnBook(Reader reader, String title) {
        reader.retakeBook(title);
    }
}

