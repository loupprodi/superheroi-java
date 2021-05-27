
public class Inseto extends Humano{
	
	protected String nomeInseto;
	protected boolean venenoso;
	protected boolean alado;
	protected boolean ferrao;
	
	public Inseto(String nome, String sexo, int idade, String lingua, String etnia, String nomeInseto,boolean venenoso, boolean alado, boolean ferrao) {
		super(nome, sexo, idade, lingua, etnia);
		this.nomeInseto=nomeInseto;
		this.venenoso=venenoso;
		this.alado=alado;
		this.ferrao=ferrao;
	}
	
	public boolean eVenenoso() {
		return venenoso=true;
	}
	public boolean nVenenoso() {
		return venenoso=false;
	}
	
	public boolean eAlado() {
		return alado=true;
	}
	public boolean nAlado() {
		return alado=false;
	}
	
	public boolean tFerrao() {
		return ferrao=true;
	}
	public boolean nFerrao() {
		return ferrao=false;
	}
}
