import java.util.Scanner; 
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);	
		int i;
		int a[] = new int [10]; 
		int b[] = new int [10];
	// valores a e b	
	for (i=0; i<10; i++) { 
		System.out.println("Digite o " +(i+1)+"� valor de a :");
		a [i] = ler.nextInt();
		b [i] = a[i]*a[i]; 		
	}
	// apresentando a e b

	System.out.print("A [");
for (i=0; i<10; i++) {
	System.out.print(a[i] + ", ");
}	
System.out.println("]" );
		System.out.print("B [");
	for (i=0; i<10; i++) {
		System.out.print(b[i] + ", ");
	}	
	System.out.print("]\n"  );
		ler.close();
	}
}
