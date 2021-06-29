import java.util.Scanner;

public class NegativoPositivoIf {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com um valor: ");
		int valor=leia.nextInt();
		
		if(valor >= 0) {
			System.out.println("Numero positivo");
		}
		else if(valor < 0) {
			System.out.println("Numero negativo");
		}
	}

}
