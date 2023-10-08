package interfaces_library;

public interface Administrator {
    void overDueNotification(Reader reader);
    void giveBook(Reader reader, String title);
    void findBook(String title);
}

