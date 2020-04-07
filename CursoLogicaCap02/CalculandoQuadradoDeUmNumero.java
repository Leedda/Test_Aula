import java.util.Scanner;

public class CalculandoQuadradoDeUmNumero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		int quadrado = (numero * numero);
		
		System.out.println("O quadrado do numero " + numero + " é: " + quadrado);
		
	}

}
