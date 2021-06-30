package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        
        System.out.print("Pocet krychlí: ");
		int count = sc.nextInt();
		int cube;
		int obsah = 0;
		int objem = 0;

		for (int i = 0;i < count;i++){
			System.out.print("Zadej stranu " + (i+1) + ". krychle: ");
			cube = sc.nextInt();
			obsah = obsah + 6*cube*cube;

			objem = objem + cube*cube*cube;

		}
        System.out.println("Obsah: " + obsah);
		System.out.println();
		System.out.println("Objem: " + objem);
    }
}
