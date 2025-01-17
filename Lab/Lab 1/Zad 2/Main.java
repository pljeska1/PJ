import literatura.*;
import java.util.*;
import Bozic.*;

public class Main {
	public static void main(String[] args) {
		Biblioteka<Referenca> b = new Biblioteka<>();
		Knjige k1 = new Knjige(2012, "Nesto");
		Knjige k2 = new Knjige(2018, "Nesto2");
		Knjige k3 = new Knjige(1984, "Nesto3");
		Radovi r1 = new Radovi(2004, 12345);
		Radovi r2 = new Radovi(2009, 67899);
		
		b.staviNaPolicu(k1);
		b.staviNaPolicu(k2);
		b.staviNaPolicu(k3);
		b.staviNaPolicu(r1);
		b.staviNaPolicu(r2);
		
		Knjige unos;
		try {
			Scanner tast = new Scanner(System.in);
			int god = tast.nextInt();
			if(god == 0) throw new Bozic("Uneta 0");
			tast.nextLine();
			String naslov = tast.nextLine();
			unos = new Knjige(god, naslov);
		} 
		catch (Bozic e) {
			System.out.println(e);
			unos = new Knjige(2024, "Ris papira");
		}
		b.staviNaPolicu(unos);
		b.urediPolicu();
	}
}
