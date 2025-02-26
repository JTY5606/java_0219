package java_0219.ch03.first;

public class DmbCellPhone extends CellPhone{
	DmbCellPhone(String model,String color){
		super(model,color);
	}
	
//	마우스 우클릭 > 소스 > 오버라이드 누르면 됨.
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("dmbCellPhone을 켭니다.");
	}
	
//	void powerOn() {
//		System.out.println("dmbCellPhone을 켭니다.");
//	}
}
