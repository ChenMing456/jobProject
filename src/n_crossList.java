/*
 * Created by 小陈 on 2017/9/1.
 * 输出最长的交叉序列01010....，输入一个n长的父序列11001100，输出最长子序列长度m。
 */
import java.util.*;

public class n_crossList {
    public static int maxLength(int n,int[] nums){
        if (n<=1)
            return n;
        int maxLength=1;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=temp){
                maxLength++;
                temp=nums[i];
            }
        }

        return maxLength;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(maxLength(n,nums));
    }


}
