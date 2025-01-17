package literatura;

import java.io.*;

public class Knjige implements Referenca, Comparable<Referenca>{
	private int god;
	private String naslov;
	
	public Knjige(int god, String naslov) {
		this.god = god;
		this.naslov = naslov;
	}
	

	public int retGod() {
		return god;
	}

	public void upisi() {
		try {
			FileWriter f = new FileWriter(Integer.toString(god) + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			String[] pom = naslov.split(" ");
			b.write(pom[0]);
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public int compareTo(Referenca o) {
		if(this.retGod() > o.retGod()) return 1;
		else if (this.retGod() < o.retGod()) return -1;
		else return 0;
	}

}
