
public class Fatura {
	
	private String numero;
	private String descrição;
	private int qtd;
	private double preço;
	
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
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double getPreço() {
		return preço;
	}
	
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public double getValorFatura(double preço, double qtd) {
		double valor;
		
		if (preço<0)
			preço=0;
		
		valor = preço*qtd;
		
		if (valor<0)
			valor=0;
		
		return valor;

	}
	

}
