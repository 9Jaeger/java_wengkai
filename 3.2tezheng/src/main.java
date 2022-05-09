import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int count = 0;
		int jiou = 0;
		int er = 0;
		while(number > 0) {
			int num = number % 10 ;
			number = number / 10;
			count++;
			if(num % 2 == count % 2) {
				jiou = 1;
			}else {
				jiou = 0;
			}
			int erone = 1;
			int counta = count;
			if(counta == 1) {
				erone = 1;
			} else{
				while(counta > 1) {
						erone = erone * 2;
						counta--;
					}
			}
			if(jiou == 1) {
				er = er + erone;	
			}
			System.out.println("number:"+number+" num:"+num+" count:"+count+" counta:"+counta+" jiou:"+jiou+" er:"+er);
		}
		System.out.print(er);
	}
}
