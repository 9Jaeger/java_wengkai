package homework1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int F = 0;
		F = in.nextInt();
		int C = 0;
		C = 5 * (F - 32) / 9;
		System.out.println(C);
		
	}
}
