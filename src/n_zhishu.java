/*
 * Created by С�� on 2017/8/31.
 * ����һ����n�������n��������
 * ����������1������������������������
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
            System.out.print("������N��ֵ:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result = NthPrime(n);
            System.out.println("��N��������ֵ��:"+result);
        }

    }

