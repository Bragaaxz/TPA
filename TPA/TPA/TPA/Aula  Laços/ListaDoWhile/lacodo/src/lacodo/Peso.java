package lacodo;
import java.util.*;
public class Peso {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String resultado,continuacao;
	double peso,alt,pesoid,pesu;
	do {
		System.out.println("Digite  seu Gênero 'f' para Feminino e 'm' para Masculinino :");	
	resultado = ler.next();
		System.out.println("Digite seu peso : ");
	peso = ler.nextDouble();
		System.out.println("Digite sua Altura em cm : ");
	alt = ler.nextDouble();	
if (resultado.equalsIgnoreCase("f")) {
	pesoid = 52 + (0.67 * (alt - 152.4));
	pesu = pesoid - peso;
	System.out.println("Esse é seu peso ideal : " + pesoid  + " A diferença dos peso é de : " + pesu + " KG");
} else{
	pesoid = 52 + (0.75 * (alt - 152.4));
	pesu = pesoid - peso;
	System.out.println("Esse é seu peso ideal : " + pesoid + " A diferença dos peso é de : " + pesu + " KG" );
			}
	System.out.println("voce gostaria de refazer este processo? Digite 'S' para sim e 'N' para não");	
	continuacao = ler.next();
	if (continuacao.equalsIgnoreCase("N")) {
		System.out.println("tmj :)");
	}
		} while (continuacao.equalsIgnoreCase("s"));
	ler.close();
	} 
} 

