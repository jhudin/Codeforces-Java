import java.util.Scanner;
public class main{
	public static void main(String[] args) {
		Scanner tecla=new Scanner(System.in);
		String n=tecla.nextLine();
		int tam=0,x,y,cant=0;
		String[] xy =  n.split(" ");
		tam=Integer.parseInt(xy[0])*Integer.parseInt(xy[1]);
		if (tam%2==1) {
			tam--;
		}
		cant=tam/2;
		System.out.println(cant);
	}
}