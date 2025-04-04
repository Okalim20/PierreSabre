package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String seigneur,String nom, String boisson, int argent) {
		super(nom,boisson,argent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur "+this.getSeigneur()+".");
	}
	
	public void boire(String boisson) {
		this.parler("Qu'est ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson+".");
	}

	public String getSeigneur() {
		return seigneur;
	}
	
}

