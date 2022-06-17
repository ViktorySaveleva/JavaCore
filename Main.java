/**
 * Java 1. Homework 5
 * @author Viktoriia Oborina
 * @version 17.06.2022
 */

package homework5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AppData appData = new AppData();
        appData.load("hw5.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("hw5-1.txt");
    }
}
