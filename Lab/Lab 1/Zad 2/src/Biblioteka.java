import java.util.ArrayList;
import literatura.*;
import java.io.*;

public class Biblioteka<T extends Referenca> {
	private ArrayList<T> niz;
	
	public <T>Biblioteka(){
		niz = new ArrayList<>();
	}
	
	public void staviNaPolicu(T o) {
		niz.add(o);
	}
	
	public void urediPolicu() {
		niz.sort(null);
		niz.get(0).upisi();
		niz.get(niz.size() - 1).upisi();
		try {
			FileOutputStream f = new FileOutputStream("Broj.bin");
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			d.writeInt(niz.size());
			d.close();
		} 
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
}
