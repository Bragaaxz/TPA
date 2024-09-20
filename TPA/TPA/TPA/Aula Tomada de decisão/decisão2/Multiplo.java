package decisão2;
import java.util.Scanner;
public class Multiplo {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
int n1,resto;	
	System.out.println("Digite um número inteiro");
n1 = ler.nextInt();	
	resto = (n1 % 10);
	if (resto == 0) {
		System.out.println("Este número é multiplo de 10");
	}
	else {
		System.out.println("Este número não é multiplo de 10");
	}
	ler.close();
}
}
