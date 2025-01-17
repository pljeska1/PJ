import izuzeci.*;
import java.io.*;
import java.util.*;
import korespondencija.*;

public class Main {
	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		Telefon<Poruka> t = new Telefon<>();

		try {
			int broj = tast.nextInt();
			tast.nextLine();
			String text = tast.nextLine();
			SMS p1 = new SMS(broj, text);
			
			String adresa = tast.nextLine();
			text = tast.nextLine();
			Mail p2 = new Mail(adresa, text);
			
			String username = tast.nextLine();
			text = tast.nextLine();
			Chat p3 = new Chat(username, text);
			
			tast.close();
			
			t.dodajPoruku(p1);
			t.dodajPoruku(p2);
			t.dodajPoruku(p3);
			
			t.zoviRed();
			
			int brojac = 0;
		
			t.procitajPoruku();
			brojac++;
			t.procitajPoruku();
			brojac++;
			t.procitajPoruku();
			brojac++;
			
			FileOutputStream f = new FileOutputStream("izlaz.bin");
			BufferedOutputStream b = new BufferedOutputStream(f);
			DataOutputStream d = new DataOutputStream(b);
			
			d.writeInt(brojac);
			d.close();
		} 
		catch (NevalidnaPoruka e) {
			System.out.println(e);
		}
		catch (IOException eio) {
			System.out.println(eio);
		}
	}
}
