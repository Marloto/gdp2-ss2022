import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UTestAudioFile {
	// Strg + Leertaste -> Content Assist
	@Test
	public void test_parsePath_01() {
		// Instanz erzeugen
		AudioFile musik1 = new AudioFile();
		// Pfad vorgeben
		musik1.parsePathname("file.mp3");
		// Vergleichen mit get überprüfen
		String res1 = musik1.getPathname();
//		if("file.mp3".equals(res1)) {			
//			System.out.println("Passt!");
//		}
		assertEquals("file.mp3", res1);
	}
	
	public void test_parsePath_02() {
		AudioFile musik2 = new AudioFile();
		// Pfad vorgeben
		musik2.parsePathname("/my-tmp/file.mp3");
		// Vergleichen mit get überprüfen
		String res2 = musik2.getPathname();
		if("/my-tmp/file.mp3".equals(res2)) {			
			System.out.println("Passt!");
		}
	}
}
