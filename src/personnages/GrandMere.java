package personnages;

import java.util.Random;

public class GrandMere extends Humain{
	
	private enum TypeHumain {
		COMMERCANT("Commerçant"),RONIN("Ronin"),SAMOURAI("Samouraï"),TRAITRE("Traitre"),YAKUZA("Yakuza"),HUMAIN("Habitant"),GRAND_MERE("Grand-mère");
		
		private String nom;

		private TypeHumain(String nom) {
			this.nom = nom;		
		}
		
		public String toString() {
			return nom;
		}
	}

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {
		if (this.nbConnaissance>=5) {
			this.parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
		else {
		this.memoire[this.nbConnaissance]=humain;
		this.nbConnaissance++;
		}
	}
	
	public String humainHasard() {
		Random random = new Random();
		TypeHumain[] types = TypeHumain.values();
		return types[random.nextInt(types.length)].nom;
	}
	
	public void ragoter() {
		for (int i = 0; i < this.nbConnaissance; i++) {
			if (memoire[i] instanceof Traitre) {
				this.parler("Je sais que Masako est un traître. Petit chenapan !");
			}
			else {
				this.parler("Je crois que "+memoire[i].getNom()+" est un "+this.humainHasard());
			}
		}
	}
}
