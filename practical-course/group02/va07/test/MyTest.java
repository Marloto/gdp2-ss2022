import org.junit.Test;

public class MyTest {
	
	public void playParallel(AudioFile af) {
		Runnable run = new Runnable() {
			public void run() {
				af.play();
			}
		};
		new Thread(run).start();
	}
	
	@Test
	public void testMethod() throws InterruptedException {
		AudioFile af = new AudioFile("audiofiles/Rock 812.mp3");
		playParallel(af);
		Thread.sleep(2000);
		af.stop();
		System.out.println("BLOCKIERT!");
	}
}
