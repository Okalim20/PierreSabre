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
	
	public void provoquer(Yakuza adversaire) {
		int force=this.honneur*2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force>=adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakusa !");
			this.honneur+=1;
			this.gagnerArgent(adversaire.perdre());
			
		} else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
			this.honneur-=1;
		}
		
	}
	
}
