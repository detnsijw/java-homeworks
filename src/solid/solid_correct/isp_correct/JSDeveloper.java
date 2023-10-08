package solid.solid_correct.isp_correct;

public class JSDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Use JS syntax");
    }

    @Override
    public void refactoring() {
        System.out.println("Refactoring");
    }
}

