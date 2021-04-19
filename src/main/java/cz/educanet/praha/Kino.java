package cz.educanet.praha;

import java.util.*;

public class Kino {

    public static void main(String[] args) {

        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));

        System.out.println("Free spaces: " + freeSpaces);
    }


    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {

        System.out.print("Pocet lidi: ");
        int p = sc.nextInt();

        for (int i = 0;i < p;i++){
            System.out.print("Zadejte " + (i + 1) + " index: ");
            int g = sc.nextInt();

            while (g < 0 || g >= namesOnSeat.length || namesOnSeat[g] != null){
                System.out.print("Zadal jste spatne cislo nebo sedadlo je obsazeno, zadejte nove cislo: ");
                g = sc.nextInt();
            }

            System.out.print("Zadej jmeno: ");
            String s = sc.next();

            namesOnSeat[g] = s;
        }

        int n = 0;
        for (int i = 0;i < namesOnSeat.length;i++){
            if (namesOnSeat[i] == null){
                n++;
            }
        }

        return n;
    }
}

