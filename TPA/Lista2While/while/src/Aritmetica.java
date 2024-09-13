package whil;
import java.util.Scanner;
	import java.util.Scanner;
	public class Aritmetica {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	    // variaveis
	        int inicio,fim,soma,contador,i;
	        double media;
	    // informacoes dos intervalos
	        System.out.print("Digite o intervalo inicial: ");
	        	inicio = ler.nextInt();
	        System.out.print("Digite o intervalo final: ");
	        	fim = ler.nextInt();
	    // Verificacao se e valido
	        if (inicio > fim) {
	            System.out.println("O intervalo inicial deve ser menor ou igual ao intervalo final.");
	        } else {
	             soma = 0;
	             contador = 0;
	             i = inicio;
	    // contador
	            while (i <= fim) {
	                soma += i;
	                contador++;
	                i++;
	            }
	            // Calculo da média
	            media =  soma / contador;
	            // resultado
	            System.out.printf("A média aritmética dos números entre %d e %d é: %.2f%n", inicio, fim, media);
	        }
	        // Fecha o scanner
	        ler.close();
	    }
	}
