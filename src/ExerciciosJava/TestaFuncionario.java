package ExerciciosJava;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setNome("Maria");
		func.setCargo("Desenvolvedor");
		func.setSalario(10000);
		
		System.out.println("Dados do funcionario:");
		System.out.println("Nome do funcionario: "+func.getNome());
		System.out.println("Cargo: "+func.getCargo());
		System.out.println("Salario: "+func.getSalario());
		
		
		func.calcularHoraExtra();
		
		func.Trabalha();
	}

}
