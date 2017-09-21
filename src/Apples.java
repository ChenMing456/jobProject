/*
 * Created by Ð¡³Â on 2017/9/1.
 */
import java.util.Scanner;
public class Apples {
    public static int getMostApple(int n,int k,int[] apples,int[][] edges){
        int mostApples=0;
        int appleNum;
        for (int i=0;i<k;i++){
            appleNum=0;
            boolean[] visited=new boolean[n];
            dfs(n,edges,apples[i],visited);
            for(int j=0;j<k;j++){
                if (visited[apples[j]])
                    appleNum++;
            }
            if (appleNum>mostApples)
                mostApples=appleNum;
        }

        return mostApples;
    }

    public static void dfs(int n,int[][] edges, int temp,boolean[] visited){
        visited[temp]=true;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if (flag)
                return;
            if (edges[temp][i]==1&&!visited[i]){
                flag=true;
                dfs(n,edges,i,visited);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in

        );
        String firstLine=sc.nextLine();
        String[] firstStrs=firstLine.split(",");
        int n=Integer.parseInt(firstStrs[0]);
        int k=Integer.parseInt(firstStrs[1]);

        String secondLine=sc.nextLine();
        String[] secondStrs=secondLine.substring(1,secondLine.length()-2).split(",");
        int[] apples=new int[k];
        for (int i=0;i<k;i++){
            apples[i]=Integer.parseInt(secondStrs[i])-1;
        }

        String thirdLine =sc.nextLine();
        String[] thirdStrs=thirdLine.substring(1,thirdLine.length()-1).split(",");
        int[][] edges=new int[n][n];
        for (int i=0;i<thirdStrs.length;i++){
            int edgeStart=Integer.parseInt(thirdStrs[i++].substring(1,2))-1;
            int edgeEnd=Integer.parseInt(thirdStrs[i].substring(0,1))-1;
            edges[edgeStart][edgeEnd]=1;
            edges[edgeEnd][edgeStart]=1;
        }

        System.out.println(getMostApple(n,k,apples,edges));
    }

}
