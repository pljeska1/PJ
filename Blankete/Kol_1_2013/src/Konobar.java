
public class Konobar extends Covek{
	private String ime;
	private double promili;
	
	public String ime() {
		return ime;
	}
	
	public Narudzbina getNar() {
		return na;
	}
	
	public Konobar(String ime) {
		super();
		this.ime = ime;
		this.promili = Math.random() * 3.0;
		System.out.println("Kreiran Konobar " + ime + " pijanost " + promili);
	}
	
	//GOST
	
	public String feedback() {
		if(promili > 1.0) {
			return "OK!";
		}
		else 
			return "Boli me glava";
	}
	
	public void primi(Narudzbina n) {
		if(promili < 1.0)
			this.na = n;
		else if(promili < 2.0) {
			if((int)(Math.random()*10) < 5)
				this.na = n;
			else
				this.na = new Narudzbina("cvarke kavurma brlja");
		}
		else
			this.na = new Narudzbina("cvarke kavurma brlja");
	}
	
	
	public Porcija usluzi() {
		return po;
	}
	
	//KUVAR
	
	public Narudzbina izdeklamuj() {
		return na;
	}

	public void pokupi(Porcija por) {
		po = por;
	}
	
}
