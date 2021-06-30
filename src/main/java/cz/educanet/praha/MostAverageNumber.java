package com.company;

public class MostAverageNumber {

    public static void main(String[] args) {

        double z[] ={1,5,7,6};

		double u = 0;
    	for (int i = 0; i < z.length;i++){
    		u = u + z[i];
    	}
    	double avg = u/ z.length;

			double mindelta = 0;
			double result = 0;
    	for(int i = 0;i<z.length;i++){
    		double delta = Math.abs(avg-z[i]);
    		System.out.println(delta);

    		if (delta>mindelta){
    			result = z[i];
    			mindelta = delta;
			}
		}
    	System.out.println(result);
