import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Ler String
//		String x;
//		x = sc.next();
//		System.out.println("Voce digitou: "+x);
		
//		Ler Int
//		int x;
//		x = sc.nextInt();
//		System.out.println("Voce digitou: "+x);
		
//		Ler Double
//		double x;
//		x = sc.nextDouble();
//		System.out.printf("Voce digitou: %.2f%n",x);
		
//		Ler char
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Voce digitou: " + x);
		
//		Ler varios dados
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
