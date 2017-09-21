/*
 * Created by 小陈 on 2017/8/26.
 *找出序列中的第k大数
 * 例输入{ 1 50 20 30}  第2大数为：30
 */
import java.util.*;

public class k_max {
    public static void main(String[] args) {
        //输入序列
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();  //先输入一行
        String[] a = str.split(" ");
        int[] b = new int[a.length];  //将b[]设为a[]的副本，对b排序
        try{
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.valueOf(a[i]);
            }
        }catch(NumberFormatException e){
            throw new RuntimeException("输入格式不正确！必须是数字");
        }
        int i = scan.nextInt(); //再输入一个k值
        Arrays.sort(b);
        System.out.println(b[b.length - i]);//对应下标-1
    }

}