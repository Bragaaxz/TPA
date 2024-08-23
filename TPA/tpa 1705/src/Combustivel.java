import java.util.Scanner;
public class Combustivel {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		double dis, capa,medio;
	System.out.println("Digite a distância percorrida :");
		dis = ler.nextDouble();
	System.out.println("Digite a capacidade do tanque em litros :");
		capa = ler.nextDouble();
		medio = dis/capa;
	if ( medio >=10) {
		System.out.println( "Econômico, seu gasto médio foi : " + medio);
	}else {
		System.out.println("Não econômico, seu gasto médio foi : " + medio);
	}	
	ler.close ();
}

}
