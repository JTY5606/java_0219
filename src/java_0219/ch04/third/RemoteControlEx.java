package java_0219.ch04.third;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		Television television = new Television();
		television.turnOff();
		
		RemoteControl remoteControl = new Settbox();
		remoteControl.turnOn();
		
		

	}

}
