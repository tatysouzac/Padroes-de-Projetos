package Builder;

public class StrogonoffFazer {
	
	private StrogonoffBuilder strogonoffBuilder;
	
	public StrogonoffFazer(StrogonoffBuilder strogonoffBuilder) {
		this.strogonoffBuilder = strogonoffBuilder;
	}
	
	public Strogonoff getStrogonoff() {
		return this.strogonoffBuilder.getStrogonoff();
	}
	
	public void fazerStrogonoff() {
		this.strogonoffBuilder.fazerArroz();
		this.strogonoffBuilder.fazerBatataPalha();;
		this.strogonoffBuilder.fazerCarneouFrango();;
				
	}
}
