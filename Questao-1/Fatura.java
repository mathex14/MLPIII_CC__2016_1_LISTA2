
public class Fatura {
	
	private String numero;
	private String descri��o;
	private int qtd;
	private double pre�o;
	
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
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double getPre�o() {
		return pre�o;
	}
	
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	public double getValorFatura(double pre�o, double qtd) {
		double valor;
		
		if (pre�o<0)
			pre�o=0;
		
		valor = pre�o*qtd;
		
		if (valor<0)
			valor=0;
		
		return valor;

	}
	

}
