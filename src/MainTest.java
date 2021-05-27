
public class MainTest {

	public static void main(String[] args) {
		
		SuperHeroi A1 = new SuperHeroi("Vitor", "Maculino", 22, "Inglesa", "Católico", "Aranha", true, false, false, "Miranha", "nenhum", "Força e soltar teia" );
		A1.nVenenoso();
		A1.eAlado();
		A1.tFerrao();
		System.out.println(A1.toString());
	}

}
