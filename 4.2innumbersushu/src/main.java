import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		for(int n = 2; n < number; n++) {
			int isPrime = 1;
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				System.out.print(n+" ");
			}
		}
	}
}
