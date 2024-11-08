import java.util.Scanner;
public class Liçao14 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        	Scanner ler = new Scanner(System.in);

        //lendo os numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor de A[" + i + "]: ");
            A[i] = ler.nextInt();  
            System.out.print("Digite o valor de B[" + i + "]: ");
            B[i] = ler.nextInt();  

            // Comparando vetores
            C[i] = (A[i] > B[i]) ? 1 : (A[i] == B[i]) ? 0 : -1;
        }

        // Apresentando
        System.out.println("\nVetor A: ");
        for (int num : A) System.out.print(num + " ");
        
        System.out.println("\nVetor B: ");
        for (int num : B) System.out.print(num + " ");
        
        System.out.println("\nVetor C: ");
        for (int num : C) System.out.print(num + " ");
        // esse jeito de apresentar Aprendemos pesquisando sobre Vetores
        
        ler.close();  
    }
}
