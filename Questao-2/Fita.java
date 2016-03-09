package lista2;

public class Fita {
	
	
	private String titulo;
	private double preçoF;
    private boolean lançamento;
    private boolean infantil;
    private double valorT;
    private String name;
	
	private Autor autor= new Autor();
	
	public enum categoria{
		Ação, Terror, Comédia, Drama, Aventura, Suspense, Romance, Animação;
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
	
	public double getPreçoF() {
		return preçoF;
	}
	
	public void setPreçoF(double preçoF) {
		this.preçoF = preçoF;
	}
	
	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
	
	public void setLançamento(boolean lançamento) {
		this.lançamento = lançamento;
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
	
	public void locar(double preçoF, boolean lançamento, boolean infantil){
		
		if (lançamento==true)
        this.valorT=preçoF*1.20;
		if (infantil==true)
		this.valorT=preçoF-(preçoF+0.40);	
		
	}

}
