package di;

public class JavaDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }

    @Override
    public void refactoring() {
        System.out.println("Refactoring");
    }
}