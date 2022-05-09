import java.util.Scanner; 
public class main {
	public static void main(String[] args) {
		double sum = 0;
		Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();  //与5.2区分：5.2的cnt是[]中的下标数字，输入多少是多少，此处是下标的上限，即数组实际大小，并不用于做下标。  第一次需要输入数组大小
		if(cnt > 0) {
			int[] numbers = new int[cnt]; //定义数组并设定大小
			for(int i = 0; i < cnt; i++) {
				numbers[i] = in.nextInt();
				sum += numbers[i];
			}
			double average = sum / cnt;
			for(int i = 0; i < cnt; i++) {
				if(numbers[i] > average) {
					System.out.print(numbers[i]+" ");
				}
			}
		}
	}
}
