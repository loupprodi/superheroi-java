
public class MainTest {

	public static void main(String[] args) {
		
		SuperHeroi A1 = new SuperHeroi("Vitor", "Maculino", 22, "Inglesa", "Cat�lico", "Aranha", true, false, false, "Miranha", "nenhum", "For�a e soltar teia" );
		A1.nVenenoso();
		A1.eAlado();
		A1.tFerrao();
		System.out.println(A1.toString());
	}

}
