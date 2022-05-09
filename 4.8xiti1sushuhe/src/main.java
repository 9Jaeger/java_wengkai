import java.util.Scanner;  //这个和2.4比较像，用while做最外边的控制

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int count = 0;
		int num = 2;
		int sum = 0;
		
		while(count < m) {
			int isPrime = 1;
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				count++;
				if(count >= n) {
					sum += num;
				}
			}
			num++;
		}
		
		System.out.print(sum);
	}
}
