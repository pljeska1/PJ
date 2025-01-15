
public abstract class Covek {
	protected Narudzbina na;
	protected Porcija po;
	
	public Covek() {
		na = null;
		po = null;
	}
	
	public Covek(Narudzbina na) {
		this.na = na;
		this.po = null;
	}
	
	public abstract String feedback();
}
