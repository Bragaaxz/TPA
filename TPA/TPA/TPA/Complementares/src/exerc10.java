import java.util.Scanner;
public class exerc10 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int a[], b[], c[], i, k = 0;
	boolean existe;
	a = new int[10];
	b = new int[10];
	c = new int[10];

	System.out.println("Digite 10 números inteiros para o vetor A:");
	for (i = 0; i < 10; i++) {
	    a[i] = ler.nextInt();
	}

	System.out.println("Digite 10 números inteiros para o vetor B:");
	for (i = 0; i < 10; i++) {
	    b[i] = ler.nextInt();
	}
	for (i = 0; i < 10; i++) {
		existe = false;
	    for (int j = 0; j < 10; j++) {
	        if (a[i] == b[j]) {
	        	existe = true;
	           	break;
	        }    
	       }
	    if (!existe) {
            c[k] = a[i];
            k++;
	        }
	    }
	 System.out.println("Elementos da diferença (A - B):"); 
	    for (i = 0; i < k; i++) { 
	    	System.out.println(c[i]); 
	    }
	}
	}
