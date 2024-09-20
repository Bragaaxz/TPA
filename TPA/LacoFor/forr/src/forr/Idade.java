package forr;
import java.util.Scanner; 
public class Idade {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int id,i,nas,atual,velho,novo;
	velho = -100000;
	novo = 100000;
	//comeco for
		for (i = 0; i <= 10; i++) {
				System.out.println("Digite o ano atual : ");
			atual = ler.nextInt();
				System.out.println("Digite o seu ano de nascimento :");
			nas = ler.nextInt();
			id = atual - nas;
				System.out.println( " Sua idade é :"  +  id);
				System.out.println("====================");
	//inicio if			
	 if (id > velho) {
		velho = id;
	} if (id < novo) {
		novo = id;
	}
	// fim if
		}
		ler.close();
		// fim for
		
		System.out.println("====================");
		System.out.println("Essa é a idade da pessoa mais velha :" + velho);
		System.out.println("Essa é a idade do mais novo :"  + novo);
		
}
}
