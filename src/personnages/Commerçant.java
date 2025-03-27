package personnages;

public class Commerçant extends Humain{
	
	public Commerçant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int somme=this.getArgent();
		this.setArgent(this.getArgent());
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int argent) {
		this.setArgent(argent);
		this.parler(argent+" sous ! Je te remercie généreux donateur !");
	}
	
	
	
}
