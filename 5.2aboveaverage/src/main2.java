import java.util.Scanner; 

public class main2 {
	public static void main(String[] args) {
		double sum = 0;
		int x;
		int cnt = 0;
		int[] numbers = new int[100];
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		while(x != -1){ 
			numbers[cnt] = x;
			sum += x;
			cnt ++;
			x = in.nextInt();
		}
		
		if(cnt > 0) {
			double average = sum / cnt;
			for(int i = 0; i < cnt; i++) {
				if(numbers[i] > average) {
					System.out.println(numbers[i]);
				}
			}
		}
	}
}
