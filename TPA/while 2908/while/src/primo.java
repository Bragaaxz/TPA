import java.util.Scanner;
public class primo {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	  double number,i,resultado;
	   System.out.println("Digite um número Inteiro : ");
	   number = ler.nextInt();
	 i = number;
	   	while (i  != 0) {
	   resultado = number / i;
		   if (resultado != 0)
		   {
			    System.out.println("Não é primo");   
		   } else {
			    System.out.println(" É primo");		   }
	   }
	   
	   i -= 1;
}
}
