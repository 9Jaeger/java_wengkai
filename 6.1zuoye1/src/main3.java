import java.util.Arrays;
import java.util.Scanner;

public class main3 {
	  public static void main(String[] args){
	        Scanner input=new Scanner(System.in);
	        String a=input.nextLine();
	        char[] c = new char[a.length()];
	        int[] d = new int[100];
	        int k = 0, m = 0, n = 0;
	        for(int i = 0; i < a.length(); i++) {
	        	c[i] = (char)a.codePointAt(i);
	        	if((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] == '\'')) {
	        		m++;
	        		d[k] = m;
	        	} else if(c[i] == ' ') {
	        		m = 0;
	        		k++;
	        	} else if(c[i] == '.') {
	        		break;
	        	}
	        }
	        for(int i = 0; i <= k; i++) {
	        	System.out.println(d[i]);
	        }
	  }
}
