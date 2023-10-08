package polymorphism_example;

public class Program {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Cheetah cheetah = new Cheetah();
        Doctor doctor = new Doctor();

        doctor.healCat(lion);
        doctor.healCat(tiger);
        doctor.healCat(cheetah);
    }
}
