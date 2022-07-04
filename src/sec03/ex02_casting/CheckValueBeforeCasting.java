package sec03.ex02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 128;
		int j = 127;
//		byte b = i;
		
		if(i<-128||i>127) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
		System.out.println("==========================");
		if(j<Byte.MIN_VALUE||j>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte)j;
			System.out.println(b);
		}
		
	}

}
