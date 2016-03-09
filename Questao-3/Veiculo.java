package classe_veiculo;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKMrodado;
	private double  kminicial;
	private double kmfinal;
	private double ValorLoc;
	private String chassi;
	private boolean carga;
	private boolean passeio;
	
	private Pessoa propietario= new Pessoa();
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getValorKMrodado() {
		return valorKMrodado;
	}
	
	public void setValorKMrodado(double valorKMrodado) {
		this.valorKMrodado = valorKMrodado;
	}
	
	public double getKminicial() {
		return kminicial;
	}
	
	public void setKminicial(double kminicial) {
		this.kminicial = kminicial;
	}
	
	public double getKmfinal() {
		return kmfinal;
	}
	
	public void setKmfinal(double kmfinal) {
		this.kmfinal = kmfinal;
	}
	
	public double CalcValorLoc() {
		ValorLoc=(kmfinal-kminicial)*valorKMrodado;
		return ValorLoc;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public String getPropietario() {
		return propietario.getNome();
	}
	
	public void setPropietario(String propietario) {
		this.propietario.setNome(propietario);
	}
	
	public boolean getCarga(){
		return carga;
	}
	
	public void setCarga(boolean carga) {
		this.carga = carga;
	}
	
	public boolean getPasseio(){
		return passeio;
	}
	
	public void setPasseio(boolean passeio) {
		this.passeio = passeio;
	}

}
