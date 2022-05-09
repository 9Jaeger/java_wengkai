import java.util.Scanner;

public class main {
	public static void sum(int a, int b) {
		int i;
		int sum = 0;
		for(i = a; i <=b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main() {
		sum(1, 10);
		sum(20, 30);
		sum(35, 45);
	}
}
