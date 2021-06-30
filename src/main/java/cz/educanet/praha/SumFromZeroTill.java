package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static void main(String[] args) {
       int num = 5;
		int max = 0;
		for (int i = 0;i<num;i++){
			max = max + num-i;
		}

		System.out.println(max);
    }
}
