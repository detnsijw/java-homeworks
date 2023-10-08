package interfaces_library;

public class BookStore implements Supplier {

    @Override
    public void bringBook(String title) {
        System.out.println("Книжный магазин доставил книгу " + title);
    }
}
