package estruturasRepeticao;

import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota;
		
		/*while (true) {
			
			System.out.println("Qual a nota que deseja colocar? ");
			
			nota = scanner.nextInt();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Número Invalido, informe um novo valor!");
			} else {
				if (nota > 0 || nota <= 10) {
					System.out.println("Obrigado a nota digitada foi: " + nota);
					break;
				}
			}		
		}*/
		
		//outra forma de resolver 
		
		System.out.println("Qual a nota que deseja colocar? ");
		
		nota = scanner.nextInt();
		
		while (nota < 0 || nota > 10) {
			
			System.out.println("Nota invalida");
			
			System.out.println("Qual a nota que deseja colocar? ");
			
			nota = scanner.nextInt();
		}
		
	}
}
