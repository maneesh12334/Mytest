import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
       int i,j,temp=0;
        Scanner s=new Scanner(System.in);
        int a[]=new int[1200];
        for(i=0;i<1200;i++)
        {
            a[i]=s.nextInt();
        }
        final long startTime=System.nanoTime();
       for(i=0;i<1200;i++)
        {
            for(j=0;j<1200-1;j++)
            {
                if(a[j]>a[j+1]){
                   temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
             }
    }   
        }
           final long endTime=System.nanoTime();
    for(i=0;i<1200;i++)
    System.out.println(" "+a[i]);
    System.out.println("time cost="+(endTime-startTime));
    }
    }
