import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro pre�o: ");
		double pre1=leia.nextDouble();
		
		System.out.println("Entre com o segundo pre�o: ");
		double pre2=leia.nextDouble();
		
		System.out.println("Entre com o terceiro pre�o: ");
		double pre3=leia.nextDouble();
		
		if(pre1 < pre2 && pre1 <  pre3) {
			System.out.println("Voce deveria comprar o produto 1 pois o pre�o � menor, no valor de R$"+ pre1);
		}
		else if(pre2 < pre1 && pre2 < pre3) {
			System.out.println("Voce deveria comprar o produto 2 pois o pre�o � menor, no valor de R$"+ pre2);
		}
		else if (pre3 < pre1 && pre3 < pre2) {
			System.out.println("Voce deveria o produto 3 pois o pre�o � menor,no valor de R$"+pre3);
		}
	}

}
