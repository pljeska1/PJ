
public class Restoran {
	private Gost gniz[];
	private Konobar kniz[];
	
	private int brGostiju;
	private int brKonobara;
	
	public Restoran() {
		brGostiju = 0;
		brKonobara = 0;
	}
	
	public void ugosti(Gost g) {
		if(brGostiju == 0) {
			gniz = new Gost[1];
			gniz[0] = g;
			brGostiju++;
		}
		else {
			Gost[] pom = new Gost[brGostiju + 1];
			int i;
			for(i = 0; i < brGostiju; i++) {
				pom[i] = gniz[i];
			}
			brGostiju++;
			pom[i] = g;
			gniz = pom;
		}
	}
	
	public void zaposli(Konobar k) {
		if(brKonobara == 0) {
			kniz = new Konobar[1];
			kniz[0] = k;
			brKonobara++;
		}
		else {
			Konobar[] pom = new Konobar[brKonobara + 1];
			int i;
			for(i = 0; i < brKonobara; i++) {
				pom[i] = kniz[i];
			}
			brKonobara++;
			pom[i] = k;
			kniz = pom;
		}
	}
	
	public void posluzi() {
		if(brGostiju > brKonobara) {
			for (int i = 0; i < brKonobara; i++) {
				gniz[i].setMojKonobar(kniz[i]);
				System.out.println("Gostu " + (i+1) + " dodeljen Konobar " + (i+1));
			}
			for (int i = brKonobara; i < brGostiju; i++) {
				gniz[i] = new Gost();
				System.out.println("Gostu " + (i + 1) + " nije dodeljen konobar");
			}
			for (int i = 0; i < brKonobara; i++) {
				gniz[i].izjasniSe();
				System.out.println(kniz[i].feedback());
				System.out.println("Konobar " + kniz[i].ime() + " je primio narudzbinu " + (kniz[i].getNar()).toString());
				
				SvedskiKuvar.skuvajOvo(kniz[i]);
				
				gniz[i].primi();
				System.out.println(gniz[i].feedback());
			}
			for (int i = brKonobara; i < brGostiju; i++) {
				System.out.println("Gost bez konobara " + gniz[i].feedback());
			}
		}
		else {
			for(int i = 0; i < brGostiju; i++) {
				gniz[i].setMojKonobar(kniz[i]);
				System.out.println("Gostu " + (i+1) + " dodeljen Konobar " + (i+1));
			}
			for (int i = 0; i < brGostiju; i++) {
				gniz[i].izjasniSe();
				System.out.println(kniz[i].feedback());
				System.out.println("Konobar " + kniz[i].ime() + " je primio narudzbinu " + (kniz[i].getNar()).toString());
				
				SvedskiKuvar.skuvajOvo(kniz[i]);
				
				gniz[i].primi();
				System.out.println(gniz[i].feedback());
			}
		}
	}
}
