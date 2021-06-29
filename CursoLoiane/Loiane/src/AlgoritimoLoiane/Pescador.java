package AlgoritimoLoiane;

import java.util.Scanner;

public class Pescador {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do peso peixe:");
		int peso=leia.nextInt();
		
		if(peso>50) {
			
			int peso2,execede;
			peso2= peso-50;
			execede= peso2*4;
			
			System.out.println("A multa a ser paga pelo o peso execeido é de: "+execede+ " o peso execedeu "+peso+"kg");
			
		}
		else if(peso==50) {
			System .out.println("Não execedeu o peso");
		}
		
	}

}
