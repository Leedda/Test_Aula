import java.util.Scanner;

public class InformaAprovacaoAluno {
	
	//Variável contante
	static final double NOTA_MINIMA_PARA_APROVACAO = 7.0;

	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		double nota = scan.nextDouble();
		boolean aprovado = true;
		
		if(nota > NOTA_MINIMA_PARA_APROVACAO) {
			
			System.out.println("Parabéns você foi Aprovado! ");
		}else {
			System.out.println("Você foi Reprovado! ");
		}
		
		scan.close();
	}

}
