
public class StringReferences {
	public static void main(String[] args) {
	    String s1 = "Hallo";
	    String s2 = "Hallo";
	    String s3 = new String("Hallo");
	    String s4 = "Hal" + "lo";
	    if(s1 == s2) {
	    	System.out.println("s1 == s2");
    	}
	    if(s1 == s3) {
	    	System.out.println("s1 == s3");
    	}
	    if(s1 == s4) {
	    	System.out.println("s1 == s4");
    	}
	}
}
