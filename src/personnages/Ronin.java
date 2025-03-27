package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int somme=this.getArgent()/10;
		this.perdreArgent(somme);
		this.parler(beneficiaire.getNom()+" prend ces "+somme+" sous.");
		beneficiaire.recevoir(somme);
	}
}
