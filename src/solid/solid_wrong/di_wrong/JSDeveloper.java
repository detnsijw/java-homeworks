package solid.solid_wrong.di_wrong;

import isp.IDeveloper;

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