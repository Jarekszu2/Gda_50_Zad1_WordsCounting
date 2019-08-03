package packZad1;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ScannerWork scannerWork = new ScannerWork();
        Utilities utilities = new Utilities();

        System.out.println("Program wczytuje tekst i oblicza ilość powtórzeń każdego słowa.");

        boolean flag = false;
        String text = "";
        do {
            char znak = scannerWork.getCharChooseAction();
            switch (znak) {
                case 'a':
                    text = scannerWork.getText();
                    break;
                case 'b':
                    System.out.println(text);
                    utilities.printResult(text);
                    break;
                case 'k':
                    flag = true;
                    break;
            }
        } while (!flag);
    }
}
