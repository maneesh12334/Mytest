import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int i,j,temp;
        Scanner s=new Scanner(System.in);
        int a[]=new int[1200];
        for(i=0;i<1200;i++)
        {
            a[i]=s.nextInt();
        }
        final long startTime=System.nanoTime();
            for(i=0;i<1200-1;i++)
            {
                int imin=i;
                for(j=i+1;j<1200;j++)
                {
                    if(a[j]<a[imin])
                    {
                        imin=j;
                    }
                    
                }
                temp = a[imin];
                a[imin] = a[i];
                a[i] = temp;
            }
            final long endTime=System.nanoTime();
                for(i=0;i<1200;i++){
                    System.out.println(" "+a[i]);
                      System.out.println("time cost="+(endTime-startTime));
                }
            }
}
