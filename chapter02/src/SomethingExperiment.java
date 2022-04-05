
import firstlevel.secondlevel.thirdlevel.Something;
import firstlevel.secondlevel.thirdlevel.*; // Wildcard!
import static firstlevel.secondlevel.thirdlevel.Something.*; // Wildcard!
import static firstlevel.secondlevel.thirdlevel.Something.doOtherthing; // Wildcard!
import java.util.Scanner;

public class SomethingExperiment {
	public static void main(String[] args) {
		Something something = new Something(); // existiert nicht mehr!
		new Scanner(System.in);
	}
	
	public static void doSomething(Something param) {
		doOtherthing();
	}
}
