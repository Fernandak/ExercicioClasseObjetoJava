package ExerciciosJava;
/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
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

		System.out.println("Avi�o decolou");
	}

	void pousar() {
		System.out.println("Avi�o pousou");
}
}

