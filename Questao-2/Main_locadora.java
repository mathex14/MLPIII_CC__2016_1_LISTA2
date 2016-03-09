package lista2;

public class Main_locadora {
	
	public static void main(String[] args) {
		
		Fita loc= new Fita();
		
		
		loc.setTitulo("Deadpool");
		loc.setPreçoF(5.00);
		loc.locar(loc.getPreçoF(), true, false);
		loc.setAutor("Tim Miller");
		
		System.out.println("Título: " + loc.getTitulo());
		System.out.println("Preço: " + loc.getValorT());
		System.out.println("Autor: " + loc.getAutor());
		System.out.println("Categoria: " + loc.enumset(0) + ", " + loc.enumset(2));
	}

}
