/*
 * Created by С�� on 2017/9/1.
 * ����n ,�Լ�n���ַ�����m���Լ�m���ַ�����������ͬ���ַ���ȥ����
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class n_mString {
    //����restStrs������m��n���Լ�2���ַ������顣����ͬ���ַ���ȥ����
    public static List<String> restStrs(int m, String[] orginalStrs, int n, String[] clickStrs){
        List<String> rest=new ArrayList<>();
        for(int i=0;i<m;i++){
            rest.add(orginalStrs[i]);
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<rest.size();j++){
                if(clickStrs[i].equals(rest.get(j))){
                    rest.remove(j);
                    break;
                }
            }
        }
        //�Լ������򣬿��԰�����ĸ˳�������
        Collections.sort(rest);
        return rest;
    }

    public static void main(String args[]) {
        Scanner scan1=new Scanner(System.in);
        //��Ϊ����������ֺ��ַ��������Զ�ʹ��nextLine���ٽ�����Integer.parseInt
        int m=Integer.parseInt(scan1.nextLine());

        String orginalStrs[] = new String[m];
        for (int i = 0; i < m; i++) {
            orginalStrs[i]=scan1.nextLine();
        }

        int n=Integer.parseInt(scan1.nextLine());
        String clickStrs[] = new String[n];
        for(int i = 0; i < n; i++) {
            clickStrs[i]=scan1.nextLine();
        }

        List<String> restStrs=restStrs(m,orginalStrs,n,clickStrs);
        for(int i = 0; i < restStrs.size(); i++) {
            System.out.println(restStrs.get(i));
        }
    }
}
