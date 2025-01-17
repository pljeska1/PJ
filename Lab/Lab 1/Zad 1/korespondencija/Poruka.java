package korespondencija;

public interface Poruka {
	public abstract int validiraj();
	public abstract void ispisi();
	public abstract void arhiviraj();
	public abstract String retText();
}
