public class Football extends Game{
	@Override
	public void startPlay() {
		System.out.println("Football game started");
	}
	@Override
	public void endPlay() {
		System.out.println("Football game ended");
	}
	@Override
	public void initialize() {
		System.out.println("Football game initialized");
	}
}