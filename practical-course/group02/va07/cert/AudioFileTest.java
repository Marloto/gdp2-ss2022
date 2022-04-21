import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;

public class AudioFileTest {
	@SuppressWarnings("rawtypes")
	private Class clazz = AudioFile.class;
	private char sepchar = System.getProperty("file.separator").charAt(0);
	private AudioFile f1;
	private AudioFile f2;
	private AudioFile f3;

	@Before
	public void setup() {
		// Initializer block
		// This checks the proper connection of constructors already

        try {
            // Activate exactly one the following lines
            // in order to define the emulation you like
            // Usually, the first line (no emulation) is active
            //
            //EmulateOtherOs.reset(); // no emulation
            //EmulateOtherOs.emulateWindows();
            //EmulateOtherOs.emulateLinux();
            //EmulateOtherOs.emulateMac();
        } catch (Exception e) {
			fail("Problem beim Einstellen des OS: " + e.getMessage());
        }

		f1 = new WavFile("audiofiles/wellenmeister - tranquility.wav");
		f2 = new TaggedFile("audiofiles\\\\\\Rock 812.mp3");
		f3 = new TaggedFile("audiofiles/wellenmeister_awakening.ogg");
	}

	@Test
	public void testGetPathname() {
		assertEquals("Pathname not correct", "audiofiles" + sepchar + "wellenmeister - tranquility.wav",
				f1.getPathname());
		assertEquals("Pathname not correct", "audiofiles" + sepchar + "Rock 812.mp3", f2.getPathname()); // ***
		assertEquals("Pathname not correct", "audiofiles" + sepchar + "wellenmeister_awakening.ogg", f3.getPathname());
	}

	@Test
	public void testGetFilename() {
		assertEquals("Filename not correct", "wellenmeister - tranquility.wav", f1.getFilename());
		assertEquals("Filename not correct", "Rock 812.mp3", f2.getFilename()); // ***
		assertEquals("Filename not correct", "wellenmeister_awakening.ogg", f3.getFilename());
	}

	@Test
	public void testGetAuthor() {
		assertEquals("Author not correct", "wellenmeister", f1.getAuthor());
		assertEquals("Author not correct", "Eisbach", f2.getAuthor()); // ***
		assertEquals("Author not correct", "Wellenmeister", f3.getAuthor());
	}

	@Test
	public void testGetTitle() {
		assertEquals("Author not correct", "tranquility", f1.getTitle());
		assertEquals("Author not correct", "Rock 812", f2.getTitle()); // ***
		assertEquals("Author not correct", "TANOM Part I: Awakening", f3.getTitle());
	}

	// Test the toString implementations of concrete classes TaggedFile and
	// WavFile
	@Test
	public void testToString() {
		assertEquals("toString not correct", "wellenmeister - tranquility - 02:21", f1.toString());
		assertEquals("toString not correct", "Eisbach - Rock 812 - The Sea, the Sky - 05:31", f2.toString()); // ***
		assertEquals("toString not correct",
				"Wellenmeister - TANOM Part I: Awakening - TheAbsoluteNecessityOfMeaning - 05:55", f3.toString());
	}

	@Test
	public void testNonExisting() {
		// Creating an AudioFile object for a non-existing file should raise
		// exception
		try {
			new WavFile("does not exist.wav");
			fail("Expecting exception due to a non-existing file");
		} catch (RuntimeException e) {
			// Expected
		}
		try {
			new TaggedFile("does not exist.mp3");
			fail("Expecting exception due to a non-existing file");
		} catch (RuntimeException e) {
			// Expected
		}
	}

	@Test
	public void testAbstract() {
		int mod = clazz.getModifiers();
		assertTrue("Class AudioFile is not declared abstract", Modifier.isAbstract(mod));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAbstractMethods() {
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("play", "void");
		hm.put("togglePause", "void");
		hm.put("stop", "void");
		hm.put("getFormattedDuration", "java.lang.String");
		hm.put("getFormattedPosition", "java.lang.String");
		String goneWrong = null;
		try {
			for (String methName : hm.keySet()) {
				goneWrong = methName;
				Method meth = clazz.getDeclaredMethod(methName, (Class[]) null);
				assertEquals("Wrong return type for " + methName, meth.getReturnType().getName(), hm.get(methName));
				int mod = meth.getModifiers();
				assertTrue("AudioFile." + methName + " is not declared abstract", Modifier.isAbstract(mod));
			}
		} catch (SecurityException e) {
			fail(e.toString());
		} catch (NoSuchMethodException e) {
			fail("Method " + goneWrong + " does not exist");
		}
	}

	@Test
	public void testFields() {
		assertEquals("Array returned by method fields() is not correct for *.wav file",
				"[wellenmeister, tranquility, , 02:21]", Arrays.asList(f1.fields()).toString());
		assertEquals("Array returned by method fields() is not correct for *.mp3 file",
				"[Eisbach, Rock 812, The Sea, the Sky, 05:31]", Arrays.asList(f2.fields()).toString()); // ***
		assertEquals("Array returned by method fields() is not correct for *.ogg file",
				"[Wellenmeister, TANOM Part I: Awakening, TheAbsoluteNecessityOfMeaning, 05:55]",
				Arrays.asList(f3.fields()).toString());
	}

	@Test
	public void testNullTags() {
		AudioFile f = null;
		// The file "audiofiles/kein.wav.sondern.ogg" does not contain tags for author
		// and title
		// We expect that title is derived from filename!
		try {
			f = new TaggedFile("audiofiles/kein.wav.sondern.ogg");
		} catch (NullPointerException e) {
			fail("NullPointerException for TaggedFile with null tags");
		} catch (RuntimeException e) {
			fail("File does not exist " + e);
		}
		assertEquals("Wrong author", "", f.getAuthor());
		assertEquals("Wrong title", "kein.wav.sondern", f.getTitle());
	}
}
