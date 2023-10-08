package openClosed;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev1.setLangName("JS");

        List<openClosed.Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        for(openClosed.Developer dev : devList) {
            dev.writeCode();
        }
    }
}