package ExerciciosJava;

public class TestaPaciente {

	public static void main(String[] args) {
Paciente pac = new Paciente();
		
		pac.setNome("João");
		pac.setNumerocartaoSUS(888999675);
		pac.setEndereco("Rua: Aculá nº1000");
		
		System.out.println("Dados Paciente: ");
		System.out.println("Nome:"+pac.getNome());
		System.out.println("Numero cartão do SUS: "+pac.getNumerocartaoSUS());
		System.out.println("Endereço: "+pac.getEndereco());
		
		
		
		pac.Consulta();
		pac.alta();

	}

}
