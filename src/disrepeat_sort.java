/*
 * Created by С�� on 2017/8/21.
 * ����n��������a[n],ȥ������a����ͬ�����֣�����С��������
 */
import java.util.*;
public class disrepeat_sort{
    public static void main(String[] args){
        Scanner inPut=new Scanner(System.in);
        int n=inPut.nextInt();
        int[]b=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            b[i]=inPut.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(b[i]==b[j]&&i!=j){
                    b[j]=0;
                }else{ j++;}
            }
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(b[i]!=0){
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++){
            if(b[i]!=0){
                if(i!=n-1){
                    System.out.print(b[i]+" ");
                }else{System.out.print(b[i]); }
            }
        }

    }
}
