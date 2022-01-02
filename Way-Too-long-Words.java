import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		int n=tecla.nextInt();
		for (int i=0; i<n; ++i) {
			String palabra=tecla.next();
		if (palabra.length()>10) {
			System.out.println(""+palabra.charAt(0)+(palabra.length()-2)+(palabra.charAt(palabra.length()-1)));
		}else{
			System.out.println(palabra);
		}
		}
		
		
	}
}