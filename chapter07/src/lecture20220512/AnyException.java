package lecture20220512;

public class AnyException extends Exception {
	
	private String zusatzinfo;

	public AnyException(String message, String zusatzinfo) {
		super(message);
		this.zusatzinfo = zusatzinfo;
	}
	public AnyException(String message, String zusatzinfo, Throwable cause) {
		super(message, cause);
		this.zusatzinfo = zusatzinfo;
	}
	
	public String getZusatzinfo() {
		return zusatzinfo;
	}
	
	public String toString() {
		return super.toString() + " => " + zusatzinfo;
	}

}
