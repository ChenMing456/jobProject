/*
 * Created by 小陈 on 2017/9/5.
 * 假设一个数组有n个数，设置一个target。从中选择3个数，使他们的和sum最接近target。
 * For example, given array S = {-1 2 1 -4}, and target = 1.
   The sum that is closest to the target is 2. because:(-1 + 2 + 1 = 2).
 */
import java.util.Arrays;
public class sum_closest {
    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
