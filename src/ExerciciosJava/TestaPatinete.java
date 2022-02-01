package ExerciciosJava;

public class TestaPatinete {

	public static void main(String[] args) {
		Patinete  pat = new Patinete();

		pat.setPtotecao("Capacete,cutuveleira");
		pat.setQuatidaderodas(3);
		

		System.out.println("Patinete: ");
		System.out.println("Proteção: "+pat.getPtotecao());
		System.out.println("Quantidade de rodinhas: "+pat.getQuatidaderodas());


		pat.andarpatinete();
		pat.manobras();

	}

}
