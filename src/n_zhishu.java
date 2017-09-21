/*
 * Created by 小陈 on 2017/8/31.
 * 输入一个数n，输出第n个质数。
 * 质数：除了1和它本身，不在有其他因数。
 */
import java.util.Scanner;
public class n_zhishu {
        private static  int NthPrime(int n){
            int i = 2, j = 1;
            while (true) {
                j = j + 1;
                if (j > i / j) {
                    n--;
                    if (n == 0)
                        break;
                    j = 1;
                }
                if (i % j == 0) {
                    i++;
                    j = 1;
                }
            }
            return i;
        }

        public static void main(String[] args) {
            System.out.print("请输入N的值:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result = NthPrime(n);
            System.out.println("第N个素数的值是:"+result);
        }

    }

