import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int num2 = num;
		int num3 = num;
		int sum = 0;
		while(num2 != 0) {
			count++;
			num2 /= 10;
		} 
		
		if(num3 < 0) {
			System.out.print("fu ");
		}
		
		for(int i = 0; i < count; i++) {
			int n = num % 10;
			if(n == 0) {
				System.out.print("ling ");  //0会先计算出来，但是要靠后出现，不知道如何实现
			}
			sum = sum * 10 + n;
			num /= 10;
		}
		
		
		int j = 0;
		int counta = 0;
		while(sum != 0) {  //这里改成while(sum != 0)也行
			j = Math.abs(sum) % 10;
			counta++;
			switch(j) {
			case 1: System.out.print("yi"); break;
			case 2: System.out.print("er"); break;
			case 3: System.out.print("san"); break;
			case 4: System.out.print("si"); break;
			case 5: System.out.print("wu"); break;
			case 6: System.out.print("liu"); break;
			case 7: System.out.print("qi"); break;
			case 8: System.out.print("ba"); break;
			case 9: System.out.print("jiu"); break;
			}
			if(counta < count) {
				System.out.print(" "); 
			}
			sum /= 10;
		}	
	}
}
