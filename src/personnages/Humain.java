package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson+".");
	}
	
	public void boire() {
		parler("Mmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	protected void parler(String texte) {
		System.out.println( "("+nom+") - "+texte);
	}
	
	private void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	private void perdreArgent(int gain) {
		this.argent-=gain;
	}
	
	public void acheter(String bien, int prix) {
		if (argent>=prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offir un "+bien+" à "+prix+" sous.");
			this.perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offir un "+bien+" à "+prix+" sous.");

		}
	}
	
	
	
	}

