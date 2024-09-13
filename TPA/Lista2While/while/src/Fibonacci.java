package whil;
import java.util.Scanner;
public class asdadasd {
	public static void main(String[] args) {
		int enesimo, valorA, valorB, fibo, i;
	 Scanner ler = new Scanner(System.in);
     System.out.print("Digite um número: ");
     enesimo = ler.nextInt();
     valorA = 0;
     valorB = 1;
     fibo = 0;
     i = 2;
     // saber se é o 
     if (enesimo == 1) {
         fibo = valorA;
     } else if (enesimo == 2) {
         fibo = valorB; 
     } else {
         while (i < enesimo) {
             fibo = valorA + valorB;
             valorA = valorB;
             valorB = fibo;
             i++;
             System.out.println(fibo);
         }
         fibo = valorA + valorB;
     }
     System.out.println("O enésimo termo é: " + fibo);
     ler.close();
	}
}
