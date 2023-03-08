package arrays;

import java.util.Iterator;
import java.util.Random;

public class NumerosAleatorios {
public static void main(String[] args) {
	Random randon = new Random();
	
	int[] numerosAleatorios = new int[20];
	
	for (int i = 0; i < numerosAleatorios.length; i++) {
		int numero = randon.nextInt(100);
		numerosAleatorios[i] = numero;
	}
	
	System.out.println("\nAntecessor dos Números Aleatórios: ");
	for (int numero : numerosAleatorios) {
		System.out.print(numero -1 + " ");
	}
	

	System.out.println("\nNúmeros Aleatórios: ");
	for (int numero : numerosAleatorios) {
		System.out.print(numero + " ");
	}

	System.out.println("\nSucessor dos Números Aleatórios: ");
	for (int numero : numerosAleatorios) {
		System.out.print(numero +1 + " ");
	}
	
}
}
