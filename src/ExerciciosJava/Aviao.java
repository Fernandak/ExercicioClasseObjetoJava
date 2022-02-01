package ExerciciosJava;
/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Aviao {
	private String modelo;
	private int AnoFabricacao,poltronas;
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return AnoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		AnoFabricacao = anoFabricacao;
	}

	public int getPoltronas() {
		return poltronas;
	}

	public void setPoltronas(int poltronas) {
		this.poltronas = poltronas;
	}

	void decolar() {

		System.out.println("Avião decolou");
	}

	void pousar() {
		System.out.println("Avião pousou");
}
}

