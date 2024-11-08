import java.util.Scanner;

public class Liçao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        	System.out.println("Digite 10 números inteiros:");
        // Leitura dos 10 Numeros
        	for (int i = 0; i < 10; i++) {
        		vetor[i] = scanner.nextInt();
        	}
        	System.out.println("====================");

        // Verificaçao para ver se é palindromo
        for (int i = 0; i < 5; i++) { // leitura até o meio do vetor
            if (vetor[i] != vetor[9 - i]) { // Comparando
                System.out.println("O vetor não é um palíndromo.");
                return; 
            }
        }
        	

        System.out.println("O vetor é um palíndromo.");
        scanner.close();
    }
}

