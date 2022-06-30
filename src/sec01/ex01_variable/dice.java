package sec01.ex01_variable;

public class dice {

	public static void main(String[] args) {
		
		int count=0;
		int ab = 0;
	
		while(ab<6) {
			++count;
			ab = (int)(Math.random()*6+1);
			System.out.println(count+"\t\t"+ab);
		}
		
	}

}
