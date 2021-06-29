package Algoritimo;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		int num;
		
		System.out.println("Por favor, digite um numero:");
		num =leia.nextInt();

		if(num%2 ==0) {
			System.out.println(num + " esse numero é par");
		}
		
		else{
			System.out.println(num +"esse numero é impar");
		}
	}

}
