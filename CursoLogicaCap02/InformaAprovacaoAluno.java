import java.util.Scanner;

public class InformaAprovacaoAluno {
	
	//Vari�vel contante
	static final double NOTA_MINIMA_PARA_APROVACAO = 7.0;

	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		double nota = scan.nextDouble();
		boolean aprovado = true;
		
		if(nota > NOTA_MINIMA_PARA_APROVACAO) {
			
			System.out.println("Parab�ns voc� foi Aprovado! ");
		}else {
			System.out.println("Voc� foi Reprovado! ");
		}
		
		scan.close();
	}

}
