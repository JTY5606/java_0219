package java_0219.ch04.first;

public interface RemoteControl {
	
	public static final int MAX_VOULME = 10;
	int MIN_VOLUME = 0;		// public static fianl 생략가능
	final String name = "ansdf";
	
	//추상메서드 :
	public abstract void turnOn();
	void turnOff();		//public abstract 생략가능
	void setVolume(int volume);
}
