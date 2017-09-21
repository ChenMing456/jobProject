import java.util.*;

/*问题：总共有n道菜，m个范式（规定【a，b】中，b必须在a的前面）
 * Created by 小陈 on 2017/9/13.
 * 输入序列：4 4  （n，m）
 *           1 0
 *           2 0
 *           3 1
 *           3 2
 *       输出：0,1,2,3
 */
public class food_List {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        String s1=scanner1.nextLine();
        String a1[]=s1.split(" ");
        int n=Integer.parseInt(a1[0]);
        int m=Integer.parseInt(a1[1]);
//        System.out.println(n);
//        System.out.println(m);
        Scanner scanner2=new Scanner(System.in);
        String s2=scanner2.nextLine();
        String a2[]=s2.split(" ");
        String restult[]={a2[1],a2[0]};
        List<String> list=Arrays.asList(restult);
        List arrayList = new ArrayList(list);

        Scanner scanner3=new Scanner(System.in);
        for(int i=1;i<m;i++){
            String s=scanner3.nextLine();
            String a[]=s.split(" ");
                if(arrayList.contains(a[1])&&(!arrayList.contains(a[0]))){arrayList.add(a[0]);}
                else if(arrayList.contains(a[0])&&(!arrayList.contains(a[1]))){
                    arrayList.add(0,a[1]);
                }
                else if(arrayList.contains(a[0])&&arrayList.contains(a[1])){
                    arrayList=arrayList;
                }
                else {
                    arrayList.add(a[1]);
                    arrayList.add(a[0]);
                }
        }

        for(int k=0;k<arrayList.size();k++)
        {
            System.out.print(arrayList.get(k)+",");}
    }
}
