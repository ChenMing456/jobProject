/*
 * Created by С�� on 2017/9/16.
 */
import java.util.Arrays;
/**
 * ð������
 * @author mmz
 *
 */
public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        int temp;//����һ����ʱ����
        for(int i=0;i<arr.length-1;i++){//ð������
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,6,2,2,5};
        BubbleSort.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        //���������������Ԫ��
        for(int num:arr){
          System.out.print(num+" ");
          }
    }
}