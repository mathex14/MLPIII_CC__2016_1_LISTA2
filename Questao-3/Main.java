package classe_veiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo veiculo= new Veiculo();
		Veiculo_Carga vc = new Veiculo_Carga();
		Veiculo_Passeio vp = new Veiculo_Passeio();
		
		veiculo.setMarca("Audi");
		veiculo.setModelo("A4");
		veiculo.setAno(2015);
		veiculo.setPlaca("hdk8000");
		veiculo.setKminicial(0);
		veiculo.setKmfinal(300);
		veiculo.setValorKMrodado(3);
		veiculo.setChassi("9ABC8EFG7HIJ00");
		veiculo.setPropietario("Jonathan Morris");
		veiculo.setCarga(false);
		veiculo.setPasseio(true);
		
		if (veiculo.getCarga()==true)
			vc.setCap_carga(500);
		if (veiculo.getPasseio()==true)
		{
			vp.setArcondicionado(true);
			vp.setQtd_portas(4);
		}
		
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: "+ veiculo.getModelo());
		System.out.println("Ano: "+ veiculo.getAno());
		System.out.println("Placa: "+ veiculo.getPlaca());
		System.out.println("Km inicial: "+ veiculo.getKminicial());
		System.out.println("Km final: "+ veiculo.getKmfinal());
		System.out.println("Valor por km rodado: "+ veiculo.getValorKMrodado());
		System.out.println("Chassi: "+ veiculo.getChassi());
		System.out.println("Propietário: "+ veiculo.getPropietario());
		if (veiculo.getCarga()==true)
		System.out.println("Capacidade de Carga: " + vc.getCap_carga());
		if (veiculo.getPasseio()==true)
		{
		if (vp.getArcondicionado()==true)
		System.out.println("Ar-condicionado: Sim");
		else
			System.out.println("Ar-condicionado: Não");	
		System.out.println("Número de portas: " +vp.getQtd_portas());
		}
		System.out.println("Valor da locação do veículo: " + veiculo.CalcValorLoc());
		
		

	}

}
