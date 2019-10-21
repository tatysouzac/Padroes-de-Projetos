package Builder;

public class TesteBuilder {

	public static void main(String[] args) {
		StrogonoffBuilder  tradicional = new OldStrogonoff();
		StrogonoffFazer  fazer = new StrogonoffFazer(tradicional);
		fazer.fazerStrogonoff();
		Strogonoff  strogonoff = fazer.getStrogonoff();
		System.out.println("Strogonoff pronto, Ingredientes:");
		System.out.println(strogonoff.getArroz());
		System.out.println(strogonoff.getCarne_frango());
		System.out.println(strogonoff.getBatataPalha());
	}
}
