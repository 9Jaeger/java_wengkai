import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner in = new Scanner(System.in);
		int x;
		x = in.nextInt();
		while(x != -1) {
			numbers[x] ++;
			x = in.nextInt();
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i+":"+numbers[i]);
		}
	}
}
