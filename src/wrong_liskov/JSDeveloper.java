package wrong_liskov;

public class JSDeveloper extends Developer {
    @Override
    public void writeCode() {
        System.out.println("Use JS syntax");
    }
}