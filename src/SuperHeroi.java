
public class SuperHeroi extends Inseto {
	
	protected String codinome;
	protected String trauma;
	protected String poderes;
	
	public SuperHeroi( String nome, String sexo, int idade, String lingua, String etnia, String nomeInseto,boolean venenoso, boolean alado, boolean ferrao, String codinome, String trauma, String poderes) {
		super(nome, sexo, idade, lingua, etnia, nomeInseto, venenoso, alado, ferrao);
		this.codinome=codinome;
		this.trauma=trauma;
		this.poderes=poderes;
	}
	
	public String toString() {
		return "Os dados da pessoa s�o: "
				+ "\n Nome: "+nome
				+"\n Sexo: "+sexo
				+"\n Idade: "+idade
				+"\n Lingua: "+lingua
				+"\n Etnia: "+etnia
				+"\n\n\nOs dados dos Insetos s�o:"
				+"\n Nome: "+nomeInseto
				+"\n Venenoso: "+venenoso
				+"\n Alado: "+alado
				+"\n Ferr�o: "+ferrao
				+"\n\n\nO nome do SuperHeroi �: "+codinome
				+"\n Trauma: "+trauma
				+"\n Poderes: "+poderes;
	}

}
