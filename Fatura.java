public class Fatura {
	
	private String numero;
	private String descri��o;
	private int qtdComprada;
	private double pre�o;
	
	public Fatura(String numero, String descri��o, int qtdComprada, double pre�o) {
		this.numero = numero;
		this.descri��o = descri��o;
		this.qtdComprada = qtdComprada;
		this.pre�o = pre�o;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescri��o() {
		return descri��o;
	}
	
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	
	public int getQtdComprada() {
		return qtdComprada;
	}
	
	public void setQtdComprada(int qtdComprada) {
		this.qtdComprada = qtdComprada;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	
	public void setPre�o(double pre�o) {
		if(pre�o < 0.0){
			this.pre�o = 0.0;
		
		} else {
			this.pre�o = pre�o;
		}		
	}
	
	public double getValorFatura(int qtdComprada, double pre�o){
		double valor = qtdComprada * pre�o;
		
		if(valor < 0){
			return valor = 0;
		
		} else {
			return valor;
		}
		
	}
	
	public String toString() {
		return "Fatura [numero=" + numero + ", descri��o=" + descri��o + ", qtdComprada=" + qtdComprada + ", pre�o="
				+ pre�o + "]";
	}

}
