package estruturasRepeticao;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int media = 0;
		
		int count = 0;
		
		do {
			
			System.out.println("Numero: ");
			numero = scanner.nextInt();
			
			
			if (numero > maior) {
				maior = numero;
			}
			
			soma = soma + numero;
			
			
			media = soma / 5;
			
			count = count + 1;
					
		} while (count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("A soma de todos os números é: " + soma);
		System.out.println("A média de dos números é: " + media);
		
		
		
	}
}
