import java.util.*;
public class VetorMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		int a[] = new int [10],b[] = new int [10],i;
		 double media=0;
	for (i=0; i<10; i++) {
		System.out.println("Entre com o "  +  (i+1) + "º Valor de A");
		a[i] = ler.nextInt();
		media+= a [i];
	}	
	System.out.println("===============");
	media=media/10;
	System.out.println( "a media é : " + media);
	}

}
