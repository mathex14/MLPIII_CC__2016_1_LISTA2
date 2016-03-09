package lista2;

public class Fita {
	
	
	private String titulo;
	private double pre�oF;
    private boolean lan�amento;
    private boolean infantil;
    private double valorT;
    private String name;
	
	private Autor autor= new Autor();
	
	public enum categoria{
		A��o, Terror, Com�dia, Drama, Aventura, Suspense, Romance, Anima��o;
	}
	
	categoria cat;
	
    public categoria enumset(int num){
    	return categoria.values()[num];
    }
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getPre�oF() {
		return pre�oF;
	}
	
	public void setPre�oF(double pre�oF) {
		this.pre�oF = pre�oF;
	}
	
	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	
	public void setLan�amento(boolean lan�amento) {
		this.lan�amento = lan�amento;
	}
	
	public double getValorT() {
		return valorT;
	}
	
	public void setValorT(double valorT) {
		this.valorT = valorT;
	}
	
	public String getAutor() {
		return autor.getNome();
	}
	
	public void setAutor(String autor) {
		this.autor.setNome(autor);
	}
	
	public void locar(double pre�oF, boolean lan�amento, boolean infantil){
		
		if (lan�amento==true)
        this.valorT=pre�oF*1.20;
		if (infantil==true)
		this.valorT=pre�oF-(pre�oF+0.40);	
		
	}

}
