package estruturasRepeticao;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		int quantNumeros;
		
		int quantPares= 0;
		
		int quantImpares= 0;
		
		int count = 0;
		
		System.out.println("Quantidade de números ");
		quantNumeros = scan.nextInt();
		
		
		do {
			System.out.println("Número: ");
			
			numero = scan.nextInt();
			
			// Para realizar a diferenciação de números pares e impares realizamos a 
			// operacao de divisao por dois e o resto da divisao tem de ser igual a zero 
			// utilizando o simbolo "%"
			
			if (numero % 2 == 0) {
				quantPares ++;
			} else {
				quantImpares ++;
			}
			
			count++;
			
		} while (count < quantNumeros);
		
		System.out.println("A quantidade de números pares é: " + quantPares);
		System.out.println("A quantidade de números impares é: " + quantImpares);
		
	}
}
