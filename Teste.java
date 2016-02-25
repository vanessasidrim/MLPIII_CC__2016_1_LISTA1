import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cor;
		String modelo;
		int velocidadeAtual = 0;
		int velocidadeMaxima;
		int aceleracao;
		String controle = "sim";
		
		System.out.print("Informe a cor do carro: ");
		cor = scan.next();
		System.out.print("Informe o modelo do carro: ");
		modelo = scan.next();
		System.out.print("Informe a velocidade máxima do carro: ");
		velocidadeMaxima = scan.nextInt();
		
		Carro carroTeste = new Carro(cor, modelo, velocidadeAtual, velocidadeMaxima);
		
		carroTeste.ligar();
		
		while(carroTeste.getVelocidadeAtual() < carroTeste.getVelocidadeMaxima()){
			System.out.print("Informe quanto deseja acelerar: ");	
			aceleracao = scan.nextInt();
			
			carroTeste.acelerar(aceleracao);
			System.out.println(carroTeste);		
			
		}


	}	
		
}




