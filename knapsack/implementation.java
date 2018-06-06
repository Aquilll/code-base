import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class implementation{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //total profit p
        Double p = 0.0;
        //enter knapsack size
        Double m = scan.nextDouble();
        //enter object size
        int size = scan.nextInt();

        Vector<knapSack> model = new Vector<>();
        //knapSack[] model = new knapSack[size];
        for(int i = 0; i < size; i++){
            Double a = scan.nextDouble();
            Double b = scan.nextDouble();
            model.add(new  knapSack(a, b, a/b));
            //model[i] = new  knapSack(a, b, a/b);
        }
//        for(int i = 0; i < size; i++)
//        System.out.println(model.get(i)+" ");

        Collections.sort(model, new Comparator<knapSack>() {
            @Override
            public int compare(knapSack o1, knapSack o2) {
                if(o1.getRatio() > o2.getRatio())
                    return -1;
                else if(o1.getRatio() < o2.getRatio())
                    return 1;
                else
                return 0;
            }
        });

        for(int i = 0; i < size; i++)
            System.out.println(model.get(i)+" ");

        System.out.println();

        int i = 0;
        for(i = 0; i < size; i++){
            if(m > 0 && model.get(i).getWeight() <= m){
                m = m - model.get(i).getWeight();
                p = p + model.get(i).getProfit();
            }
            else break;
               
        }

        if(m > 0)
            p = p + (model.get(i).getProfit()*m / model.get(i).getWeight());

        System.out.println("total maximum profit "+ p);
   }

}
