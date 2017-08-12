// this is only for 4 process 
import java.util.*;
public class SJF {
    public static void main(String[] args) {
        System.out.println("enter number process");
        int n,temp=0;
         Scanner s=new Scanner(System.in);
          n=s.nextInt();
        int at[]=new int[n];
        int pt[]=new int[n]; 
        int bt[]=new int[n];
        int wt[]=new int[n];
        int tat[]=new int[n];
       System.out.println("enter arrivel time");
       for(int i=0;i<n;i++)
       {
           at[i]=s.nextInt();
         pt[i]=i;
       }
       System.out.println("enter burst time");
       for(int i=0;i<n;i++)
       {
           bt[i]=s.nextInt();
       }
       for(int i = 0; i < n; i++)
        System.out.println(bt[i]);
//sort using bubble sort
       for(int i=0;i<n-2;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(at[j+1]<at[j])
               {
//swap
                   temp=at[j+1];
           at[j+1]=at[j];
           at[j]=temp;
           int te=bt[j];
           bt[j]=bt[j+1];
           bt[j+1]=te;
           int tm=pt[j+1];
           pt[j+1]=pt[j];
           pt[j]=tm;
               }
       }
       }
       for(int i=0;i<n;i++)
       {
          System.out.println(at[i]+" "+bt[i]);
       } 
       for(int i=0;i<n;i++)
       {
       if( i==0)
       {
           wt[0]=0;
            tat[0]=bt[0];
       }
       else
              {
                  for(i=1;i<n-1;i++)
                  {
                 if(at[i]-at[i-1]>bt[i-1])
                {
          wt[i]=0;
          tat[i]=bt[i];
      }
      else 
      {        
          if(bt[i+1]<bt[i])
          {
              wt[i+1]=wt[i-1]+bt[i-1]-(at[i+1]-at[i-1]);       //waiting time
              tat[i+1]=wt[i+1]+bt[i+1];                       //turnaround time
              wt[i]=wt[i+1]+bt[i+1]-(at[i]-at[i+1]);
              tat[i]=wt[i]+bt[i];
          }
              }
          }
       }}
       for(int i=0;i<n;i++)
       {
       System.out.println(pt[i]+"\t"+at[i]+"\t"+bt[i]+"\t"+wt[i]+"\t"+tat[i]);
    }
    }}
	
