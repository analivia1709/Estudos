package Fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
 //(f  -  32) * 5.0/9.0 =c
		
		
		int F=86;
		double C;
		final double x=32, y=5.0/9.0;
		
		C = ( F - x ) * y ;
	   
		System.out.println("o valor em C° : " + C);
		
		
		
	}

}
