import java.util.Scanner;

public class main {
	
	public static Boolean isPrime(int i) {
		  boolean isPrime = true;
		  for (int k = 2; k < i; k++) {
			  if(i % k == 0) {
				  isPrime = false;
				  break;
			  }
		  }
		  return isPrime;
	  }
	
	  public static void main(String[] args){
		  Scanner in=new Scanner(System.in);
		  int m = in.nextInt();
		  int n = in.nextInt();
		  if(m == 1) {
			  m = 2;
		  }
		  int  cnt = 0;
		  int sum = 0;
		  for(int i = m; i <= n; i++) {
			  if(isPrime(i)) {
				  cnt++;
				  sum += i; 
			  }
		  }
		  System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数");  
	  }
}
