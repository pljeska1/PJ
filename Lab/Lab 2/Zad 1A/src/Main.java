import moon.*;
import emergency.*;

public class Main {
	public static void main(String[] args) {
		MoonBaseAlpha base = new MoonBaseAlpha();

		Eagle e1 = new Eagle(1);
		Eagle e2 = new Eagle(2);
		Eagle e3 = new Eagle(3);

		e1.ucitajKap();
		e2.ucitajKap();
		e3.ucitajKap();
	
		base.dodajEagle(e1);
		base.dodajEagle(e2);
		base.dodajEagle(e3);
		
		try {
			base.uzbuna();
		}
		catch (LowCapacity e) {
			System.out.println(e);
		}
	}
}
