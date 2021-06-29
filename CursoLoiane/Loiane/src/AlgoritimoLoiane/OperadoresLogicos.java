package AlgoritimoLoiane;

public class OperadoresLogicos {

	public static void main(String[] args) {

		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2 );
		System.out.println("O valor1 é 1 And valor2 é 2 - resultado: " + resultado1);
		
		boolean resultado2 = (valor1 == 1 ) || (valor2 == 2);
		System.out.println("O valor1 e´1 OR valor2 é 2 - resultado: " + resultado2);
		
		boolean verdadeiro =true;
		boolean falso= false;
		
		System.out.println(verdadeiro && falso); // so da verdadeiro se os dois forem verdade 
		System.out.println(verdadeiro || falso); // o "ou" pra ele dar falso os dois tem que ser falsos
		System.out.println(verdadeiro ^ falso); // se os dois forem iguais sa falso
		System.out.println(!verdadeiro && falso);//

			
	}

}
