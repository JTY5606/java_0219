package java_0219.ch08.Third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("장원영키", 170 );
		friends.put("전지현키", 171 );
		friends.put("장동건키", 172 );
		friends.put("조인성키", 173 );
		friends.put("고소영키", 174 );
		
//		friends.remove("고소영키");
		
		for(String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey + ": strValue : " + strValue);
			
		}
		

	}

}
