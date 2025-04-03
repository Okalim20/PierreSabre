package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens; tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int somme=victime.seFaireExtorquer();
		this.gagnerArgent(somme);;
		this.parler("J'ai piqué les "+somme+" sous de "+victime.getNom()+"ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
		this.reputation+=1;
	}
	
	public int perdre() {
		int somme=this.getArgent();
		this.reputation-=1;
		this.parler("J'ai perdu mon duel et mes "+somme+" sous, snif... J'ai déshonoré le clan de "+this.clan+".");
		return somme;
	}
	
	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation+=1;
		this.parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}

	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de "+this.clan+".");
	}
	
	
}
