package Algoritimo;

import java.util.Scanner;

public class LerNomeEBoasVindas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		
	System.out.println("Qual o seu nome?");
	String nomeCompleto=leia.nextLine();
	
	System.out.println("Olá " + nomeCompleto + ", prazer te conhecer.");

	}

}
