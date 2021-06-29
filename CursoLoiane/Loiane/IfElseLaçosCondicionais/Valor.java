import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor do produto: ");
		double valor=leia.nextDouble();
		
		if(valor <=10) {
			System.out.println("Produto com o preço bom,pode comprar");
		}
		else if(valor >10 && valor <15){
			System.out.println("Peça um desconto");
		}
		else if (valor >15 && valor <17) {
			System.out.println("POr favor,pesquise mais");
		}
		else {
			System.out.println("Esta muito caro");
		}
	}

}
