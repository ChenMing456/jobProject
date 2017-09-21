import java.util.Scanner;
/*
 * Created by 小陈 on 2017/9/10.
 * 今日头条的手珠串问题，输入：5 2 3
3 1 2 3
0
2 2 3
1 2
1 3
输出：相邻的颜色相同的手珠串数量。
2
 */
public class chuan_color {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        String s1=scanner1.nextLine();
        String a1[]=s1.split(" ");
         int n=Integer.parseInt(a1[0]);
        int m=Integer.parseInt(a1[1]);
        int c=Integer.parseInt(a1[2]);
        int count=0;
            for (int i = 0; i < n; i++) {
                int tag=0;
                 String s = scanner1.nextLine();
                if(s.equals('0')) tag=0;
                else {
                    String b[] = s.split(" ");
                        for (int j = 0; j < b.length; j++) {
                            if (Integer.parseInt(b[j]) == 2) tag = 1;
                        }
                    }
                  count=count+tag;

            }
     System.out.println(count-1);
    }
}
