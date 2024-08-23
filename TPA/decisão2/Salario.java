package decisão2;
import java.util.Scanner;
public class Salario {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		double sal, inss;
		System.out.println("Digite seu salario");
		sal=ler.nextDouble();
		if (sal>=2500) {
			inss=sal*11/100;
			System.out.println("Você pagará para o INSS : " + inss);
		}	else  {
			inss=sal*9/100;
			System.out.println("Você pagará para o INSS : " + inss);
		}
		ler.close();
	}
	}


