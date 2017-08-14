import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,temp,value;
        int a[]=new int[1200];
        for(i=0;i<=1200-1;i++)
        {
            a[i]=s.nextInt();
        }
        final long startTime=System.nanoTime();
       for( i=1;i<=1200-1;i++)
       {
           value=a[i];
           temp=i;
           while(temp>0&&a[temp-1]>value)
           {
               a[temp]=a[temp-1];
               temp=temp-1;
           }
           a[temp]=value;
       }
       final long endTime=System.nanoTime();
       
        for(i=0;i<=1200-1;i++)
            System.out.println(" "+a[i]);
        System.out.println("time cost ="+(endTime-startTime));
    }
    
}
