package java_0219.ch04.third;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	

}
