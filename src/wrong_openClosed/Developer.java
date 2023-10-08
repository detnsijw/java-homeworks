package wrong_openClosed;

public class Developer {
    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public void writeCode() {
        if(langName.equals("Java")) {
            System.out.println("Use Java syntax");
        } else if (langName.equals("JS")) {
            System.out.println("Use JS syntax");
        } else if (langName.equals("Swift")){
            System.out.println("Use Swift syntax");
        } else {
            System.out.println("Use default syntax");
        }
    }
}