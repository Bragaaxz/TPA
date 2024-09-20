package for_cases;

public class multiplos_de_dez {
public static void main(String[] args) {
	
	int i;

	for(i=0; i<=100; i++) {
		if (i % 10 <= 0) {
			System.out.println(i+"-Multiplo de 10");
		}else {
		System.out.println(i);
		}
	}
}	
}
