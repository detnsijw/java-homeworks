package liskov;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        liskov.Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        liskov.Developer dev2 = new JSDeveloper();
        dev1.setLangName("JS");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        showReaction(devList);
    }

    public static void showReaction(List<Developer> devList) {
        for(Developer developer : devList) {
            developer.reaction();
        }
    }
}