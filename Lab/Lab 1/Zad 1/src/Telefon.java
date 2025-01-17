import java.util.*;
import korespondencija.*;
import izuzeci.NevalidnaPoruka;

public class Telefon<T extends Poruka> {
	private ArrayList<T> niz;
	
	public Telefon() {
	    niz = new ArrayList<>();
	}
	
	public void dodajPoruku(T poruka) {
		niz.add(poruka);
	}
	
	public void zoviRed() {
		niz.sort(null);
	}
	
	public int procitajPoruku() throws NevalidnaPoruka{
		if(!niz.isEmpty()) {
			if(niz.get(niz.size() - 1).validiraj() == -1) {
				niz.removeLast();
				throw new NevalidnaPoruka("Nije validna poruka");
			}
			niz.get(niz.size() - 1).ispisi();
			niz.get(niz.size() - 1).arhiviraj();
			niz.removeLast();
			return 1;
		}
		else 
			return -1;
	}
}
