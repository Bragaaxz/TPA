
public class Questão_2 {

	public static void main(String[] args) {
		//declarando variaveis
		int i,valor,ii; 
		
		//declarando meu vetor
		int a[]= {1,2,3,4,5}; 
		
		//definindo valor da variavel "valor"
		valor=0; 
		
		//for para cadanumero dentro do vetro
		for(i=0;i<5;i++) { 
			
			//resetando o valor da variavel "valor" para não interferir nos resultados
			valor=0; 
			
			 //imprimindo texto
			System.out.println("tabuada de 1 a 10 do numero "+a[i]);
			
			//for para a determinar a tabuada
			for(ii=0;ii<10;ii++) {
				
				 //valor inicialmente é 0 então a+0= a e assim sucessivamente
				valor=a[i]+valor;
				
				//imprime valor
				System.out.println(valor); 
			}
		}
	}
}

