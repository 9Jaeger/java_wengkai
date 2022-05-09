import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				isPrime = 0;
				break;
			}
		}
		if(isPrime == 1) {
			System.out.print(n+"yes");
		} else {
			System.out.print(n+"no");
		}
	}
}
