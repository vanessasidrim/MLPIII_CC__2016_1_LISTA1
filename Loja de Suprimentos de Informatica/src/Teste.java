import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String numero;
		String descricao;
		int qtdComprada;
		double pre�o;
		
		System.out.print("Informe o numero do produto: ");
		numero = scan.next();
		System.out.print("Informe a descri��o do produto: ");
		descricao = scan.next();
		System.out.print("Informe a quantidade comprada do produto: ");
		qtdComprada = scan.nextInt();
		System.out.print("Informe o preco do produto: ");
		pre�o = scan.nextDouble();
			
		Fatura faturaTeste = new Fatura(numero, descricao, qtdComprada, pre�o);
		faturaTeste.getValorFatura(qtdComprada, pre�o);
		
		System.out.println(faturaTeste);
	
	}
			
}
		

