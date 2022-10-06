//# ejercicio2
//jose franklim fernandez vallejos
import java.util.*;
public class Operaciones {
	public static void main(String[] args) {		
		Operaciones op = new Operaciones();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduca su primer valor");
		int a = sc.nextInt();
		System.out.println("Introduca su segundo valor");
		int b = sc.nextInt();

		op.suma(a, b);
		
	}
	public void suma (int a, int b) {
		System.out.print("La suma es: "+a+b);
	}

}
