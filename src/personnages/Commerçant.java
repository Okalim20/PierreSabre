package personnages;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		int somme=this.getArgent();
		this.setArgent(this.getArgent());
		this.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int argent) {
		this.setArgent(argent);
		this.parler(argent+" sous ! Je te remercie g�n�reux donateur !");
	}
	
	
	
}
