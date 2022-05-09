import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int sum = 0;
		
		int num2 = num;
		while(num2 > 0) {
			num2 /= 10;
			count++;
		}
			
		for(int i = 0; i < count; i++) {
			int c = num % 10;
			sum = sum * 10 + c;
			num /= 10;
		}
		
		while(sum > 0){
			int out = sum % 10;
			sum /= 10;
			System.out.print(out+" ");
		}
		
	}
}