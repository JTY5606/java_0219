package java_0219.ch04.fifth;

public class People {

	public static void main(String[] args) {
		
		User user = new User ();
		user.showMyName();
		
		
		Admin admin = new Admin();
		admin.showMyName();

		
		Member member = new User();
		member.showMyName();
	}

}
