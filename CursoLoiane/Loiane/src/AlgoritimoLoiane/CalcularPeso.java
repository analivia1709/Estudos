package AlgoritimoLoiane;

import java.util.Scanner;

public class CalcularPeso {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura=leia.nextDouble();
		
		double peso;
		
		peso=(72.7*altura)-58;
		
		System.out.println("O seu peso ideal é: "+ peso);
		
		
	}

}
