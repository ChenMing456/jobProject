/*
 * Created by С�� on 2017/8/26.
 *�ҳ������еĵ�k����
 * ������{ 1 50 20 30}  ��2����Ϊ��30
 */
import java.util.*;

public class k_max {
    public static void main(String[] args) {
        //��������
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();  //������һ��
        String[] a = str.split(" ");
        int[] b = new int[a.length];  //��b[]��Ϊa[]�ĸ�������b����
        try{
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.valueOf(a[i]);
            }
        }catch(NumberFormatException e){
            throw new RuntimeException("�����ʽ����ȷ������������");
        }
        int i = scan.nextInt(); //������һ��kֵ
        Arrays.sort(b);
        System.out.println(b[b.length - i]);//��Ӧ�±�-1
    }

}