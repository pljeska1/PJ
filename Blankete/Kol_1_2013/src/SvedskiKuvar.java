
public class SvedskiKuvar {
	
	public static void skuvajOvo(Konobar k) {
		String[] pom = (k.izdeklamuj()).split(" ");
		System.out.println("Kuvar je uzeo od " + k.ime() + " narudzbinu " + (k.izdeklamuj()).toString());
		k.pokupi(new Porcija(pom[0], pom[1], pom[2]));
	}

}
