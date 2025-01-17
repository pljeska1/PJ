package korespondencija;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mail implements Poruka, Comparable<Poruka>{
	private String adresa;
	private String text;
	
	public Mail(String adresa, String text) {
		this.adresa = adresa;
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
		if(adresa.contains("@")) {
			return text.length();
		}
		else
			return -1;
	}

	
	public void ispisi() {
		System.out.println("Mail primalac: " + adresa + " Sadrzaj: " + text);
	}


	public void arhiviraj() {
		try {
			String[] pom = adresa.split("@");
			FileWriter f = new FileWriter(pom[0] + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write(text);
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
