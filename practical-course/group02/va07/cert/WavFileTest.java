import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class WavFileTest {
    @SuppressWarnings("rawtypes")
    private Class clazz = WavFile.class;
    private WavFile f1;

    @Before
    public void setup() {
    	// Initializer block
    	// This checks the proper connection of constructors already

        try {
            f1 = new WavFile("audiofiles/wellenmeister - tranquility.wav");
        } catch (Exception e) {
        	fail("Problem beim Erzeugen der AudioFile-Objekte: " + e.getMessage());
        }
    }

    @Test
    public void testSuperClass() {
        assertEquals("WavFile ist not derived from SampledFile",
                "SampledFile", clazz.getSuperclass()
                        .getName());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testConstructor() {
        try {
            clazz.getDeclaredConstructor(new Class[] { String.class });
        } catch (SecurityException e) {
            fail(e.toString());
        } catch (NoSuchMethodException e) {
            fail("Constructor WavFile(String) does not exist");
        }
    }

    // Test the toString implementation in class WavFile
    @Test
    public void testToString() {
        assertEquals("toString not correct",
                "wellenmeister - tranquility - 02:21", f1.toString());
    }

    @Test
    public void test_computeDuration_01() {
        assertEquals("Wrong time format", 100000000L,
                WavFile.computeDuration(1000L, 10.0f));
        assertEquals("Wrong time format", 2000000L,
                WavFile.computeDuration(88200L, 44100.0f));
        assertEquals("Wrong time format", 141400816L,
                WavFile.computeDuration(6235776L, 44100.0f));
    }

    @Test
    public void test_readAndSetDurationFromFile_01() {
        assertEquals("Wrong author", "wellenmeister", f1.getAuthor());
        assertEquals("Wrong title", "tranquility", f1.getTitle());
        assertEquals("Wrong duration", "02:21", f1.getFormattedDuration());
    }

    // Test the fields() implementation in class WavFile
    @Test
    public void test_fields_01() {
        assertEquals("Wrong fields", "[wellenmeister, tranquility, , 02:21]",
                Arrays.asList(f1.fields()).toString());
    }

    // Class WavFile does not need any attributes
    // They should have been moved to some super class
    @Test
    public void testNrAttributes() {
        assertTrue(
                "Do not define any local variables of methods as attributes?",
                clazz.getDeclaredFields().length == 0);
    }

    @Test
    public void testInvalid() {
        try {
            new WavFile("audiofiles/wellenmeister - tranquility.cut.wav");
            fail("RuntimeException expected for erroneous WAV file wellenmeister - tranquility.cut.wav");
        } catch (RuntimeException e) {
            // Expected
        }
    }

}
