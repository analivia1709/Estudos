import java.util.Scanner;

public class Horario {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o horario que voce estuda: \n1)M(Matutino) \n2)V(Vespentino) \n3)N(Noturno) ");
		String horario=leia.next();
	
		if(horario.equalsIgnoreCase("m")) {
			System.out.println("Bom dia ");
		}
		else if(horario.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde");
		}
		else if(horario.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		}
		else {
			System.out.println("Valor invalido");
		}
	}

}
