import java.util.Scanner;  //main2是网上复制

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = new int[100];
		int i = 0;
		for(; i >= 0; i--){      //调试过，无法输入i=0的情况，无法输出
			i = in.nextInt();
			data[i] += in.nextInt();
			System.out.print("i:"+i+" data[i]"+data[i]);
		}
		for(int j = data.length; j >= 0; j--) { //上边的循环，按照题意，不能用-1断开，所以根本出不了循环；而且有两次输入0，所以无法按照0特殊设置
			if(data[i] != 0) {
				if(i == 1) {
					System.out.print(data[i]+"x");
				} else if(i == 0) {
					System.out.print(data[i]);
				} else{
					System.out.print(data[i]+"x"+i);	
				}
			}
		}
	}
}
