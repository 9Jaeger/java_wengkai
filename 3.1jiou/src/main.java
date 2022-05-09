import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int countji = 0;
		int countou = 0;
		while(number != -1) {
			if(number % 2 == 0) {
				countou++;
			} else {
				countji++;
			}
			number = in.nextInt();
		}
		System.out.print(countji+" "+countou);
	}
}
