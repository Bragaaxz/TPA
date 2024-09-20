import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double peso,alt,imc;
		System.out.println("Digite o seu peso corporal : ");
			peso = ler.nextDouble();
		System.out.println("Digite sua altura : ");
			alt = ler.nextDouble();
			imc = peso/(alt*alt);
		if ( imc <18.5) {
			System.out.println("Excesso de magreza : " + imc);
		}else if (imc <25) {
			System.out.println("Peso normal : " + imc);
		}else if (imc <30) {
			System.out.println("Excesso de peso : " + imc);
		}else if (imc <35)	{
			System.out.println("Obesidade (Grau 1) :" + imc);
		}else if (imc <40) {
			System.out.println("Obesidade (Grau 2) :" + imc);
		}else {
			System.out.println("Obesidade (Grau 3) :" + imc);
		}
	ler.close();
	}
	
}
