
public class Gost extends Covek {
	private Konobar mojKonobar;
	
	public Gost() {
		super();
		mojKonobar = null;
	}
	
	public Gost(Narudzbina na) {
		super(na);
	}
	
	public Gost(String na) {
		super(new Narudzbina(na));
		System.out.println("Kreiran gost " + na);
	}

	public void primi() {
		po = mojKonobar.usluzi();
	}
	
	public void izjasniSe() {
		mojKonobar.primi(this.na);
	}
	
	public String feedback() {
		if(po == null) {
			return "Pretnja";
		}
		else if(po.toString().equals(na.toString())) {
			return "Zadovoljan";
		}
		else {
			return "Nezadovoljan";
		}
	}

	public void setMojKonobar(Konobar mojKonobar) {
		this.mojKonobar = mojKonobar;
	}
}
