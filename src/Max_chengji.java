import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Created by С�� on 2017/9/1.
 * ���������У���������0���������3�����ĳǼ����ֵ
 * ˼·��ֻ��2�������1��3����Ϊ����ȡ����3������2��2������1��������ȡ��С��2������������һ������
 */
public class Max_chengji {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        //��Ϊ���볤�Ȳ�ȷ�������Բ������飬�ü������洢��������ݣ��ȴ�Ϊ�ַ������ٱ�Ϊ����
        List<Integer> arr = new ArrayList<>();
        String[] s1 = str.split(" ");//�˴��޸ķָ�������
        for (int i = 0; i < s1.length; i++) {
            arr.add(Integer.valueOf(s1[i]));
        }
//        System.out.println(arr);
        Collections.sort(arr);
        int last = arr.size() - 1;
        long max1 = arr.get(0) * arr.get(1) * (long) arr.get(last);
        long max2 = arr.get(last - 2) * arr.get(last - 1) * (long) arr.get(last);
        //�Ƚ�2������У��ϴ�ĳ˻������
        if (max2 < max1) max2 = max1;
        System.out.println(max2);
    }

}
