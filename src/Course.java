/*
 * Created by 小陈 on 2017/9/16.
 * 第一个数字表示开课时间，开课时间用2位数表示，前一位用0到4表示周一至周五，后一位用0到9表示从早到晚顺序第几讲课，如12表示礼拜二第三讲课。01表示礼拜一第二讲课。
每行第二个数字表示课程代码，如：204521。课程代码为6位数字。输入课程代码均不重复。
样例输入
5
01 204521
23 204523
22 204526
01 204528
22 204527
输出冲突的课程：（若无冲突，输出YES）
01 204521 204528
22 204526 204527
 */
import java.util.*;
public class Course {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n*2];
        for(int i=0;i<n*2;i++){
            a[i]=in.nextInt();
        }
        int j=0;
        TreeSet<Integer>set=new TreeSet<>();
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        while(j<a.length){
            ArrayList<Integer>list=new ArrayList<>();
            if(map.containsKey(a[j])){
                map.get(a[j]).add(a[j+1]);
            }else{
                list.add(a[j+1]);
                map.put(a[j],list);
                set.add(a[j]);

            }
            j=j+2;
        }
        int count=0;
        for(int i:set){
            if(map.get(i).size()>1){
                count++;
                if(i==1){
                    System.out.print("0"+i+" ");
                    for(int j1=0;j1<map.get(i).size();j1++){

                        if(j1==map.get(i).size()-1){
                            System.out.println(map.get(i).get(j1));
                        }else{
                            System.out.print(map.get(i).get(j1)+" ");}

                    }
                }else{
                    System.out.print(i+" ");
                    for(int j1=0;j1<map.get(i).size();j1++){

                        if(j1==map.get(i).size()-1){
                            System.out.println(map.get(i).get(j1));
                        }else{
                            System.out.print(map.get(i).get(j1)+" ");}
                    }
                }
            }
        }
        if(count==0){
            System.out.println("YES");
        }


    }
}