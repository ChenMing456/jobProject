/*
 * Created by С�� on 2017/8/26.
 *
 *�����е��Ӵ�����
 * �������룺20 -10 2 -1 5
 *     ����Ӵ����ͣ�27
 */
import java.util.*;
public class max_sub_add {
    public static void main(String[] args) {
        //��������
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String in_put = scan.nextLine();
            //���������д�������str[].
            String[] Str = in_put.split(" ");
            //MIN_VALUE  ֵΪ ��231 �ĳ���������ʾ int �����ܹ���ʾ����Сֵ��
            int max = Integer.MIN_VALUE;  //��max��ʼֵ��Ϊ��ֵ�Ľ���ֵ��
            int cur = 0;
            for (int i = 0; i < Str.length; i++) {
                // ���������������ӵ�cur�ϣ�����max�Ƚϴ�С
                cur += Integer.parseInt(Str[i]);
                //������ȥ��Ϊ��ֵ����cur<max
                max = Math.max(cur, max);
                cur = cur < 0 ? 0 : cur;//�ж�cur�Ƿ�С��0��true��=0��false=cur��
            }
            System.out.println(max);
        }
    }
}