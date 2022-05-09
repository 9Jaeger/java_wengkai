import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		double sum = 0;
		int cnt = 0;
		int[] numbers = new int[100];
		Scanner in = new Scanner(System.in);
		numbers[cnt] = in.nextInt();
		while(numbers[cnt] != -1){ //这里numbers[cnt]就算是-1也能进入循环？？？
			sum += numbers[cnt];
			cnt ++;
			numbers[cnt] = in.nextInt(); //出现上一行备注的原因是，numbers[cnt]这一行放在了循环的第一行，结果numbers[cnt]=-1对应的那个cnt后续就被+1了
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
