package laco;
public class Altura {
public static void main(String[] args) {
	double altjo,altped,cresjo,cresped;
	int anos;
// Altura inicial
	altjo = 1.34;
	altped = 1.45;
// crescimento
	cresjo = 0.025;
	cresped = 0.02;
// anos
	anos = 0;
		while (altjo <= altped) {
			altjo += cresjo;
			altped += cresped;
			anos ++ ;
		} System.out.println("Em  " +   anos   +   "anos, João irá ultrapassar Pedro");
}
}
