import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, numeroPeca1, numeroPeca2;
		double valorUnitario1, valorUnitario2, total;

		cod1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();

		cod2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();

		sc.close();
		total = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);

	}

}
