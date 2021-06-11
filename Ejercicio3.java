
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String args[]) 
 {
		Scanner scanner = new Scanner(System.in);
		int n;
		int total;
		System.out.println("Ingrese un numero: ");
		n = scanner.nextInt();
		total = 1;
		while (n>0) {
			total = total*n;
			n = n-1;
		}
		System.out.println(total);
	}


}

