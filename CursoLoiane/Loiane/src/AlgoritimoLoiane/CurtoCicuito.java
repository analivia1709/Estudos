package AlgoritimoLoiane;

public class CurtoCicuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso= false;
		
		boolean resultado1 = falso & verdadeiro; //resultado é falso 
		boolean resultado2 = falso && verdadeiro;
		boolean resultado3 = verdadeiro && verdadeiro;
		boolean resultado4 = falso && falso ;  
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);


	}

}
