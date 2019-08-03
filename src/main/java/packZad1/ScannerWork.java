package packZad1;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public char getCharChooseAction() {
        System.out.println("Wybierz:\n a) wczytanie tekstu\n b) obliczenie ilości powtórzeń\n k) koniec");
        System.out.println();

        char znak = 'a';
        boolean flag = false;
        do {
            System.out.println("Wybierz: a/b/k ?");
            znak = scanner.next().charAt(0);
            if (znak == 'a' || znak == 'b' || znak == 'k') {
                flag = true;
            }
        } while (!flag);
        return znak;
    }

    public String getText() {
        System.out.println();
        System.out.println("Wprowadzaj linie tekstu. Linia 'koniec' kończy tekst.");
        System.out.println();
        String linia = "";
        String text = "";
        do {
            linia = scanner.nextLine();
            text += linia + " ";
        } while (!linia.equals("koniec"));

        String result = text.replace("koniec", "").trim();
        System.out.println();
        return result;
    }
}
