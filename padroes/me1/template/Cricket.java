public class Cricket extends Game {
	@Override
	public void startPlay() {
		System.out.println("Cricket game started");
	}
	@Override
	public void endPlay() {
		System.out.println("Cricket game ended");
	}
	@Override
	public void initialize() {
		System.out.println("Cricket game initialized");
	}

}