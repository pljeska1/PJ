package turizam;
import java.io.*;

public class Zimovanje implements Put, Comparable<Put>{
	private String naziv;
	private int dani;
	private int cena;
	private int skiPas;

	public Zimovanje(String _naziv, int _dani, int _cena, int _skiPas) {
		naziv = _naziv;
		if(_dani > 2)
			dani = _dani;
		else
			dani = 3;
		cena = _cena;
		skiPas = _skiPas;
	}
	
	public int compareTo(Put o) {
		if(this.cena() > o.cena()) return 1;
		else if (this.cena() < o.cena()) return -1;
		else return 0;
	}

	public double cena() {
		return dani * cena + (skiPas * (dani - 2));
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
