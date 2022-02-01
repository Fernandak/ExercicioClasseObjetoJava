package ExerciciosJava;

public class Funcionario {
	 private String Nome,cargo;
	private double salario;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	void Trabalha() {
		System.out.println("Funcionario Trabalhando");
}
	void calcularHoraExtra() {
		System.out.println("Calculando hora extra funcionario");
}
	

}
