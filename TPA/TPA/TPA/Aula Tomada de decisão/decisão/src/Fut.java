import java.util.Scanner;
public class Fut {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double idade;
	System.out.println("Digite sua idade :");
	idade = ler.nextDouble();
	if (idade <10) {
		System.out.println("Criança");
	} else if (idade <18)
	{
		System.out.println("Adolescente");
	}else if (idade <60) {
		System.out.println("Adulto");
	}else {
		System.out.println("Idoso");
	}
	ler.close ();
}
}
