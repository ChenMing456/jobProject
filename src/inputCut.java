import java.util.Scanner;

/**
 * Created by С�� on 2017/8/21.
 * * ����2����n,m, result=result+k*5+m,���kֵ
 */
public class inputCut {
    public static void main(String[] args) {
        int result=0;

        Scanner scanner1=new Scanner(System.in);
        int n=scanner1.nextInt();


        Scanner scanner2=new Scanner(System.in);
        int m=scanner2.nextInt();
        int k;
        for( k=1;k<=n&&result<=240;k++){
            if(n>=1&&n<=10&&m>=1&&m<=240){
                result=result+k*5+m;
            }
            else {System.out.println("�������");}

        }
        System.out.println(k);
    }
}
