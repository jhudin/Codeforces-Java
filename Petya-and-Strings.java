import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		String cadena[]=new String[2];
		int cadenanumA[]= new int [2];
		Scanner tecla=new Scanner(System.in);
		for (int i=0; i<2; i++) {
			cadena[i]=tecla.nextLine();
			cadena[i]=cadena[i].toLowerCase();
			int cadenanum=0;
			for (int j=0; j<cadena[i].length(); j++) {
				cadenanum+=(int)cadena[i].charAt(j);
			}
			cadenanumA[i]=cadenanum;
		}
		int valor=0;
		for (int j=0; j<cadena[0].length(); j++) {
			if ((int)cadena[0].charAt(j)>(int)cadena[1].charAt(j)) {
				valor=1;
				j=cadena[0].length();
			}else if ((int)cadena[0].charAt(j)<(int)cadena[1].charAt(j)) {
				valor=-1;
				j=cadena[0].length();
			}else if ((int)cadena[0].charAt(j)==(int)cadena[1].charAt(j)) {
				valor=0;
		}
			}
			System.out.println(valor);


		
	}
}