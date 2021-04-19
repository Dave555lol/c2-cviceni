package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prumer je " + avg(sc));
    }

    public static double avg(Scanner scnr) {
        System.out.print("Kolik cisel: ");
        int numbers = scnr.nextInt();
        double s = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.print("Zadej " + (i + 1) + ". cislo: ");
            s = s + scnr.nextDouble();
        }
        double result = s / numbers;
        return result;
    }
}