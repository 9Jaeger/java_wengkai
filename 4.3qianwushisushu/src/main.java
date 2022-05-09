import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Number = in.nextInt();
		
		int count = 1;
		int n = 3;
		
		while(count <= Number) {
			int isPrime = 1;
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					if(n == 2 && i == 2) {
						isPrime = 1;
					} else {
						isPrime = 0;
						break;
					}
				}
			}
			if(isPrime == 1) {
				System.out.print(n+" ");
				count++;
			}
			n++;
		}
		}
	}
