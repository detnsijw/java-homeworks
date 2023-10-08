package solid.solid_correct.di_correct;

public class BestManager implements IManager {
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("Speak with developer");
        developer.writeCode();
    }
}

