package histoire;

import java.util.Random;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Random random = new Random();
		/*
		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		*/
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sak�", 80);
		/*
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
		akimoto.boire("th�");
		*/
	
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissance(masako);
		masako.ranconner(kumi);
		masako.faireConnaissance(yaku);
		masako.faireLeGentil();
		masako.faireConnaissance(roro);
		
		
	}
}
