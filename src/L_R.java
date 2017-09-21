import java.util.Scanner;

/**
 * Created by 小陈 on 2017/9/16.
 */
public class L_R {
    public static void main(String[] args) {
        
        Scanner scanner1=new Scanner(System.in);
        String s1=scanner1.nextLine();
        String a1[]=s1.split("");
        int count=a1.length;
        if(a1.length>=1&&a1.length<=Math.pow(10,5)){
         for(int i=0;i<a1.length-1;i++) {
             if ((a1[i].equals('L') | a1[i].equals('R')) && (a1[i + 1].equals('L') | a1[i + 1].equals('R'))) {
                 if (a1[i] != a1[i + 1]) {
                     count--;
                 }
             }

         }
            System.out.print(count+1);
        }
        else System.out.print("输入长度超出限制！");
    }
}
