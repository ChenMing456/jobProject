/*
 * Created by 小陈 on 2017/8/26.
 *
 *求序列的子串最大和
 * 例：输入：20 -10 2 -1 5
 *     输出子串最大和：27
 */
import java.util.*;
public class max_sub_add {
    public static void main(String[] args) {
        //输入序列
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String in_put = scan.nextLine();
            //将输入序列存入数组str[].
            String[] Str = in_put.split(" ");
            //MIN_VALUE  值为 －231 的常量，它表示 int 类型能够表示的最小值。
            int max = Integer.MIN_VALUE;  //将max初始值设为负值的界限值。
            int cur = 0;
            for (int i = 0; i < Str.length; i++) {
                // 挨个将数组中数加到cur上，并和max比较大小
                cur += Integer.parseInt(Str[i]);
                //若加上去的为负值，则cur<max
                max = Math.max(cur, max);
                cur = cur < 0 ? 0 : cur;//判断cur是否小于0，true则=0，false=cur。
            }
            System.out.println(max);
        }
    }
}