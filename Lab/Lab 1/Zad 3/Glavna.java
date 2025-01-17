import turizam.*;
import inflacija.*;
import java.util.*;

public class Glavna {
	public static void main(String[] args) {
		Agencija<Put> a = new Agencija<>();
		Scanner tast = new Scanner(System.in);

		String naziv = tast.nextLine();
		int dani = tast.nextInt();
		tast.nextLine();
		int cena = tast.nextInt();
		tast.nextLine();
		Letovanje l1 = new Letovanje(naziv, cena, dani);
		
		naziv = tast.nextLine();
		dani = tast.nextInt();
		tast.nextLine();
		cena = tast.nextInt();
		tast.nextLine();
		Letovanje l2 = new Letovanje(naziv, cena, dani);
		
		naziv = tast.nextLine();
		dani = tast.nextInt();
		tast.nextLine();
		cena = tast.nextInt();
		tast.nextLine();
		int skiPas = tast.nextInt();
		tast.nextLine();
		Zimovanje z1 = new Zimovanje(naziv, cena, dani, skiPas);
		
		naziv = tast.nextLine();
		dani = tast.nextInt();
		tast.nextLine();
		cena = tast.nextInt();
		tast.nextLine();
		skiPas = tast.nextInt();
		tast.nextLine();
		Zimovanje z2 = new Zimovanje(naziv, cena, dani, skiPas);
		
		tast.close();
		
		a.dodaj(l1);
		a.dodaj(l2);
		a.dodaj(z1);
		a.dodaj(z2);
		
		try {
			a.uvediRed();
		}
		catch (Preskupo e) {
			System.out.println(e);
		}
		
	}
}
