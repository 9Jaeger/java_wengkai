import java.util.Scanner; 

public class main2 {
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 6, 7, 8, 5, 9};
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int isExit = -1;
		for(int i = 0; i < data.length; i++) {
			if(num == data[i]) {
				isExit = i;
				break; //有一个就可以break了
			}
			}
		if(isExit == -1) {
			System.out.print("No");
		} else {
			System.out.print("Yes No."+(isExit+1));
		}
	}
}
