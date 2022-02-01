package ExerciciosJava;

public class ProdutoEletronico {
	
	private int CodigoProduto;
	private double PrecoProduto;
	private String NomeProduto, Descricao;

	
	public int getCodigoProduto() {
		return CodigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		CodigoProduto = codigoProduto;
	}
	public double getPrecoProduto() {
		return PrecoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		PrecoProduto = precoProduto;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	void venda() {
		System.out.println("Produto vendido");
}
	void atualizarEstoque() {
		System.out.println("Repondo estoque");
}
	
}
