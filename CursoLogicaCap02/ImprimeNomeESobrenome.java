import java.util.Scanner;

public class ImprimeNomeESobrenome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu primeiro nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println("\n\nSeu nome completo é: " + nomeCompleto);
		
		scan.close();
	}

}
