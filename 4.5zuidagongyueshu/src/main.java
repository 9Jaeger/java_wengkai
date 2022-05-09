import java.util.Scanner; //这个有误
public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int max = 0;
		int min = 0;
		if(a >= b) {
			max = b;
			min = a;
		} else {
			max = a;
			min = b;
		}
		
		int yuemin = 0;
		int yuemax = 0;
		for(int i = 2; i < min; i++) { //还没算后边的i就先做判断了
			if(min % i == 0) {
				yuemin = i;
			}
			for(int j = 2; j < max; j++) {
				if(max % j == 0) {
					yuemax = j;
					if(yuemin == yuemax) {
						System.out.print(yuemin);
					} else {
						System.out.print("none");
					}
				}
			}
		}
		
	}
}