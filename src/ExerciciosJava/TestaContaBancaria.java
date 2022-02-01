package ExerciciosJava;

public class TestaContaBancaria {

	public static void main(String[] args) {
		ContaBancaria CB = new ContaBancaria();
		
		CB.setNomeCliente("João");
		CB.setCpf(123456789);
		CB.setTipoConta("PJ ou PF");
		
		System.out.println("Dados da conta: ");
		System.out.println("Nome:"+CB.getNomeCliente());
		System.out.println("CPF: "+CB.getCpf());
		System.out.println("Tipo de conta:"+CB.getTipoConta());
		
		
		CB.AbrirConta();
		CB.encerrar();

	}

}
