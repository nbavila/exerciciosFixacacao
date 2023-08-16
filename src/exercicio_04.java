import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorPorHora = sc.nextDouble();
		sc.close();
		
		double salario = horasTrabalhadas * valorPorHora;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);
	}

}
