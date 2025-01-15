
public class Narudzbina {
	private String nar;

	public Narudzbina(String nar) {
		this.nar = nar;
	}
	
	public String toString() {
		return nar;
	}
	
	public String[] split(String str) {
		String[] rez;
		rez = nar.split(str);
		
		return rez;
	}
	
	public String getNar() {
		return nar;
	}
	
	public void setNar(String nar) {
		this.nar = nar;
	}
	
}
