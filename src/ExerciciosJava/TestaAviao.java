package ExerciciosJava;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao av = new Aviao();
		
		av.setModelo("Boeing 720");
		av.setAnoFabricacao(2022);
		av.setPoltronas(150);
		
		
		System.out.println("Dados Avião:");
		System.out.println("Modelo: "+av.getModelo());
		System.out.println("Ano Fabricacao: "+av.getAnoFabricacao());
		System.out.println("Quantidade de poltronas: "+av.getPoltronas());
		

		av.decolar();
		av.pousar();
	}

}
