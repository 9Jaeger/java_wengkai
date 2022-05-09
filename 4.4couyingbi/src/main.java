import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 50; j++) {
				for(int k = 0; k < 100; k++) {
					if(100 == k + 2 * j + 5 * i) {
						System.out.println("5:"+i+" 2:"+j+" 1:"+k);
					}
				}
			}
		}
	}
}
