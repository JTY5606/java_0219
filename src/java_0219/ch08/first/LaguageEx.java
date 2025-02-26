package java_0219.ch08.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class LaguageEx {

	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<>();
		List<String> friends = new Vector<>();
		
		System.out.println("friends.size(): " + friends.size());

		friends.add("Tony");
		friends.add("Tiffany");
		friends.add("Jeniffer");
		friends.add("John");
		friends.add("Tom");
		friends.add("Andrew");
		friends.add("Tiger");
		friends.add("Selly");
		
		System.out.println("test.size(): " + friends.size());
		
		System.out.println("==================");
		for(int i = 0; i < friends.size(); i++) {
			System.out.println("test.get(i):" + friends.get(i));
		}
		System.out.println("==================");
		for(String friend: friends) {
			System.out.println("friend :" + friend);
		}
		System.out.println("==================");
//		test.remove(1);
//		test.remove("Tony");
//		test.removeAll(test);
//		
//		System.out.println("test.size(): " + test.size());
		
		List<String> vector = new ArrayList<>();

	}

}
