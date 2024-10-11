import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,ii;
		final int malvadeza=10;
		int a[] = new int [malvadeza];
		int b[] = new int [malvadeza];
		ii=9;
		for(i=0;i<10;i++) {
			System.out.println("insira o valor de A");
			a[i]=ler.nextInt();
			b[ii]=a[i];
			ii--;
		}
		System.out.print("A [");
		for (i=9; i>=0; i--) {
			System.out.print(a[i] + ", ");
		}	
		System.out.println("]" );
		
		System.out.print("B [");
		for(i=9;i>=0;i--) {			
			System.out.print(b[i] + ", ");
			}	
		System.out.print("]\n"  );
		ler.close();
	} 
}
