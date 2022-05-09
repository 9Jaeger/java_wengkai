import java.util.Scanner; 

public class main {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 6, 7, 8, 5, 9};
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0; i < data.length; i++) {
			if(num == data[i]) {
				System.out.print("Yes "+num);
				break;
			} else {
				System.out.print("No");    //这里不对，必须全部循环完了都没有，才能输出no
			}
		}
	}
}
