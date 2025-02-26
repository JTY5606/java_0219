package java_0219.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx {
	
	public static void main(String[] args) {
		
		Set<String> computerLangs = new HashSet<>();
		
		for(String computerLang : computerLangs) {
			System.out.println("computerLang : " + computerLangs);
		}
			computerLangs.add("HTML");
			computerLangs.add("Bootstrap");
			computerLangs.add("CSS");
			computerLangs.add("Javascript");
			computerLangs.add("JAVA");
			computerLangs.add("JAVA");
		
	}

}
