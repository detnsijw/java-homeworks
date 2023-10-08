package wrong_liskov;

public class JavaDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }
}