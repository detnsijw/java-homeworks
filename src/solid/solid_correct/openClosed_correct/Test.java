package solid.solid_correct.openClosed_correct;

import openClosed.Developer;
import openClosed.JSDeveloper;
import openClosed.JavaDeveloper;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        openClosed.Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        openClosed.Developer dev2 = new JSDeveloper();
        dev1.setLangName("JS");

        List<openClosed.Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        for(Developer dev : devList) {
            dev.writeCode();
        }
    }
}