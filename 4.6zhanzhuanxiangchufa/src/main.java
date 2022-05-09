import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = 0;
		while(b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		System.out.print(a);
	}
}