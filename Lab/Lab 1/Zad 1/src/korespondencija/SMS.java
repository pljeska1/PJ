package korespondencija;
import java.io.*;

public class SMS implements Poruka, Comparable<Poruka>{
	private int brojTel;
	private String text;
	
	public SMS(int brojTel, String text) {
		this.brojTel = brojTel;
		this.text = text;
	}

	public String retText() {
		return text;
	}
	
	public int compareTo(Poruka o) {
		if(this.retText().length() > o.retText().length()) return 1;
		else if(this.retText().length() < o.retText().length()) return -1;
		return 0;
	}


	public int validiraj() {
		if(Integer.toString(brojTel).length() >= 9) {
			return text.length();
		}
		else 
			return -1;
	}

	
	public void ispisi() {
		System.out.println("SMS broj telefona: " + brojTel + " Sadrzaj: " + text);
	}


	public void arhiviraj() {
		try {
			FileWriter f = new FileWriter(Integer.toString(brojTel) + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write(text);
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
