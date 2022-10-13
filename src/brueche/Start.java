package brueche;

import java.util.Arrays;
import java.util.Comparator;

public class Start {
    public static void main(String[] args) {
        Bruch brueche[] = new Bruch[3];
        brueche[0] = new Bruch(4 , 3);
        brueche[1] = new Bruch(5 , 3);
        brueche[2] = new Bruch(2 , 2);

        System.out.println(Arrays.asList(brueche));
        Arrays.sort(brueche, new Comparator<Bruch>() {
            @Override
            public int compare(Bruch o1, Bruch o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.asList(brueche));
    }
}
