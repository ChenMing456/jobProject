/*
 * Created by С�� on 2017/9/20.
 * ������Ӵ��ĳ��ȣ���ȷ���-1
 */
import java.util.Scanner;

public class The_longest_substring {
    /*������������������ʵ����ĿҪ��Ĺ���
    ��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^
    ******************************��ʼд����******************************/
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

            //����㣺min�Ӵ��ĳ��ȣ�����󳤶ȿ�ʼ
            for (int i = min.length(); i >= 1; i--) {
                //��������Ϊi��min�Ӵ�����0��ʼ
                for (int j = 0; j <= min.length() - i; j++) {
                    target = min.substring(j, j + i);
                    //��������Ϊi��max�Ӵ����ж��Ƿ���target�Ӵ���ͬ����0��ʼ
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

    /******************************����д����******************************/


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
