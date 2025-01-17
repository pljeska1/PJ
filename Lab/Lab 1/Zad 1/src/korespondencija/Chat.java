package korespondencija;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Chat implements Poruka, Comparable<Poruka>{
	private String username;
	private String text;
	
	public Chat(String username, String text) {
		this.username = username;
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
		if(text.length() > 0) {
			return text.length();
		}
		else
			return -1;
	}

	
	public void ispisi() {
		System.out.println("Chat username: " + username + " Sadrzaj: " + text);
	}


	public void arhiviraj() {
		try {
			FileWriter f = new FileWriter(username + ".txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write(text);
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
