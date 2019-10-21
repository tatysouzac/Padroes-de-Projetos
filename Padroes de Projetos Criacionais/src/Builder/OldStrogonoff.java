package Builder;

public class OldStrogonoff implements StrogonoffBuilder{

	private Strogonoff strogonoff;
	
	public OldStrogonoff() {
		this.strogonoff = new Strogonoff();
	}
	
	public void fazerArroz() {
		strogonoff.setArroz("Arroz Branco");
	}

	public void fazerCarneouFrango() {
		strogonoff.setCarne_frango("Frango");;
	}

	
	public void fazerBatataPalha() {
		strogonoff.setBatataPalha("Batata Palha Tradicional");
	}

	
	public Strogonoff getStrogonoff() {
		
		return this.strogonoff;
	}

}
