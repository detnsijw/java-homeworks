package library_task;

public class Book {
    String authorField;
    String title;
    int id;

    public Book(String authorField, String title, int id) {
        this.authorField = authorField;
        this.title = title;
        this.id = id;
    }

    public String getAuthorField() {
        return authorField;
    }

    public void setAuthorField(String authorField) {
        this.authorField = authorField;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showDetails(String authorField) {
        System.out.println(authorField);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorField='" + authorField + '\'' +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
