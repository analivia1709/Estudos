package AlgoritimoLoiane;

import java.util.Scanner;

public class LeituraDadoTeclado {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
//		System.out.println("Digite seu nome completo: ");
//		String nomeCompleto=leia.nextLine();
//		System.out.println("Seu nome completo �: " +nomeCompleto);
//		
//		System.out.println("Digite seu primeiro nome: ");
//		String primeiroNome=leia.next();
//		System.out.println("Seu primeiro nome � : "+ primeiroNome);
//		
//		System.out.println("Digite a sua idade: ");
//		int idade=leia.nextInt();
//		System.out.println("Sua idade �: "+idade);
//		
//		System.out.println("Digite a sua altura: ");
//		double altura=leia.nextDouble();
//		System.out.println("Sua altura �: "+altura);
//		
		System.out.println("Digite seu priemiro nome, idade, quantidade de filhos, altura, se tem animal de estima��o: ");
		String primeiroNome=leia.next();
		int idade=leia.nextInt();
		byte qdtFilhos=leia.nextByte();
		double altura=leia.nextDouble();
		boolean qtdPets=leia.nextBoolean();
		
		System.out.println("Voc� inseriu os seguintes valores: ");
		System.out.println("Nome: " +primeiroNome);
		System.out.println("Idade: "+idade);
		System.out.println("Quantidade de filhos: "+qdtFilhos);
		System.out.println("Altura: "+altura);
		System.out.println("Tem animal de estima��o? "+qtdPets);

		
		
		
		
		
	}

}
