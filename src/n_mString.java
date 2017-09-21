/*
 * Created by 小陈 on 2017/9/1.
 * 输入n ,以及n个字符串，m，以及m个字符串，并将相同的字符串去掉。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class n_mString {
    //定义restStrs，输入m，n，以及2个字符串数组。将相同的字符串去除。
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
        //对集合排序，可以按照字母顺序输出。
        Collections.sort(rest);
        return rest;
    }

    public static void main(String args[]) {
        Scanner scan1=new Scanner(System.in);
        //因为输入的有数字和字符串，所以都使用nextLine，再将数字Integer.parseInt
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
