package Algoritimo;

import java.util.Scanner;

public class MateriaPrima {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a,num;
		int b=15;
		float por;
		
		System.out.println("\n1)Materia prima  algodão");
		a= leia.nextInt();		
		
		num=a*15;
		por=num/100;
		
		System.out.println(por);
}
}