import java.util.Scanner;
import java.util.ArrayList;
public class FCFS{
    public static void main(String[]arg){
        Scanner sc = new Scanner (System.in);
        ArrayList<Float> arrival = new ArrayList<Float>();
        ArrayList<Float> execute = new ArrayList<Float>();
        int count = 0;
        System.out.println("Enter the details of the processes after entering press 0 to exit else press 1");
        while(true){
            int n = sc.nextInt();
            if(n==0)break;
            System.out.println("Process Number:"+count+"\n Arrival Time");
            arrival.add(sc.nextFloat());
            System.out.println("Execute Time");
            execute.add(sc.nextFloat());
            count++;
        }
        ArrayList<Float> process= new ArrayList<>();
        process = (ArrayList)arrival.clone();
        float serviceTime = 0;
        float waitingTime ;
        while(!arrival.isEmpty()){
            float x = min(arrival);
            int minIndex = arrival.indexOf(x);
            System.out.println("Process :"+process.indexOf(x));
            if(arrival.get(minIndex)<=serviceTime){
                
                waitingTime = serviceTime-arrival.get(minIndex);
                System.out.print("Waiting Time ="+waitingTime +"\t");
                serviceTime+=execute.get(minIndex);
                System.out.print("Turn Around Time ="+(waitingTime+execute.get(minIndex)) +"\t");
                arrival.remove(minIndex);
                execute.remove(minIndex);

            }
            else{
                serviceTime = arrival.get(minIndex);
                waitingTime = 0;
                System.out.print("Waiting Time ="+waitingTime +"\t");
                //System.out.println("Service time of process "+ minIndex+"= "+serviceTime);
                System.out.print("Turn Around Time ="+(waitingTime+execute.get(minIndex)) +"\t");
                arrival.remove(minIndex);
                serviceTime = serviceTime + execute.get(minIndex);
                execute.remove(minIndex);
            }
            System.out.println();
        }
    }
    public static float min(ArrayList<Float> list){
        float min = list.get(0);

        for(Float i: list) {
                if(i < min) min = i;
            }
            return min;
    }
}