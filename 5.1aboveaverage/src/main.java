import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		double sum = 0;
		int cnt = 0;
		int[] numbers = new int[100];
		Scanner in = new Scanner(System.in);
		do {
			numbers[cnt] = in.nextInt();
			sum += numbers[cnt];
			cnt ++;
		}while(numbers[cnt] != -1);//这里只能用while不能用do-while，因为会先输入-1，之后while的时候，-1后边没有-1用于做判断了
		
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
