/*
 * Created by С�� on 2017/9/16.
 * ��һ�����ֱ�ʾ����ʱ�䣬����ʱ����2λ����ʾ��ǰһλ��0��4��ʾ��һ�����壬��һλ��0��9��ʾ���絽��˳��ڼ����Σ���12��ʾ��ݶ��������Ρ�01��ʾ���һ�ڶ����Ρ�
ÿ�еڶ������ֱ�ʾ�γ̴��룬�磺204521���γ̴���Ϊ6λ���֡�����γ̴�������ظ���
��������
5
01 204521
23 204523
22 204526
01 204528
22 204527
�����ͻ�Ŀγ̣������޳�ͻ�����YES��
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