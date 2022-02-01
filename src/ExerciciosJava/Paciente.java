package ExerciciosJava;

public class Paciente {
	private String nome, endereco;
	private int numerocartaoSUS;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumerocartaoSUS() {
		return numerocartaoSUS;
	}
	public void setNumerocartaoSUS(int numerocartaoSUS) {
		this.numerocartaoSUS = numerocartaoSUS;
	}
	void Consulta() {
		System.out.println("Paciente vai para consulta:");
	}
	void alta() {
		System.out.println("Paciente vai ter alta:");
	}
}
