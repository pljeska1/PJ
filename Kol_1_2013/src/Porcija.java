
public class Porcija {

	private String jelo;
	private String dezert;
	private String pice;
	
	public Porcija(String jelo, String dezert, String pice) {
		this.jelo = jelo;
		this.dezert = dezert;
		this.pice = pice;
	}
	
	public String toString() {
		return jelo + " " + dezert + " " +pice;	
	}
	
}
