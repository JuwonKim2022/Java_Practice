package sec01.ex01_variable;

public class LiteralEx {

	public static void main(String[] args) {
		
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010;
		System.out.println(var2);
		
		int var3 = 0x10;
		System.out.println(var3);
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);

		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '한';
		System.out.println(var7);
		
		System.out.println("\t들여쓰기");
		System.out.println("대한\n민국");
		System.out.println("대한\r민국");
		System.out.println("This is \"LOL\"");
		System.out.println("이것은\'자바다\'");
		System.out.println("가격이\\300\\입니다");
		
		char var8 = '\u0041';   //16진수
		System.out.println(var8);
		
		System.out.println("대한"+"민국"); //문자열 결합 연산자
		System.out.println("Java"+8); //문자열 결합 연산자
		
		String var9 = "JAVA";
		System.out.println(var9);
		
		boolean var10 = true;
		boolean var11 = false;
		System.out.println(var10);
		System.out.println(var11);
		
	}

}