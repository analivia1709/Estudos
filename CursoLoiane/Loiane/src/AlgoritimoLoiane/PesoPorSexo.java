package AlgoritimoLoiane;

import java.util.Scanner;

public class PesoPorSexo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha o seu sexo: \n1)Femenino \n2)Maculino");
		int sexo=leia.nextInt();
		
		if(sexo==1) {
			System.out.println("Digite sua altura");
			double altura=leia.nextDouble();
			
			double peso;
			
			peso=(62.1*altura) -44.7;
			
			System.out.println("Seu peso ideal é: "+peso);
			
		}
		else if(sexo==2){
			System.out.println("Digite sua altura: ");
			double altura2=leia.nextDouble();
			
			double peso2;
			
			peso2=(72.7*altura2)-58;
			
			System.out.println("Seu peso ideal é: "+peso2);
			
		}
	}

}
