import java.util.Locale;

public class Main {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		System.out.println("Valor da soma = " + Utilidades.Soma(2, 3));		
		System.out.println("Valor = " + Utilidades.VALOR);
		
		//Utilidades.VALOR = 20;
		
		System.out.println("Novo valor = " + Utilidades.VALOR);
		
		System.out.printf("Valor de PI = %.5f\n" , Math.PI);
		System.out.printf("Valor de E = %.5f\n" , Math.E);
		System.out.printf("2^5 = %.1f\n" , Math.pow(2, 5));
		
		//Utilidades u = new Utilidades();
		
		/* System.out.println(u.VALOR);
		
		u.VALOR = 30;
		
		System.out.println(u.VALOR); */
	}

}
