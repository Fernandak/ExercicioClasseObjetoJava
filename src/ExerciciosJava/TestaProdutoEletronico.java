package ExerciciosJava;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico PE = new ProdutoEletronico();
		
		PE.setNomeProduto("Celular");
		PE.setCodigoProduto(01);
		PE.setPrecoProduto(900);
		PE.setDescricao("Celular Samsung, camera 16mp,mem�ria 132g");
		
		System.out.println("Dados Celular:");
		System.out.println("Nome do produto: "+PE.getNomeProduto());
		System.out.println("Codigo do produto: "+PE.getCodigoProduto());
		System.out.println("Pre�o do produto: "+PE.getPrecoProduto());
		System.out.println("Descri��o do produto: "+PE.getDescricao());
		
		PE.venda();
		PE.atualizarEstoque();
	}

}
