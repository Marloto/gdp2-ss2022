import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import studiplayer.basic.BasicPlayer;

public class SomeTest {
//	@Before
//	public void setUp() {
//		
//	}
	
	public void playAudioFile(AudioFile audioFile) {
		Runnable runnable = new Runnable() {
			public void run() {
				BasicPlayer.play(audioFile.getPathname());
			}
		};
		new Thread(runnable).start();
	}
	
	public void sleep(long ms) {
		try {
			Thread.sleep(2000); // in ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_something() {
		AudioFile audioFile = new AudioFile("audiofiles/Rock 812.mp3");
		//BasicPlayer.play(audioFile.getPathname());
		//System.out.println("Blockierend");
		playAudioFile(audioFile);
		sleep(1000);
	}
}
