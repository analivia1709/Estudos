import java.util.Scanner;

public class SwitcCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		int diaSemana = leia.nextInt();

//		if (diaSemana == 1) {
//			System.out.println("Domingo");
//		} else if (diaSemana == 2) {
//			System.out.println("Segunda-Feira");
//		} else if (diaSemana == 3) {
//			System.out.println("Terça-Feira");
//		} else if (diaSemana == 4) {
//			System.out.println("Quarta-Feira");
//		} else if (diaSemana == 5) {
//			System.out.println("Quinta-Feira");
//		} else if (diaSemana == 6) {
//			System.out.println("Sexta-Feira");
//		} else if (diaSemana == 7) {
//			System.out.println("Sabado");
//		}
//		else {
//			System.out.println("Dia da semana invalido");
//		}
//
//		switch(diaSemana){
//			
//			case 1:System.out.println("Domingo");break;
//			case 2:System.out.println("Segunda");break;
//			case 3:System.out.println("Terça");break;
//			case 4:System.out.println("Quarta");break;
//			case 5:System.out.println("Quinta");break;
//			case 6:System.out.println("Sexta");break;
//			case 7:System.out.println("Sabado");break;
//			default: System.out.println("Não é um dia da semana valido");
//		}
//		

		switch(diaSemana){
			
			case 2:
			case 3:
			case 4:
			case 6:System.out.println("dia util");break;
			case 1: 
			case 7:System.out.println("Sabado");break;
			default: System.out.println("Não é um dia da semana valido");
		}
		
		
	}

	

}
