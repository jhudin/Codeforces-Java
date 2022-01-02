import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		int a=tecla.nextInt();
		if (a%2==1 || a==2) {
			System.out.print("NO");
		}else{
			System.out.print("YES");
		}

	}
}