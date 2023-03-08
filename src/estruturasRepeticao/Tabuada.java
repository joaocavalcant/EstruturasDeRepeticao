package estruturasRepeticao;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Qual número deseja multiplicar? ");
		numero = scan.nextInt();
		System.out.println("");
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println("Os resultados da multiplicação do número " + numero +  
					" por " + i + " é igual a " + numero * i);
			System.out.println("");
		}
	}
}
