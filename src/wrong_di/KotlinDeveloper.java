package wrong_di;

public class KotlinDeveloper implements IDeveloper, ITester {
    @Override
    public void writeCode() {
        System.out.println("Use Kotlin syntax");
    }

    @Override
    public void refactoring() {
        System.out.println("Refactoring");
    }

    @Override
    public void stressTest() {

    }

    @Override
    public void funcTest() {

    }
}