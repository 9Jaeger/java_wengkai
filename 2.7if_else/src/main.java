import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int max;
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println(max);
	}
}
