package moon;
import java.util.*;
import java.io.*;
import emergency.*;

public class MoonBaseAlpha {

	private ArrayList<Eagle> niz;
	
	public MoonBaseAlpha() {
		niz = new ArrayList<>();
	}
	
	public void dodajEagle(Eagle o) {
		niz.add(o);
	}
	
	public void uzbuna() throws LowCapacity {
		niz.sort(null);
		try {
			if(niz.get(niz.size() - 1).getKap() < 100) throw new LowCapacity("Previse mali Eagle");
			FileOutputStream f = new FileOutputStream("eagle.bin");
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			if (niz.size() > 0) { d.writeInt(niz.get(niz.size() - 1).getRed()); System.out.println(niz.get(niz.size() - 1).getRed()); }
			if (niz.size() > 1) { d.writeInt(niz.get(niz.size() - 2).getRed()); System.out.println(niz.get(niz.size() - 2).getRed()); }
			if (niz.size() > 2) { d.writeInt(niz.get(niz.size() - 3).getRed()); System.out.println(niz.get(niz.size() - 3).getRed()); }
			d.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
