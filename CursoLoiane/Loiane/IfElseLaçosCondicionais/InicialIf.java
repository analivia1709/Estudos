import java.util.Scanner;

public class InicialIf {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		System.out.println("Entre com uma letra[F ou M]: ");
		String letra=leia.next();
		
		if (letra.equalsIgnoreCase("F" ) ) {
			System.out.println("Sexo Femino");
		}
		else if (letra.equalsIgnoreCase("M")) {
			System.out.println("Sexo masculino");
		}
		else {
			System.out.println("Sexo invalido");
		}
		
	}

}
