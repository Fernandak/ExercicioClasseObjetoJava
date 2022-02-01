package ExerciciosJava;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente novo = new Cliente();

		novo.setNome("Fernanda");
		novo.setIdade(26);
		novo.setCpf(123456789);
		novo.setEmail("email@exemplo.com");


		System.out.println("Dados cliente:");
		System.out.println("Nome: "+novo.getNome());
		System.out.println("Idade: "+novo.getIdade());
		System.out.println("Cpf: " +novo.getCpf());
		System.out.println("Email: "+novo.getEmail());

		novo.cadastro();
		novo.cadastro();

	}

}
