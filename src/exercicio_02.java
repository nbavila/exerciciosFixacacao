import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double tt = 3.14159;
		double area = tt * (raio * raio);
		sc.close();
		System.out.printf("A= %.4f", area);
	}

}
