import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		int n=tecla.nextInt();
		int x=0;
		tecla.nextLine();
		for (int i=0; i<n; ++i) {
			
			String decl=tecla.nextLine();
			for (int j=0; j<decl.length(); ++j) {
				if (decl.charAt(j)=='-') {
					x--;
					j=decl.length();
				}else if (decl.charAt(j)=='+') {
					x++;
					j=decl.length();
				}
			}
		}
		System.out.print(x);

	}
}