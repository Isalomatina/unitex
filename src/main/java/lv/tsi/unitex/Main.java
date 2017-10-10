package lv.tsi.unitex;

/**
 * Created by JavaCourses on 10.10.2017..
 */
import asg.cliche.ShellFactory;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ShellFactory.createConsoleShell("calc","Calculator", new Calculator()).commandLoop();
    }
}
