package sec02.ex01_byte;

public class ByteEx {

	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 125;
		
	//	byte var4 = 128; 범위 벗어나서 오류
		
		var3++;
		System.out.println(var3);
		var3++;
		System.out.println(var3);
		var3++;
		System.out.println(var3);	//수 뒤로 넘어감
		
		byte var4 = 125;
		int var5 = 125;
		
		for(int i=0; i<5; i++) {
			var4++;
			var5++;
			System.out.println("var4 : " + var4 + '\t'+ "var5 : " + '\t'+ var5);
		}
		
	}
}
