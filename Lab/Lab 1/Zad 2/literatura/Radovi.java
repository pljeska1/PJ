package literatura;

import java.io.*;

public class Radovi implements Referenca, Comparable<Referenca>{
	private int god;
	private int ISBN;

	public Radovi(int god, int ISBN) {
		this.god = god;
		this.ISBN = ISBN;
	}

	public int retGod() {
		return god;
	}

	public void upisi() {
		try {
			FileWriter f = new FileWriter(Integer.toString(god) + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			int pom = ISBN % 10;
			b.write(Integer.toString(pom));
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
