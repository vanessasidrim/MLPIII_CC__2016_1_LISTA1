public class Carro {
	
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	public Carro(String cor, String modelo, int velocidadeAtual, int velocidadeMaxima) {
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar (){
		System.out.println("Carro Ligado");
	}
	
	public void acelerar (int aceleracao){
		if (aceleracao > velocidadeMaxima ){
			System.out.println("Velocidade Excedida");
		
		}else {
			this.velocidadeAtual = this.velocidadeAtual + aceleracao;
				if(velocidadeAtual > velocidadeMaxima){
					System.out.println("Velocidade Excedida");
				}
			}
		}
		
	
		
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", velocidadeAtual=" + velocidadeAtual
				+ ", velocidadeMaxima=" + velocidadeMaxima + "]";
	}
	

}
