package sec01.ex01_variable;

public class VariableScopeEx {

	public static void main(String[] args) {
		
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
			
			System.out.println(var2); //출력도 안에서만 가능
		}
		
		var1=10;
	//	var2=20;	범위에 없어서 값 정의 안됨
		
		for (int i = 0; i<1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
			
			System.out.println(var3); //출력도 안에서만 가능
		}
		var1 = 10;
	//	var3 = 30;	범위에 없어서 값 정의 
		
		System.out.println(var1);
	
	}
}
