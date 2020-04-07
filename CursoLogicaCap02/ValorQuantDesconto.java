import java.util.Scanner;

public class ValorQuantDesconto {
	
	static final int PERCENTAGEM = 10;

	public static void main(String[] args) {

 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valorProduto = scan.nextDouble();
		
		System.out.println("Digite a quantidade de produto: ");
		int quantidadeProduto = scan.nextInt();
		
		double subTotal = valorProduto * quantidadeProduto;
		double total = 0;
		double desconto = (subTotal * PERCENTAGEM)/100;
		
		if(quantidadeProduto > 10) {
			total = subTotal - desconto;
		} else 
			total = subTotal;
				
		System.out.println("O valor Total é: " + total);
		
		scan.close();
		
	}

}
/*
Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.  
 Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.

Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades,
 vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.

Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
 você multiplica o subtotal pelo próprio percentual e divide tudo por 100.

Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. 
O que sobrar será o valor total final e deverá ser apresentado no console.
*/