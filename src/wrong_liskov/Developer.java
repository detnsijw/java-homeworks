package wrong_liskov;

public class Developer {
    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public void writeCode() {
        System.out.println("Default lang syntax");
    }
}