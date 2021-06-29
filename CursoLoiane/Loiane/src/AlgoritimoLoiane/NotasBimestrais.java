package AlgoritimoLoiane;

import java.util.Scanner;

public class NotasBimestrais {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a Primeira nota: ");
		double nota1=leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2=leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3=leia.nextDouble();
		
		System.out.println("Digite a 4 nota: ");
		double nota4=leia.nextDouble();
		
		double media, soma;
		
		soma = nota1 + nota2 + nota3 + nota4 ;
		media= soma/4;
		
		System.out.println("A media bimestral do aluno foi de: "+ media );
		
	
	}

}
