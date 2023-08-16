import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		sc.close();
		System.out.printf("SOMA = %d", soma);
	}

}
