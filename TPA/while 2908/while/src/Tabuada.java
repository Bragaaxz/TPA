package laco;
public class Tabuada {
public static void main(String[] args) {
	int a,b,c;
// info
	a = 0;
	b = 0;
	c = 0;
		while (b <= 10 & a <= 10) {
			b ++;
			c = a * b;
				System.out.println( a + "X" + b + "=" + c );
			if (b == 10) {
				a++;
				b = 0;
					System.out.println("______________");
				
			}	
			
			
			
			
		}
}
}
