package turizam;
import java.io.*;

public class Letovanje implements Put, Comparable<Put>{
	private String naziv;
	private int dani;
	private int cena;

	public Letovanje(String _naziv, int _dani, int _cena) {
		naziv = _naziv;
		dani = _dani;
		cena = _cena;
	}
	
	public int compareTo(Put o) {
		if(this.cena() > o.cena()) return 1;
		else if (this.cena() < o.cena()) return -1;
		else return 0;
	}

	public double cena() {
		return (cena * dani) * (Math.random() + 1);
	}

	public void upisi() {
		try {
			FileWriter f = new FileWriter(Double.toString(this.cena()) + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write(this.naziv.split(" ")[0]);
			b.close();
		} 
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
}
