package inheritance_examples;

public class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("I am working");
    }
}