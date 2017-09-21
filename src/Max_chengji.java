import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Created by 小陈 on 2017/9/1.
 * 输入数组有：正、负、0，求输出的3个数的城际最大值
 * 思路：只有2种情况：1）3个数为正，取最大的3个数；2）2个负数1个正数，取最小的2个负数和最大的一个正数
 */
public class Max_chengji {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        //因为输入长度不确定，所以不用数组，用集合来存储输入的数据，先存为字符串，再变为数字
        List<Integer> arr = new ArrayList<>();
        String[] s1 = str.split(" ");//此处修改分隔符类型
        for (int i = 0; i < s1.length; i++) {
            arr.add(Integer.valueOf(s1[i]));
        }
//        System.out.println(arr);
        Collections.sort(arr);
        int last = arr.size() - 1;
        long max1 = arr.get(0) * arr.get(1) * (long) arr.get(last);
        long max2 = arr.get(last - 2) * arr.get(last - 1) * (long) arr.get(last);
        //比较2种情况中，较大的乘积。输出
        if (max2 < max1) max2 = max1;
        System.out.println(max2);
    }

}
