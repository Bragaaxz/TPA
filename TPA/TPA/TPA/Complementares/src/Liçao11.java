import java.util.Scanner;
public class Liçao11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        
        // Lendo os Números
        System.out.println("Digite 10 Números inteiros:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("===================");

        // Lendo o elemento a ser buscado
        System.out.print("Digite o Número a ser buscado: ");
        	int X = scanner.nextInt();
        System.out.println("===================");

        // Verificando os Números armazenados no Vetor
        	for (int i = 0; i < 10; i++) {
        		if (A[i] == X) {
        System.out.println("O Número " + X + " foi encontrado no vetor.");
                return; // saida do metodo
            }
        }
        System.out.println("O Número " + X + " não foi encontrado no vetor.");
    scanner.close();
    }
}

