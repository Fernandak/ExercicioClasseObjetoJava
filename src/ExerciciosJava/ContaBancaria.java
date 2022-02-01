package ExerciciosJava;
/*
 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
public class ContaBancaria {
	private String NomeCliente,tipoConta;
	private int cpf;
	
	
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	void AbrirConta() {
		System.out.println("Abrindo conta no banco");
}
	void encerrar() {
		System.out.println("Encerrando conta do banco");
}
}
