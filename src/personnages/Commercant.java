package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int somme=this.getArgent();
		this.perdreArgent(somme);
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int argent) {
		this.setArgent(argent);
		this.parler(argent+" sous ! Je te remercie généreux donateur !");
	}
	
	
	
}
