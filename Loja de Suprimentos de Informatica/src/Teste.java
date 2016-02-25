import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String numero;
		String descricao;
		int qtdComprada;
		double preço;
		
		System.out.print("Informe o numero do produto: ");
		numero = scan.next();
		System.out.print("Informe a descrição do produto: ");
		descricao = scan.next();
		System.out.print("Informe a quantidade comprada do produto: ");
		qtdComprada = scan.nextInt();
		System.out.print("Informe o preco do produto: ");
		preço = scan.nextDouble();
			
		Fatura faturaTeste = new Fatura(numero, descricao, qtdComprada, preço);
		faturaTeste.getValorFatura(qtdComprada, preço);
		
		System.out.println(faturaTeste);
	
	}
			
}
		

