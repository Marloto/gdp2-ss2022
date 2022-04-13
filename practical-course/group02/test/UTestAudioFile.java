import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UTestAudioFile {
	@Test
	public void test_parsePathname_01() {
		AudioFile file1 = new AudioFile();
		file1.parsePathname("file.mp3");
		//System.out.println(file1.getPathname());
		assertEquals("file.mp3", file1.getPathname()); 
		// strg+leertaste für import
	}
	
	@Test
	public void test_parsePathname_02() {
		AudioFile file2 = new AudioFile();
		file2.parsePathname("");
		//System.out.println(file2.getPathname());
		assertEquals("", file2.getPathname());
	}
}
