package lista2;

public class Main_locadora {
	
	public static void main(String[] args) {
		
		Fita loc= new Fita();
		
		
		loc.setTitulo("Deadpool");
		loc.setPre�oF(5.00);
		loc.locar(loc.getPre�oF(), true, false);
		loc.setAutor("Tim Miller");
		
		System.out.println("T�tulo: " + loc.getTitulo());
		System.out.println("Pre�o: " + loc.getValorT());
		System.out.println("Autor: " + loc.getAutor());
		System.out.println("Categoria: " + loc.enumset(0) + ", " + loc.enumset(2));
	}

}
