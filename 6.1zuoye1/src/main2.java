import java.util.Arrays;
import java.util.Scanner;
 
public class main2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        char[] c = new char[a.length()];  //字符类型数组，用来记录输入字符串的每一个字符。目前尚未给c数组赋值，而是设定了其大小。这里不能用int，因为输入的是字符串，而不是单个字符，无法直接用数字表示。见第四行备注
        int[] d=new int[100];   //d数组用于记录第k个单词有多少个字母，c数组用于遍历句子中每一个字母！！！！！important区分两个数组的设置原因及应用方式
        int k=0,m=0,n=0;
        for (int i = 0; i < a.length(); i++){
            c[i] = (char) a.codePointAt(i);   //如果不做类型转换会怎样？如果去掉，就会说无法将int转换成char 'A'.codePointAt(); // 65
            if ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z')||(c[i] == '\'')) {   //假设目前c[i]对应了一个B，那'B'>'A'在范围内，可以计算。而如果c数组一开始就是int类型的，就无法对接输入的字符串，且在这里的条件设置还需要知道unicode编码，就会很麻烦
                m++;
                d[k]=m;          //数组还不会用
            }
            else if (c[i] == ' ') {
               m=0;//碰到空格，用于计算有几个字母的m清零，用于计算有几个单词的k去+1。然后跳出本轮循环，进入下一轮循环。这种数组+循环的应用我不熟练，如果是应用的目的还需要再练习
               k++;
            }
            else if (c[i] == '.')
                break;
        }
        for(int i=0;i<=k;i++){
            if(d[i]!=0){
                System.out.println(d[i]);
            }
        }
    }
}