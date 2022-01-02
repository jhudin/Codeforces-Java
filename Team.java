import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		int n=tecla.nextInt();
		int pres=0,total=0,cont=0;
		for (int i=0; i<(3*n); ++i) {
			String pruebas=tecla.next();
			cont++;
			if (pruebas.charAt(0)=='1') {
				pres++;
			}
			if (cont==3) {
				if (pres>=2) {
					total++;
				}
				pres=0;
				cont=0;
			}
			
		}
		System.out.println(total);
	}
}