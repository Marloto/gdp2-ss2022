import java.io.File;
import java.util.Map;

import studiplayer.basic.BasicPlayer;
import studiplayer.basic.TagReader;

public class AudioFile {
	private String pathname;

	public AudioFile() {
	}
	public AudioFile(String pathname) {
		this.pathname = pathname;
	}
	public String getPathname() {
		return pathname;
	}

	public void play() {
		BasicPlayer.play(pathname);
	}
	
	public static void main(String[] args) {
		// File
		String pathname = "audiofiles/Rock 812.mp3";
		File file = new File(pathname); // java.io.File
		boolean exists = file.exists();
		if(!exists) {
			// Exceptions
			throw new RuntimeException("Lied existiert nicht: " + pathname);
		}
		
		// Lied abspielen
		// BasicPlayer.play(pathname);
		// BasicPlayer.stop(); // stoppt das aktuelle Lied
		// BasicPlayer.togglePause(); // pausiert oder spielt das aktuelle Lied ab
		
		// Maps: Key-Value-Datenstruktur
		Map<String, Object> readTags = TagReader.readTags(pathname); // studiplayer.basic.TagReader
//		for(String key: readTags.keySet()) {
//			System.out.println(key + "=" + readTags.get(key));
//		}
		Object x = readTags.get("author");
		if(x instanceof String) {
			String author = (String)x;
			System.out.println(author);
		}
		Object x2 = readTags.get("duration");
		if(x2 instanceof Long) {			
			Long duration = (Long) x2;
			System.out.println(duration);
		}
		Object x3 = readTags.get("something");
		if(x3 instanceof String) {
			System.out.println(x3);
		}
	}
	public void stop() {
		BasicPlayer.stop();
	}
	
}
