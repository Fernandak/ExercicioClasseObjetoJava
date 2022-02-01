package ExerciciosJava;
/*
 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Patinete {
	private String ptotecao;
	private int quatidaderodas;
	
	
	public String getPtotecao() {
		return ptotecao;
	}
	public void setPtotecao(String ptotecao) {
		this.ptotecao = ptotecao;
	}
	public int getQuatidaderodas() {
		return quatidaderodas;
	}
	public void setQuatidaderodas(int quatidaderodas) {
		this.quatidaderodas = quatidaderodas;
	}
	void andarpatinete() {
		System.out.println("Andando de patinete");
	}
	void manobras() {
		System.out.println("Fazendo manobras radicais");
	}
}
