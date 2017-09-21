import java.util.Random;
/**
 * Created by 6248068 on 2016/12/14.
 */
public class QuickSort {
// 一趟快速排序，使数组前半部分小于key，后半部分大于key
    public static  int  Partition(int [] array,int low,int high){
        int key=array[low];
        while(low<high){
            while(low<high&&array[high]>=key) high--;
            array[low]=array[high];
            while(low<high&&array[low]<=key) low++;
            array[high]=array[low];
        }
        array[low]=key;
        return low;
    }

    public static  int [] QuickSort(int [] array,int low,int high){
        if(low>=high)return array;
        int key=Partition(array,low,high);
        QuickSort(array,low,key-1);
        QuickSort(array,key+1,high);
        return array;
    }

    public static void main(String [] args){
       Random r = new Random();
        int n=10;
        int[] score= new int[n];
        System .out .println("原始数据：");
       for(int i=0;i<n;i++) {
           score[i] = r.nextInt(10);
           System .out .print(score [i]+",") ;
       }
       System .out .println();
        System .out .println("排序结果：");
        QuickSort s=new QuickSort() ;
        s.QuickSort(score ,0,n-1) ;
        for(int i=0;i<n;i++) {
            System .out .print(score [i]+",") ;
        }
   }

}
