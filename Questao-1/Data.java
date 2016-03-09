package lista2;

public class Data {
	
    private int dia;  
    private int mes;  
    private int ano;      

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia>0 && dia<32)
		this.dia = dia;
		else
		{
		System.out.println("data inválida!"); 
		System.exit(1);
		}
		
	} 
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		if (mes>0 && mes<13)
		this.mes = mes;
		else
		{
		System.out.println("data inválida!"); 
		System.exit(1);
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if (ano>0 && ano<10000)
		this.ano = ano;
		else
		{
		System.out.println("data inválida!"); 
		System.exit(1);
		}
	}
	
    public String toString() {   
    	return this.dia + "/" + this.mes + "/" + this.ano;  
    	}
	
    }  

