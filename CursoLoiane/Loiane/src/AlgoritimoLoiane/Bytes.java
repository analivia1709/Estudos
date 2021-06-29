package AlgoritimoLoiane;

import java.util.Scanner;

public class Bytes {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o tamanho do arquivo: ");
		int arquivo=leia.nextInt();
		
		System.out.println("Entre com a velocidade da internet: ");
		int velocidade=leia.nextInt();
		
		double tempo= arquivo / velocidade;
		
		System.out.println("O tempo para dowloand é de: "+ tempo);
	}

}
