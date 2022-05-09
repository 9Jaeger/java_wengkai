import java.util.Scanner; 
public class main {
	public static void main(String[] args) {
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1;
		MAIN_LOOP:
			for(int x = 3; cnt < primes.length; x++) {
				for(int i = 0; i < cnt; i++) {
					if(x % primes[i] == 0) {
						continue MAIN_LOOP;
					}
				}
				primes[cnt++] = x;
			}
		for(int k: primes) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}