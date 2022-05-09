import java.util.Scanner;

public class main {
	public static void main(String[] args){
		 Scanner in=new Scanner(System.in);
		 String s = new String();
		 s = in.nextLine();
		 
		 int loc = s.indexOf(" ");    //不知道怎么写成循环
		 for(int i = 0; i <= loc; i++) { //我这种写法只循环了第一个单词，不可能设置出第二个单词循环的第一个字母和结束的字母，也就无法输出后边的内容
			 if(i == s.indexOf(" ")) {
				 System.out.print(i);
			 }
		 }
	}
}
