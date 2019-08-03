package packZad1;

import java.util.Arrays;

public class MainX {
    public static void main(String[] args) {
        System.out.println();

        String string = "aba cac" + "\n" + "buba";
        System.out.println(string);

        String stringToWork = string.replace("\n", " ");

        System.out.println();
        String[] tab = stringToWork.split(" ");
        System.out.println(tab.length);
        System.out.println(tab[0]);

        System.out.println();
        System.out.println(tab[1]);

        System.out.println();
        System.out.println(tab[2]);

        System.out.println();
        for (String i : tab) {
            System.out.println(i);
        }

    }
}
