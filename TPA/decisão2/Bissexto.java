package decisão2;
import java.util.Scanner;
public class Bissexto {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
int nas,resto;
System.out.println("Digite o ano de nascimento");
	nas = ler.nextInt();
	resto = (nas % 4);
	if (resto == 0) {
		System.out.println("É bissexto");
	}
	else {
		System.out.println("Não é bissexto");
	}
	ler.close();
   }
}
