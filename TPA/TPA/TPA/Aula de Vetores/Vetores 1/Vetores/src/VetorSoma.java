import java.util.Scanner;
public class VetorSoma {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
final int TAM=10;
int a[], b[], c[], i;
a = new int[TAM];
b = new int[TAM];
c = new int[TAM];
//laço para leitura do vetor A
for(i=0; i<TAM; i++) {
System.out.println("Digite o "+(i+1)+"º valor do vetor A");
a[i] = ler.nextInt();
}
//laço para leitura do vetor B
for(i=0; i<TAM; i++) {
System.out.println("Digite o "+(i+1)+"º valor do vetor B");
b[i] = ler.nextInt();
//fazendo a soma
c[i] = a[i]+b[i];
}
//apresentando o vetor C
System.out.print("\nC = ");
for(i=0; i<TAM; i++) {
System.out.print(c[i]+", ");
}
ler.close();
}
}