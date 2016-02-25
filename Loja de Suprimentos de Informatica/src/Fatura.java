public class Fatura {
	
	private String numero;
	private String descrição;
	private int qtdComprada;
	private double preço;
	
	public Fatura(String numero, String descrição, int qtdComprada, double preço) {
		this.numero = numero;
		this.descrição = descrição;
		this.qtdComprada = qtdComprada;
		this.preço = preço;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescrição() {
		return descrição;
	}
	
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	public int getQtdComprada() {
		return qtdComprada;
	}
	
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	
	public double getPreço() {
		return preço;
	}
	
	public void setPreço(double preço) {
		if(preço < 0.0){
			this.preço = 0.0;
		
		} else {
			this.preço = preço;
		}		
	}
	
	public double getValorFatura(int qtdComprada, double preço){
		double valor = qtdComprada * preço;
		
		if(valor < 0){
			return valor = 0;
		
		} else {
			return valor;
		}
		
	}
	
	public String toString() {
		return "Fatura [numero=" + numero + ", descrição=" + descrição + ", qtdComprada=" + qtdComprada + ", preço="
				+ preço + "]";
	}

}
