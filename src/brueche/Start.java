package brueche;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Bruch brueche[] = new Bruch[3];
        brueche[0] = new Bruch(4 , 3);
        brueche[1] = new Bruch(5 , 3);
        brueche[2] = new Bruch(2 , 2);

        Arrays.sort(brueche);
        for (int i = 0; i <brueche.length ; i++) {
            System.out.println(Arrays.toString(brueche));
        }
    }
}
