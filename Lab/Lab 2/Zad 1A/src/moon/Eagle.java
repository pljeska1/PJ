package moon;
import java.io.*;

public class Eagle implements Comparable<Eagle>{
	int redBroj;
	int kap;
	
	public Eagle(int _redBroj) {
		redBroj = _redBroj;
		kap = 0;
	}
	
	public void ucitajKap() {
		try {
			FileReader f = new FileReader(Integer.toString(redBroj) + ".txt");
			BufferedReader b = new BufferedReader(f);
			kap = Integer.valueOf(b.readLine());
			b.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public int getRed() {
		return redBroj;
	}
	
	public int getKap() {
		return kap;
	}
	
	public int compareTo(Eagle o) {
		if(this.getKap() > o.getKap()) return 1;
		if(this.getKap() < o.getKap()) return -1;
		return 0;
	}
}
