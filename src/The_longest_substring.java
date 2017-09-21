/*
 * Created by 小陈 on 2017/9/20.
 * 最长公共子串的长度，相等返回-1
 */
import java.util.Scanner;

public class The_longest_substring {
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solve(String s1, String s2) {
        if(s1.equals(s2)) return -1;
        else{
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            int len1 = s1.length();
            int len2 = s2.length();
            String min = null;
            String max = null;
            String target = null;
            min = len1 <= len2 ? s1 : s2;
            max = len1 > len2 ? s1 : s2;

            //最外层：min子串的长度，从最大长度开始
            for (int i = min.length(); i >= 1; i--) {
                //遍历长度为i的min子串，从0开始
                for (int j = 0; j <= min.length() - i; j++) {
                    target = min.substring(j, j + i);
                    //遍历长度为i的max子串，判断是否与target子串相同，从0开始
                    for (int k = 0; k <= max.length() - i; k++) {
                        if (max.substring(k,k + i).equals(target)) {
                            return i;
                        }
                    }
                }
            }
            return 0;

        }

    }

    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s1;
        try {
            _s1 = in.nextLine();
        } catch (Exception e) {
            _s1 = null;
        }

        String _s2;
        try {
            _s2 = in.nextLine();
        } catch (Exception e) {
            _s2 = null;
        }

        res = solve(_s1, _s2);
        //     System.out.println(String.valueOf(res));
        System.out.println(res);
    }
}
