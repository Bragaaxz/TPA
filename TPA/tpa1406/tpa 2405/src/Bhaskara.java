import java.util.Scanner;
public class Bhaskara{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			double a,b,c, delta, quad, x1=0,x2=0;
			System.out.println("Digite o  Valor A :");
			a = ler.nextDouble();
			System.out.println("Digite o  Valor B  :");	
			b = ler.nextDouble();
			System.out.println("Digite o  Valor C  :");
			c =  ler.nextDouble();
			delta = (b*b) -4 * a * c;
			
			if (delta > 0) {
				quad = Math.sqrt(delta);
				x1 = (- b + quad) / (2 * a);
				x2 = (- b - quad) / (2 * a);
				System.out.println("As duas raizes reais são x1 = "+x1+" e x2 = "+x2);
			}else if (delta == 0) {
				quad = Math.sqrt(delta);
				x1 = - b /(2 * a);
				System.out.println("Existe uma raiz real x1 = "+x1);
			}else  {
				System.out.println("Não existe raízes reais");
			}
			ler.close();
			
	}
	
}