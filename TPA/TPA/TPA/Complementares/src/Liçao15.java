import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Liçao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	int[] A = new int[10];
        	Integer[] B = new Integer[10];  
        	Integer[] C = new Integer[10];  
     // "intereger" serve para permitir a ordenaçao
        	
     // Leitura do vetor
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Colocando os numeros do A para o B e C
        for (int i = 0; i < 10; i++) {
            B[i] = A[i];
            C[i] = A[i];
        }

        // colocando o vetor B em ordem Crescente com Arrays.sort
        Arrays.sort(B);

        // colocando o vetor C em ordem decrescente com collections
        Arrays.sort(C, Collections.reverseOrder());

        // Apresentando
        System.out.println("\nVetor A (original): " + Arrays.toString(A));
        System.out.println("Vetor B (ordem crescente): " + Arrays.toString(B));
        System.out.println("Vetor C (ordem decrescente): " + Arrays.toString(C));

        scanner.close();
    }
}
