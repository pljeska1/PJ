import java.util.*;
import turizam.*;
import java.io.*;
import inflacija.*;

public class Agencija<T extends Put> {
	private ArrayList<T> niz;
	
	public Agencija() {
		niz = new ArrayList<>();
	}
	
	public void dodaj(T o) {
		niz.add(o);
	}
	
	public void uvediRed() throws Preskupo{
		niz.sort(null);
		
		for (int i = 0; i < niz.size() - 1; i++)
			niz.get(i).upisi();
		
		if(niz.get(niz.size() - 1).cena() > 2000) throw new Preskupo("Preskupo je");
		
		try {
			FileOutputStream f = new FileOutputStream("ekskluziva.bin");
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			d.writeDouble(niz.get(niz.size() - 1).cena());
			d.close();
		} 
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
