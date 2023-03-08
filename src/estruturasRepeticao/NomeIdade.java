package estruturasRepeticao;

import java.util.Scanner;

public class NomeIdade {
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			
			
			System.out.println("Qual o seu nome? ");
			
			nome = scanner.next();
			
			if (nome.equals("0")) {
				System.out.println("Programa Encerrado");
				break;
			}
			
			System.out.println("Qual a sua idade? ");
			
			idade = scanner.nextInt();			
			
		}
	}
}
