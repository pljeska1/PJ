
public class Main {
	public static void main(String[] args) {
		Restoran papak = new Restoran();
		
		Konobar k1 = new Konobar("Mile");
		Konobar k2 = new Konobar("Zile");
		Konobar k3 = new Konobar("Rile");
		
		Gost g1 = new Gost("aaa aaa aaa");
		Gost g2 = new Gost("bbb bbb ccc");
		Gost g3 = new Gost("ddd ddd ddd");
		Gost g4 = new Gost("eee eee eee");
		
		papak.zaposli(k1);
		papak.zaposli(k2);
		papak.zaposli(k3);
		
		papak.ugosti(g1);
		papak.ugosti(g2);
		papak.ugosti(g3);
		papak.ugosti(g4);
		
		papak.posluzi();
	}
}
