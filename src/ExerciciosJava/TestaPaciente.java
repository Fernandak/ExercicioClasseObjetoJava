package ExerciciosJava;

public class TestaPaciente {

	public static void main(String[] args) {
Paciente pac = new Paciente();
		
		pac.setNome("Jo�o");
		pac.setNumerocartaoSUS(888999675);
		pac.setEndereco("Rua: Acul� n�1000");
		
		System.out.println("Dados Paciente: ");
		System.out.println("Nome:"+pac.getNome());
		System.out.println("Numero cart�o do SUS: "+pac.getNumerocartaoSUS());
		System.out.println("Endere�o: "+pac.getEndereco());
		
		
		
		pac.Consulta();
		pac.alta();

	}

}
