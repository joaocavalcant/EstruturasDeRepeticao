package arrays;

public class OrdemInversa {
	public static void main(String[] args) {
		
		int[] vetor = {-6, -5, 15, 50, 8, 4};
		
		//System.out.println(vetor.length);
		
		
		int count = 0;
		
		while (count < vetor.length) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor: ");
		for (int i = vetor.length -1; i >= 0; i--) {
			System.out.print( + vetor[i] + " ");
		}
		
		
		
	}
}
