package packZad1;

import java.util.*;

public class Utilities {
    public void printResult(String text) {
        System.out.println();
        String[] tab = text.split(" ");
        Set<String> set = new HashSet<String>(Arrays.asList(tab));
//        List<String> list = new ArrayList<String>(Arrays.asList(tab));
        List<String> listFromSet = new ArrayList<String>(set);
        int[] tabInt = new int[listFromSet.size()];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < listFromSet.size(); j++) {
                if (tab[i].equals(listFromSet.get(j))) {
                    tabInt[j]++;
                }
            }
        }
        for (int i = 0; i < listFromSet.size(); i++) {
            System.out.println(listFromSet.get(i) + " -> " + tabInt[i]);
        }
        System.out.println();
    }
}
