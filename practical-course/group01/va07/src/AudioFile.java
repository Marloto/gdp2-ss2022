import java.io.File;
import java.util.Map;

import studiplayer.basic.BasicPlayer;
import studiplayer.basic.TagReader;

public class AudioFile {
	private String pathname;

	public AudioFile(String pathname) {
		this.pathname = pathname;
	}
	
	public String getPathname() {
		return pathname;
	}
	
	public static void main(String[] args) {
		// File + Exceptions
		AudioFile audioFile = new AudioFile("audiofiles/Rock 812.mp3");
		File file = new File(audioFile.getPathname());
		
		if(!file.exists()) {
			//System.out.println("Existiert!");
			throw new RuntimeException("Datei nicht gefunden: " + audioFile.getPathname());
		}
		
		// Abspielen
		//BasicPlayer.play(audioFile.getPathname()); // <- verweilt in der 
		  // Methode, bis vollständig abgespielt!
		System.out.println("Blockierend?");
//		BasicPlayer.stop();
//		BasicPlayer.togglePause();
//		BasicPlayer.getPosition();
		
		// Maps
		// studiplayer.basic.TagReader
		Map<String, Object> readTags = TagReader.readTags(audioFile.getPathname());
		
		// readTags.get(readTags);
		// readTags.keySet();
		
		//               hier können nicht nur Arrays hin?!
		for(String key : readTags.keySet()) {
			Object object = readTags.get(key);
			System.out.println(key + " = " + object.toString() + 
					"(" + object.getClass().getName() + ")");
		}
		
		Object object = readTags.get("album"); // direkt auf album zugreifen
		// --> ggf. null für kein album
		if (object instanceof String) {
			String album = (String) object;
			System.out.println("What ever... " + album);
		}
		
		Object object2 = readTags.get("duration");
		if (object2 instanceof Long) {
			Long duration = (Long) object2;
			System.out.println("What ever... " + duration);
		}
		
		
		// Trick für Tests
		
	}
}






