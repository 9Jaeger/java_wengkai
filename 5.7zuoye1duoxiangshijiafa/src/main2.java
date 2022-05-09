import java.util.Scanner;
 
public class main2{
    public static void main(String[] args){
//        System.out.println("请输入你的多项式有多少项");
        Scanner in=new Scanner(System.in);
//        int num1=in.nextInt();
//        System.out.println("第一个数组输入开始");
        int num1=4;//设置默认项数为4项
        int[][] a=new int[num1][2];
        for(int i=0;i<num1;i++){//第一行表示系数，第二行表示幂次
            for(int j=0;j<2;j++){
                a[i][j]=in.nextInt();
            }
        }
//        System.out.println("第一个数组是：");
//        for(int i=0;i<num1;i++){//第一行表示系数，第二行表示幂次
//            for(int j=0;j<2;j++){
//                System.out.print(a[i][j]);
//            }
//        }
//        System.out.println("\n");
//        System.out.println("第二个数组输入开始");
        int[][] b=new int[num1][2];
        for(int i=0;i<num1;i++){//第一行表示幂次，第二行表示系数
            for(int j=0;j<2;j++){
                b[i][j]=in.nextInt();
            }
        }
//        for(int i=0;i<num1;i++){//第一行表示系数，第二行表示幂次
//            for(int j=0;j<2;j++){
//                System.out.print(a[i][j]);
//            }
//        }
//        System.out.println("\n");
//        System.out.println("准备相加");
        int[][] c=new int[num1][2];
        for(int i=0;i<num1;i++){//第一行表示幂次，第二行表示系数
                c[i][1]=a[i][1]+b[i][1];
                c[i][0]=a[i][0];
        }
//        System.out.println("相加后的结果是");
        for(int i=0;i<num1-1;i++){//先输出系数，再输出幂次
            System.out.print(c[i][1]+"x"+c[i][0]+"+");
        }
        System.out.print(c[num1-1][1]);
    }
}