import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int BJT = in.nextInt();
		int UTC;
		if(BJT >= 800) {
			UTC = BJT - 800;
		}else {
			UTC = BJT - 800 + 2400;
		}
		
		if(UTC / 10 < 1) {
			System.out.println("0"+UTC);
		} else {
			System.out.println(UTC);
		}
	}
}
