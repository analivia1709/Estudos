import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		int num=leia.nextInt();
		
		if(num%2 ==0) {
			System.out.println("Esse numero é par");
		}
		else {
			System.out.println("Esse numero é impar");
		}
	}

}
