package Algoritimo;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		double nota1 , nota2, media;

		System.out.println("Digite a primeira nota: ");
		nota1=leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2=leia.nextDouble();
		
		media=nota1/nota2;
		
		System.out.println("A media entre "+nota1+ " e "+ nota2+ " é igual a "+media);
		
	}

}
